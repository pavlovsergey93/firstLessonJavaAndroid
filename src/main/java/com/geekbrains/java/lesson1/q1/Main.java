package com.geekbrains.java.lesson1.q1;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // Целочисленные переменные
        byte byteValue = (byte) 10;
        short shortValue = (short) 120;
        int intValue = 100000;
        long longValue = 8000000000L;
        // Переменные с плавающей запятой
        float floatValue = 5.21f;
        double doubleValue = 15.247;
        // Символьная переменная
        char charValue1 = 's';
        char charValue2 = 'v';
        // Строковые переменные
        String name = "Сергей";
        // Логическая переменная
        boolean booleanValue1 = true;
        boolean booleanValue2 = false;

        // Вызов метода подсчета значения формулы: a*(b+(c/d))
        float resultFormula = formula(13.5f, -7.84f,125.78f,3.14f);
        System.out.println("3. Результат: " + resultFormula);

        // Сравнение суммы двух чисел с заданным диапазоном от 10 до 20 включительно
        int firstNumber = 15;
        int secondNumber = 18;
        booleanValue1 = comparison(firstNumber, secondNumber);
        System.out.println("4. " + booleanValue1);

        // Положительное/Отрицательное число
        int numb = 0;
        number(numb);

        // логическое возвращение задания 5
        System.out.println("6. " + numberBoolean(numb));

        // Вывести приветствие в консоль, переменная создана выше
        hello(name);

        // Является ли год високосным
        int year = 1500;
        leapYear(year);
    }
    public static float formula (float a,float b, float c, float d){
        return a*(b+(c/d));
    }
    public static boolean comparison (int a, int b){
        int sum = a+b;
        if (sum >= 10 && sum <=20)
            return true;
        else
            return false;
    }
    public static void number(int number){
        String str;
        if (number >= 0)
            str = "Число положительное";
        else
            str = "Число отрицательное";
        System.out.println("5. " + number + " - " + str);
    }
    public static boolean numberBoolean(int number){
        if (number < 0)
            return true;
        else
            return false;
    }
    public static void hello (String name){
        System.out.println("Привет, " + name + "!");
    }
    public static void leapYear (int year){
        String str;
        if(year % 4 == 0){
            if (year % 100 ==0 ) {
                if (year % 400 == 0)
                    str = "Год високосный";
                else
                    str = "Год не високосный";
            }
            else
                str = "Год високосный";
        }
        else
            str = "Год не високосный";
        System.out.println("8. " + str);
    }
}
