package level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/


public class Solution
{
    public static void main(String[] args)
    {
        Human gfather1 = new Human("DedVasya", true, 60, null, null);
        Human gfather2 = new Human("DedGena", true, 60, null, null);
        Human gmother1 = new Human("BabkaMasha", false, 60, null, null);
        Human gmother2 = new Human("BabkaDura", false, 60, null, null);
        Human father = new Human("FatherBatya", true, 40, gfather1, gmother1);
        Human mother = new Human("MamaMama", false, 40, gfather2, gmother2);
        Human son1 = new Human("SonNarkoman", true, 20, father, mother);
        Human son2 = new Human("SinNarkoman2", true, 20, father, mother);
        Human son3 = new Human("SinNarkoman3", true, 20, father, mother);

        System.out.println(gfather1);
        System.out.println(gfather2);
        System.out.println(gmother1);
        System.out.println(gmother2);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(son3);
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private Human mother;
        private Human father;

        public Human(String name, boolean sex, int age, Human mother, Human father)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
