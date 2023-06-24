package ru.netology.javaqa;

import ru.netology.javaqa.javaqamvn.services.FreelanceServices;

public class Main {
    public static void main(String[] args) {
        FreelanceServices FreelanceServices = new FreelanceServices();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int months = FreelanceServices.calculate(income, expenses, threshold);

        System.out.println("Месяцев отдыха: " + months);
    }
}