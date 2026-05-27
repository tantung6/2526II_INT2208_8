package org.example;

public class Homework {

    public static String homeworkDecision(
            int age,
            double income,
            int creditScore,
            String employment) {

        if (employment == null ||
                (!employment.equals("C") && !employment.equals("F"))) {
            return "Invalid Input";
        }

        if (age < 18 || age > 65) {
            return "Invalid Input";
        }

        if (income < 5.0 || income > 500.0) {
            return "Invalid Input";
        }

        if (Math.round(income * 10) / 10.0 != income) {
            return "Invalid Input";
        }

        if (creditScore < 300 || creditScore > 850) {
            return "Invalid Input";
        }

        String risk;

        if (creditScore >= 300 && creditScore <= 500) {
            risk = "High";
        }
        else if (creditScore >= 501 && creditScore <= 700) {
            risk = "Medium";
        }
        else {
            risk = "Low";
        }

        if (risk.equals("High")) {
            return "REJECT";
        }

        if (income < 15.0) {

            if (employment.equals("F")) {
                return "REJECT";
            }

            if (risk.equals("Medium")) {
                return "REJECT";
            }

            return "MANUAL REVIEW";
        }

        if (employment.equals("C")) {
            return "APPROVE";
        }

        return "MANUAL REVIEW";
    }
}
