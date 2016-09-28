package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    private int circleCenterX, circleCenterY, circleRadius, circleWidth;
    private String circleColor = null;

    public  Circle(int centerX, int centerY, int radius){
        this.circleCenterX = centerX;
        this.circleCenterY = centerY;
        this.circleRadius = radius;
    }

    public  Circle(int centerX, int centerY, int radius, int width){
        this.circleCenterX = centerX;
        this.circleCenterY = centerY;
        this.circleRadius = radius;
        this.circleWidth = width;
    }

    public  Circle(int centerX, int centerY, int radius, int width, String color){
        this.circleCenterX = centerX;
        this.circleCenterY = centerY;
        this.circleRadius = radius;
        this.circleWidth = width;
        this.circleColor = color;
    }

}
