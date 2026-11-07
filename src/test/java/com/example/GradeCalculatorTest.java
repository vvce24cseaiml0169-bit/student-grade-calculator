
package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GradeCalculatorTest {

    @Test
    void testGradeA() {
        assertEquals("A", GradeCalculator.calculateGrade(90));
    }

    @Test
    void testGradeB() {
        assertEquals("B", GradeCalculator.calculateGrade(80));
    }

    @Test
    void testGradeC() {
        assertEquals("C", GradeCalculator.calculateGrade(70));
    }

    @Test
    void testGradeD() {
        assertEquals("D", GradeCalculator.calculateGrade(60));
    }

    @Test
    void testGradeE() {
        assertEquals("E", GradeCalculator.calculateGrade(40));
    }

    @Test
    void testFail() {
        assertEquals("FAIL", GradeCalculator.calculateGrade(30));
    }
}
