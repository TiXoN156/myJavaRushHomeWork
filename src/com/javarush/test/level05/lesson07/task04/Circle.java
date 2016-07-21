package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    private int circleCenterX, circleCenterY, circleRadius, circleWidth;
    private String circleColor = null;

    public  void initialize(int centerX, int centerY, int radius){
        this.circleCenterX = centerX;
        this.circleCenterY = centerY;
        this.circleRadius = radius;
    }

    public  void initialize(int centerX, int centerY, int radius, int width){
        this.circleCenterX = centerX;
        this.circleCenterY = centerY;
        this.circleRadius = radius;
        this.circleWidth = width;
    }

    public  void initialize(int centerX, int centerY, int radius, int width, String color){
        this.circleCenterX = centerX;
        this.circleCenterY = centerY;
        this.circleRadius = radius;
        this.circleWidth = width;
        this.circleColor = color;
    }

}
