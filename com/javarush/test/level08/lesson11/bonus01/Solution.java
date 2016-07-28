package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        HashMap<Integer, String> year = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        returnMounth(year, month);

    }

    public static void returnMounth(HashMap<Integer, String> year, String month)
    {
        year.put(1, "January");
        year.put(2, "February");
        year.put(3, "March");
        year.put(4, "April");
        year.put(5, "May");
        year.put(6, "June");
        year.put(7, "July");
        year.put(8, "August");
        year.put(9, "September");
        year.put(10, "October");
        year.put(11, "November");
        year.put(12, "December");
        int result = 0;
        for (Map.Entry<Integer, String> pair : year.entrySet())
        {
            if (pair.getValue().equals(month))
                result = pair.getKey();
        }
        System.out.println(month + " is " + result + " month");

    }

}
