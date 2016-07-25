 package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

 import java.util.ArrayList;

 public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> childrens = new ArrayList<>();
        ArrayList<Human> family = new ArrayList<>();
        ArrayList<Human> parrents = new ArrayList<>();

        childrens.add(new Human("Children1", false, 20));
        childrens.add(new Human("Children2", false, 20));
        childrens.add(new Human("Children3", false, 20));
        family.add(new Human("Mother", false, 40, childrens));
        family.add(new Human("Father", true, 40, childrens));
        parrents.add(new Human("Grandpa1", true, 60, family));
        parrents.add(new Human("Grandpa2", true, 60, family));
        parrents.add(new Human("Grandma1", false, 60, family));
        parrents.add(new Human("Grandma2", false, 60, family));

        family.addAll(childrens);
        family.addAll(parrents);

        for (Human s: family)
        {
            System.out.println(s);
        }

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();


        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> childrens)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.addAll(childrens);
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
