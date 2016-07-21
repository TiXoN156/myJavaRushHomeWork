package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота).
 Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    private int rectangleTop, rectangleLeft, rectangleWidth, rectangleHeigth;

    public  void initialize(int top, int left, int width, int heigth){
        this.rectangleTop = top;
        this.rectangleLeft = left;
        this.rectangleWidth = width;
        this.rectangleHeigth = heigth;
    }

    public void initialize(int top, int left){
        this.rectangleTop = top;
        this.rectangleLeft = left;
        this.rectangleWidth = 0;
        this.rectangleHeigth = 0;
    }

    public  void initialize(int top, int left, int width){
        this.rectangleTop = top;
        this.rectangleLeft = left;
        this.rectangleWidth = width;
        this.rectangleHeigth = width;
    }

    public void initialize(Rectangle anotherReactangle){
        //this.rectangleTop = anotherReactangle;
        anotherReactangle = this;
    }

}
