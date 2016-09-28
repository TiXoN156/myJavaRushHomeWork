package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так,
 чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
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
        Human grandFather1 = new Human("Дед1", true, 65);
        Human grandFather2 = new Human("Дед2", true, 75);
        Human grandMother1 = new Human("Бабка1", false, 64);
        Human grandMother2 = new Human("Бабка2", false, 74);
        Human father = new Human("Папа", true, 40, grandFather1, grandMother1);
        Human mother = new Human("Мама", false, 35, grandFather2, grandMother2);
        Human child1 = new Human("Мальчик1", true, 18, father, mother);
        Human child2 = new Human("Девочка1", false, 15, father, mother);
        Human child3 = new Human("Девочка2", false, 10, father, mother);

        System.out.println(grandFather1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandMother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human
    {
        public String nameHuman;
        public boolean sexHuman;
        public int ageHuman;
        public Human fatherHuman;
        public Human motherHuman;

        Human(String name, boolean sex, int age)
        {
            this.nameHuman = name;
            this.sexHuman = sex;
            this.ageHuman = age;
        }

        Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.nameHuman = name;
            this.sexHuman = sex;
            this.ageHuman = age;
            this.fatherHuman = father;
            this.motherHuman = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.nameHuman;
            text += ", пол: " + (this.sexHuman ? "мужской" : "женский");
            text += ", возраст: " + this.ageHuman;

            if (this.fatherHuman != null)
                text += ", отец: " + this.fatherHuman.nameHuman;

            if (this.motherHuman != null)
                text += ", мать: " + this.motherHuman.nameHuman;

            return text;
        }
    }

}
