package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и
завершить программу.  -1 должно учитываться в сумме.
*/

// ОДИН ХРЕН НЕ ПРОШЛА ТЕСТИРОВАНИЕ ;)

public class Solution
{
    public static void main(String[] args)   throws Exception {

        // Первое: idea подчеркивает summ правильнее будет sum

        double sum = 0;
        boolean exit = false;

        // Третье: ты создаешь reader в цикле постоянно (этого делать не нужно)
        // Правило все что можно вынести наружу цикла должно быть вынесео наружу

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Второе: сдесь лучше использовать цикл do {} while (Переделй с другим циклом)
        // При использование цикла do while эта запись перейдет в условие цикла и ты избавишься от лишней переменной
        //for (boolean exit = false; !exit; )

        do
        {
            try
            {
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

                sum += Double.parseDouble(s);
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
