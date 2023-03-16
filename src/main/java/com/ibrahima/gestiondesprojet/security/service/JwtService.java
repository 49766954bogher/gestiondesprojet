package com.ibrahima.gestiondesprojet.security.service;

import com.ibrahima.gestiondesprojet.security.config.JwtUtils;
import com.ibrahima.gestiondesprojet.security.dao.UserDao;
import com.ibrahima.gestiondesprojet.security.entity.User;
import com.ibrahima.gestiondesprojet.security.entity.JwtRequest;
import com.ibrahima.gestiondesprojet.security.entity.JwtResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class JwtService implements UserDetailsService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private JwtUtils jwtUtils;
    private AuthenticationManager authenticationManager;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findById(username).get();

        if (user != null) {
            return new org.springframework.security.core.userdetails.User(
                    user.getUserName(), user.getUserPassword(), getAuthorities(user));

        } else {
            throw new UsernameNotFoundException("USERNAME IS NOT FOUND");

        }
    }

    private Set getAuthorities(User user) {
        Set authorities = new HashSet<>();
        user.getRoles().forEach(role -> {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getRoleName()));
        });
        return authorities;
    }

    public JwtResponse createJwtToken(JwtRequest jwtRequest) throws Exception {
        String userName = jwtRequest.getUserName();
        String userPassword = jwtRequest.getUserPassword();
        authenticateUser(userName, userPassword);
        UserDetails userDetails = loadUserByUsername(userName);
        String genetateToken = jwtUtils.generatedToken(userDetails);
        User user = userDao.findById(userName).get();
        return new JwtResponse(user, genetateToken);

    }


    public void authenticateUser(String username, String passsword) throws Exception {
        try {
            authenticationManager.authenticate(new
                    UsernamePasswordAuthenticationToken(username, passsword));
        } catch (DisabledException e) {
            throw new Exception("USER IS ENABLE");
        } catch (BadCredentialsException e) {

            throw new Exception("BAD CREDENTIAL FROM USER");
        }

    }

}
