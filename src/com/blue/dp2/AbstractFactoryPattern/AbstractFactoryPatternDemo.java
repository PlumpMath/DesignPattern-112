package com.blue.dp2.AbstractFactoryPattern;

/**
 * Created by bluewaitor on 2016/4/19.
 */

/**
 * 抽象工厂模式
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        if(shapeFactory!=null){
            Shape shape1 = shapeFactory.getShape("CIRCLE");
            shape1.draw();

            Shape shape2 = shapeFactory.getShape("RECTANGLE");
            shape2.draw();

            Shape shape3 = shapeFactory.getShape("SQUARE");
            shape3.draw();
        }


        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        if(colorFactory!=null){
            Color color1 = colorFactory.getColor("RED");
            color1.fill();

            Color color2 = colorFactory.getColor("Green");
            color2.fill();

            Color color3 = colorFactory.getColor("BLUE");
            color3.fill();
        }


    }
}
