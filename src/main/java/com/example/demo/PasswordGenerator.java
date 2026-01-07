package com.example.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
public class PasswordGenerator {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "benspassword";
        String encodedPassword = encoder.encode(rawPassword);
        System.out.println(encodedPassword);
        // $2a$10$c6bSeWPhg06xB1lvmaWNNe4NROmZiSpYhlocU/98HNr2MhIOiSt36
    }
}
