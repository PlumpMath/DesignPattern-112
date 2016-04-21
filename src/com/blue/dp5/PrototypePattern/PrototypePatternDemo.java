package com.blue.dp5.PrototypePattern;

/**
 * Created by bluewaitor on 2016/4/19.
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cloneShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape: " + cloneShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
