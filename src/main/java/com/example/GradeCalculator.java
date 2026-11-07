
package com.example;

public class GradeCalculator {

    public static String calculateGrade(int marks) {

        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else if (marks >= 40) {
            return "E";
        } else {
            return "FAIL";
        }
    }

    public static void main(String[] args) {

        int marks = 90;

        System.out.println("Student Marks: " + marks);
        System.out.println("Student Grade: " + calculateGrade(marks));
    }
}

