package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);

        for (Map.Entry<String, String> pair: map.entrySet())
        {
            System.out.println(pair.getKey() + ":" + pair.getValue());
        }
    }
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов", "Федя");
        map.put("Петров", "Коля");
        map.put("Носков", "Федя");
        map.put("Васяков", "Вася");
        map.put("Казанцев", "Федя");
        map.put("Моряков", "Петя");
        map.put("Идиотов", "Федя");
        map.put("Потняков", "Федя");
        map.put("Найков", "Саша");
        map.put("Адидасов", "Петя");
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy = new HashMap<>(map);
        ArrayList<String> process = new ArrayList<>();

        for(Map.Entry<String, String> pair: map.entrySet())
        {
            String main = pair.getValue();
            int counter = 0;
            for(Map.Entry<String, String> pairCopy: copy.entrySet())
            {
                String copyValue = pairCopy.getValue();
                if (main.equals(copyValue))
                    counter++;
                if (counter > 1)
                    process.add(main);
            }
        }

        for (String s: process)
            removeItemFromMapByValue(map, s);
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
