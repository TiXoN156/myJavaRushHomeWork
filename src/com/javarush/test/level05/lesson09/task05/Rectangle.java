package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    private int rectangleTop, rectangleLeft, rectangleWidth, rectangleHeigth;

    public  Rectangle(int top, int left, int width, int heigth){
        this.rectangleTop = top;
        this.rectangleLeft = left;
        this.rectangleWidth = width;
        this.rectangleHeigth = heigth;
    }

    public Rectangle(int top, int left){
        this.rectangleTop = top;
        this.rectangleLeft = left;
        this.rectangleWidth = 0;
        this.rectangleHeigth = 0;
    }

    public  Rectangle(int top, int left, int width){
        this.rectangleTop = top;
        this.rectangleLeft = left;
        this.rectangleWidth = width;
        this.rectangleHeigth = width;
    }

    public Rectangle(Rectangle anotherReactangle){
        //this.rectangleTop = anotherReactangle;
        anotherReactangle = this;
    }

}
