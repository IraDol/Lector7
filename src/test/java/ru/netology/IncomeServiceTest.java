package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IncomeServiceTest {

    @org.junit.jupiter.api.Test
    public void shouldNoIncome() {      //созд тест-кейс, когда например 2 года
   IncomeService service = new IncomeService();  //созд сервис

        int age = 2;
        int actual = service.calcIncome(age);  //говорим какой будет актуальный доход
   int expected = 0;      //ОР ноль, т к в 2 года доходов нет по первому условию в методе
   assertEquals(actual, expected);
    }
    @Test //второй тест на третье условие
    public void shouldGetSalary(){
        IncomeService service = new IncomeService();

        int age = 50;
        int actual = service.calcIncome(age);
        int expected = 50_000;
        assertEquals(actual, expected);
    }
}