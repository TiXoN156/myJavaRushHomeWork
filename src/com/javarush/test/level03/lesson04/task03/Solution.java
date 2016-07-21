package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zerg1 = new Zerg();
        zerg1.name = "Вася";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Федя";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Гриша";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Жора";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Игорь";
        Zerg zerg6 = new Zerg();
        zerg6.name = "Андрей";
        Zerg zerg7 = new Zerg();
        zerg7.name = "Толик";
        Zerg zerg8 = new Zerg();
        zerg8.name = "Костя";
        Zerg zerg9 = new Zerg();
        zerg9.name = "Саша";
        Zerg zerg10 = new Zerg();
        zerg10.name =  "Витя";
        Protos protos1 = new Protos();
        protos1.name = "Тихон";
        Protos protos2 = new Protos();
        protos2.name = "Джон";
        Protos protos3 = new Protos();
        protos3.name = "Рок";
        Protos protos4 = new Protos();
        protos4.name = "Ребе";
        Protos protos5 = new Protos();
        protos5.name = "Пердун";
        Terran terran1 = new Terran();
        terran1.name = "Тоша";
        Terran terran2 = new Terran();
        terran2.name = "Лысый";
        Terran terran3 = new Terran();
        terran3.name = "Хромой";
        Terran terran4 = new Terran();
        terran4.name = "Кривой";
        Terran terran5 = new Terran();
        terran5.name = "Косой";
        Terran terran6 = new Terran();
        terran6.name = "Кучерявый";
        Terran terran7 = new Terran();
        terran7.name = "Очкарик";
        Terran terran8 = new Terran();
        terran8.name = "Усатый";
        Terran terran9 = new Terran();
        terran9.name = "Сопливый";
        Terran terran10 = new Terran();
        terran10.name = "Крикливый";
        Terran terran11 = new Terran();
        terran11.name = "Немой";
        Terran terran12 = new Terran();
        terran12.name = "Седой";

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}