package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        HashMap<String, Cat> cats = new HashMap<>();
        cats.put("Vasya", new Cat("Vasya"));
        cats.put("Fedya", new Cat("Fedya"));
        cats.put("Kolya", new Cat("Kolya"));
        cats.put("Gena", new Cat("Gena"));
        cats.put("Olya", new Cat("Olya"));
        cats.put("Nasya", new Cat("Nasya"));
        cats.put("Alina", new Cat("Alina"));
        cats.put("Vasilisa", new Cat("Vasilisa"));
        cats.put("Evlampiya", new Cat("Evlampiya"));
        cats.put("Murzik", new Cat("Murzik"));
        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        HashSet<Cat> catsset = new HashSet<Cat>();

        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            catsset.add(pair.getValue());
        }
        return catsset;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
