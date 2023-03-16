package com.ibrahima.gestiondesprojet.controller;

import com.ibrahima.gestiondesprojet.entity.Member;
import com.ibrahima.gestiondesprojet.entity.Task;
import com.ibrahima.gestiondesprojet.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
@CrossOrigin(origins = "*")

public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/getAll")
    public Iterable<Member> getTask() {
        return memberService.getAllMembers();
    }

    @DeleteMapping("/deleteMemberById/{id}")
    public void deleteTask(@PathVariable final Long id) {
        memberService.deleteMember(id);
    }

    @PutMapping("/addMember")
    public Member saveTask(@RequestBody Member member) {
        Member savedMember = memberService.createMember(member);
        return savedMember;
    }

    @PostMapping("/affectTaskForMember")
    public void affectTaskForMember(@PathVariable("memberName") String memberName, @PathVariable("projectName") String projectName) {
        memberService.affectTaskForMember(memberName, projectName);

    }

    @PostMapping("/addMemberToproject/{memberName}/{taskName}")
    public void addMemberToproject(@PathVariable("memberName") String memberName, @PathVariable("taskName") String taskName) {
        memberService.addMemberToproject(memberName, taskName);

    }
}
