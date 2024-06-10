package ru.netology.ser

public class FreelancerService {
    public int

    void calculate(int income, int expenses, int threshold) {
        int money = 0;
        int counter = 0;

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                // отдых
                money -= expenses;
                money /= 3;
                counter++
            } else {
                // работа
                money += income;
                money -= expenses;
            }
        }
        return counter;

    }
}
