package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        double sum = 0;
        double number = 0;
        boolean exit;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        do
        {
            String s = reader.readLine();
            exit = s.equals("сумма");
            try
            {
                number = Double.parseDouble(s);
                sum += number;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Неверный ввод, введите число.");
            }
        }
        while (!exit);

        System.out.println(sum);
    }

}
