package ru.netology.javaqa.javaqamvn.services;

public class FreelanceServices {
    public static int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) { //отдыхаем
                count++;
                money = money - expenses;
                money = money/3;
                System.out.println("Месяц " + month + ". Можно отдыхать. Денег " + money + ". Заработано " + income + ". Потрачено " + expenses + ". Прокутил " + money/3);
            }
            else { //продолжаем работать
                money = money + income;
                money = money - expenses;
                System.out.println("Месяц " + month + ". Надо работац. Денег " + money + ". Заработано " + income + ". Потрачено " + expenses);
            }
        }
        return count;
    }
}
