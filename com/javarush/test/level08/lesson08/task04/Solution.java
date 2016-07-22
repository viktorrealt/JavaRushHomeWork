package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
    }
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Arnold", new Date("JULY 2 1988"));
        map.put("Chan", new Date("DECEMBER 1 1999"));
        map.put("Shwarc", new Date("NOVEMBER 1 1999"));
        map.put("Eminem", new Date("DECEMBER 22 1921"));
        map.put("50 Cent", new Date("NOVEMBER 22 1921"));
        map.put("JayZ", new Date("DECEMBER 22 1921"));
        map.put("PDiddy", new Date("JULY 22 1921"));
        map.put("Rihanna", new Date("JULY 22 1921"));
        map.put("HuyVPalto", new Date("JULY 22 1921"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8)
            {
                iterator.remove();
            }
        }

    }
}
