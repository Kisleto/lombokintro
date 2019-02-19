package com.codecool;

import com.codecool.model.Student;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", "john@codecool.com", LocalDate.of(1987, 2, 12));

        printStudent(student);

        Student build = Student.builder()
                .email("new@codecool.com").
                        birthDate(LocalDate.of(1993, 10, 21))
                .build();
        printStudent(build);


    }

    private static void printStudent(Student student) {
        System.out.println(student);
        System.out.println(student.getBirthDate());
    }
}
