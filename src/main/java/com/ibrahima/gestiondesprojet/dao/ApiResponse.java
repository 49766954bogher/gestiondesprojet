package com.ibrahima.gestiondesprojet.dao;

import lombok.*;
@AllArgsConstructor
@NoArgsConstructor

@Data
public class ApiResponse<T> {
    int itemCount;
    T response;


}
