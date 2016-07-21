package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и
завершить программу.  -1 должно учитываться в сумме.
*/

// ОДИН ХРЕН НЕ ПРОШЛА ТЕСТИРОВАНИЕ ;)
// Тест

public class Solution
{
    public static void main(String[] args)   throws Exception {

        double sum = 0;
        // Эта строчка тебе не понпдобиться
        boolean exit = false;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        do
        {
            try
            {
                // Эту строчку нужно вынести за try catch блон поскольку она не бросает исключение
                String s = reader.readLine();

                // Достаточно один раз преобразовать строку в число
                // присвоить это значение переменной number типа double
                // потомучто операция преобразования строки в число выполняется долго и нет смысла делать ее дважды
                // Переменную в которую ты будешь записывать число нужно вынести за пределы блока try и присвоить ей значение 0
                // чтобы в случае ошибки она осталась равной 0
                // потомучто она тебе понадобиться при проверке условия цикла
                sum += Double.parseDouble(s);
                // Собственно эта строчка будет не нужна а  Double.parseDouble(s) != -1 перенесется в цикл
                exit = Double.parseDouble(s) != -1;
            }
            catch (NumberFormatException e){
                System.out.println("Неверный ввод, введите число.");
            }
        }
        while (!exit); // Сюда нельзя вставить проверку равно ли -1 значение Double.parseDouble(s), поэтому оставил переменную exit

        System.out.println(sum);
    }
}
