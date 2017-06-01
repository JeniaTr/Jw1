package com.company;

import java.util.Random;

import java.util.UUID;

public class StudentZao extends Student {

    public String getName() {
        Student s = new Student();
        Random random = new Random();

        s.setName(String.valueOf(random.nextLong()));
        return s.getName();
    }
}
