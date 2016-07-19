package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и
завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception {
        // Первое: idea подчеркивает summ правильнее будет sum
        int summ = 0;

        // Второе: сдесь лучше использовать цикл do {} while (Переделй с другим циклом)
        for (boolean exit = false; !exit; ) {
            // Третье: ты создаешь reader в цикле постоянно (этого делать не нужно)
            // Правило все что можно вынести наружу цикла должно быть вынесео наружу
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            // Четвертое: Обрати внимание что произойдет в случае если ты введешь не корректное значение
            // произойдет исключение NumberFormatException и выполнение программы завершится
            // Всегда проверяй на корректность ввода используй try {} catch (NumberFormatException) {}
            // Две следующие строчки можно записать в виде одной
            // пример:
            // float b = Float.parseFloat("10.0");
            // sum = sum + b;
            // превратиться в
            // sum += Float.parseFloat("10.0");
            // старайся использовать запись a += b вместо a = a + b;
            int a = Integer.parseInt(s);
            summ = summ + a;

            // При использование цикла do while эта запись перейдет в условие цикла и ты избавишься от лишней переменной
            exit = a == -1;
        }

        System.out.println(summ);
    }
}
