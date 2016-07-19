package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> mapA = createMap();
        System.out.println(getCountTheSameFirstName(mapA, "Иван"));
        System.out.println(getCountTheSameFirstName(mapA, "Петров"));
    }

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("Иван", "Петров");
        map.put("Евгений", "Иванов");
        map.put("Петр", "Петров");
        map.put("Александр", "Иванов");
        map.put("dsd", "Захаров");
        map.put("Федя", "Конотоп");
        map.put("dsdsw", "Петров");
        map.put("Колян", "Колян");
        map.put("Вася", "Федоров");
        map.put("Игорь", "Петров");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;

        for (String str: map.values())
        {
            if (str.equals(name))
                count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count = 0;
        for (String str: map.keySet())
        {
            if (str.equals(lastName))
                count++;
        }
        return count;
    }
}
