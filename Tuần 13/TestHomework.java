import org.example.Homework;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHomework {

    @org.junit.jupiter.api.Test
    void tc_01() {
        assertEquals(
                "Invalid Input",
                Homework.homeworkDecision(17, 275.0, 600, "C")
        );
    }

    @org.junit.jupiter.api.Test
    void tc_02() {
        assertEquals(
                "Invalid Input",
                Homework.homeworkDecision(66, 275.0, 600, "C")
        );
    }

    @org.junit.jupiter.api.Test
    void tc_03() {
        assertEquals(
                "Invalid Input",
                Homework.homeworkDecision(41, 4.9, 600, "C")
        );
    }

    @org.junit.jupiter.api.Test
    void tc_04() {
        assertEquals(
                "Invalid Input",
                Homework.homeworkDecision(41, 500.1, 600, "C")
        );
    }

    @org.junit.jupiter.api.Test
    void tc_05() {
        assertEquals(
                "Invalid Input",
                Homework.homeworkDecision(41, 275.0, 299, "C")
        );
    }

    @org.junit.jupiter.api.Test
    void tc_06() {
        assertEquals(
                "Invalid Input",
                Homework.homeworkDecision(41, 275.0, 851, "C")
        );
    }

    @org.junit.jupiter.api.Test
    void tc_07() {
        assertEquals(
                "Invalid Input",
                Homework.homeworkDecision(41, 275.0, 600, "X")
        );
    }

    @org.junit.jupiter.api.Test
    void tc_08() {
        assertEquals(
                "Invalid Input",
                Homework.homeworkDecision(41, 15.55, 600, "C")
        );
    }

    @org.junit.jupiter.api.Test
    void tc_09() {
        assertEquals(
                "REJECT",
                Homework.homeworkDecision(41, 14.9, 701, "F")
        );
    }

    @org.junit.jupiter.api.Test
    void tc_10() {
        assertEquals(
                "MANUAL REVIEW",
                Homework.homeworkDecision(41, 5.0, 850, "C")
        );
    }

    @org.junit.jupiter.api.Test
    void tc_11() {
        assertEquals(
                "MANUAL REVIEW",
                Homework.homeworkDecision(50, 15.0, 501, "F")
        );
    }

    @org.junit.jupiter.api.Test
    void tc_12() {
        assertEquals(
                "MANUAL REVIEW",
                Homework.homeworkDecision(50, 500.0, 850, "F")
        );
    }

    @org.junit.jupiter.api.Test
    void tc_13() {
        assertEquals(
                "REJECT",
                Homework.homeworkDecision(41, 14.9, 501, "C")
        );
    }

    @org.junit.jupiter.api.Test
    void tc_14() {
        assertEquals(
                "APPROVE",
                Homework.homeworkDecision(65, 275.0, 700, "C")
        );
    }

    @org.junit.jupiter.api.Test
    void tc_15() {
        assertEquals(
                "APPROVE",
                Homework.homeworkDecision(41, 500.0, 701, "C")
        );
    }

    @org.junit.jupiter.api.Test
    void tc_16() {
        assertEquals(
                "REJECT",
                Homework.homeworkDecision(18, 5.0, 300, "C")
        );
    }
}
