package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static int min2(int a, int b) {
        int min2;
        if(a < b)
            min2 = a;
        else
            min2 = b;
        return min2;
    }

    public static int max2(int a, int b){
        int max2;
        if(a > b)
            max2 = a;
        else
            max2 = b;
        return max2;
    }
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        String c1 = reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);

        int min, max;
        int mid = 0;

        min = Solution.min2(Solution.min2(a, b), c);
        max = Solution.max2(Solution.max2(a, b), c);

        if(a != min && a != max)
            mid = a;
        if(b != min && b != max)
            mid = b;
        if(c != min && c != max)
            mid = c;

        System.out.print(max + " " + mid + " " + min);







    }
}
