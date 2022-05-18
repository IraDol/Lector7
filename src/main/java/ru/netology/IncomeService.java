package ru.netology;
// Написать метод соотношению заработка и возраста: в детстве это карманные расходы, потом зп и пенсия

public class IncomeService {
    //созд метод, котрый принимает на вход возраст
    public int calcIncome(int age) {
        if (age < 5) {
            return 0;
        }
        if (age < 18) {
            return 1000;
        }
        if (age < 80) {
            return 50_000;
        }
        if (age >= 80) {
            return 20_000;
        }
        return -1;   //технически сюда никогда не дойдет, но чт джава не ругалась
    }
}
