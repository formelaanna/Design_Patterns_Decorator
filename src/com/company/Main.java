package com.company;

public class Main {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle();
        Shape circle = new Circle();


        rectangle.draw();
        circle.draw();

        System.out.println();

        System.out.println("Creating decorated circle with blue color, green lines in dotted pattern and thickness of 4");
        Shape circleOne = new FillColorDecorator(new LineColorDecorator(new LineStyleDecorator(
                new LineThicknessDecorator(new Circle(), 4.0d), LineStyle.DOTTED), Color.GREEN), Color.BLUE);
        circleOne.draw();

        System.out.println();

        System.out.println("Creating decorated rectangle with brown color, yellow lines in dashed pattern and thickness of 2");
        Shape rectangleOne = new LineColorDecorator(new FillColorDecorator(new LineStyleDecorator
                (new LineThicknessDecorator(new Rectangle(), 2.0d), LineStyle.DASHED),Color.BROWN), Color.YELLOW );
        rectangleOne.draw();
    }
}
