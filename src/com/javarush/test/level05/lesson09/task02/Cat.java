package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String catName = null;
    private int catWeight;
    private int catAge;
    private String catColor = null;
    private String catAdress = null;

    public  Cat(String name){
        this.catName = name;
        this.catWeight = 5;
        this.catAge = 3;
    }

    public  Cat(String name, int weight, int age){
        this.catName = name;
        this.catWeight = weight;
        this.catAge = age;
    }

    public Cat(String name, int age){
        this.catName = name;
        this.catWeight = 5;
        this.catAge = age;
    }

    public  Cat(int weight, String color){
        this.catWeight = weight;
        this.catColor = color;
        this.catAge = 3;
    }

    public Cat(int weight, String color, String adress) {
        this.catWeight = weight;
        this.catColor = color;
        this.catAdress = adress;
        this.catAge = 3;
    }
}
