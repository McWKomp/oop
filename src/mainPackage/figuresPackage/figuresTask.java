package mainPackage.figuresPackage;

public class figuresTask {
    public static void main(String[]args){
        // RECTANGLE ---------------
        Rect rect = new Rect();

        rect.height = 10;
        rect.name = "Rectangle";

        rect.aboutFigure();
        rect.area();

        // TRIANGLE ---------------
        Triangle triangle = new Triangle();

        triangle.height = 15;
        triangle.width = 10;
        triangle.name = "Triangle";


        triangle.aboutFigure();
        triangle.area();

        // CIRCLE ---------------
        Circle circle = new Circle();

        circle.width = 25;
        circle.name = "Circle";

        circle.aboutFigure();
        circle.area();

        Figure[] array = new Figure[]{rect, triangle, circle};
        for (int i = 0; i < array.length; i++) {
            System.out.println(">>> "+array[i].name.toUpperCase()+" -------------------------");
            System.out.println("Hi, my name is "+array[i].name);
            System.out.println("My width is "+array[i].width);
            System.out.println("And my height is "+array[i].height);
        }

    }
}

