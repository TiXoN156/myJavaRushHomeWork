package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner number = new Scanner(System.in);
        int numb = number.nextInt();

        if(numb > 0)
            numb = numb *2;
        else
            numb = numb + 1;

        System.out.print(numb);

    }

}