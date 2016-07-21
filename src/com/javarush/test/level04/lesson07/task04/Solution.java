package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        String c1 = reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);

        int colPositive = 0;
        int colNegative = 0;

        if (a > 0) colPositive = colPositive + 1;
        if (b > 0) colPositive = colPositive + 1;
        if (c > 0) colPositive = colPositive + 1;

        if (a < 0) colNegative = colNegative + 1;
        if (b < 0) colNegative = colNegative + 1;
        if (c < 0) colNegative = colNegative + 1;

        System.out.println("количество отрицательных чисел: " + colNegative);
        System.out.println("количество положительных чисел: " + colPositive);


    }
}
