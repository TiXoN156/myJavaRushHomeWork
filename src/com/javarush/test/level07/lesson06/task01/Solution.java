package com.javarush.test.level07.lesson06.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("ваcя");
        list.add("ваcя2");
        list.add("ваcя3");
        list.add("ваcя4");
        list.add("ваcя5");

        System.out.println(list.size());

        for (int j = 0; j < list.size(); j++)
            System.out.println(list.get(j));

    }
}
