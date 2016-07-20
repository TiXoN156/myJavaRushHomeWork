package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sa = reader.readLine();
        String sb = reader.readLine();
        String sc = reader.readLine();
        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);
        int c = Integer.parseInt(sc);

        int mid = 0;

        if ((a < b && a > c) || (a > b && a < c))
            mid = a;

        if ((b < a && b > c) || (b > a && b < c))
            mid = b;

        if ((c < a && c > b) || (c > a && c < b))
            mid = c;

        System.out.println(mid);




    }
}
