package com.land.mine.fight.patterns.factory;

/**
 * @task: 工厂模式
 * @discrption:
 * @author: dongweijie
 * @date: 2019/10/12
 * @version: 1.0.0
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("圆");
        //调用 Circle 的 draw 方法
        shape1.draw();
        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("三角");
        //调用 Rectangle 的 draw 方法
        shape2.draw();
    }
}
