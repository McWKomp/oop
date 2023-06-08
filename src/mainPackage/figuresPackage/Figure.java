package mainPackage.figuresPackage;

public class Figure {

    String name;
    int height;
    int width;

    public void area(String figureName) {
        System.out.println(">>> AREA FUNCTION -------------------------");
        if (figureName == "" || figureName == " " || figureName == null)
            System.out.print("My area is ");
        else
            System.out.print(figureName + "'s area is ");

    }

    public void aboutFigure() {
        System.out.println(">>> ABOUT FIGURE FUNCTION -------------------------");
        System.out.println("My name is " + name);
        System.out.println("My height is " + height + " cm");
        System.out.println("My width (radius) is " + width + " cm");
    }
}
