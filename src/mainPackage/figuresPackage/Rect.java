package mainPackage.figuresPackage;

public class Rect extends Figure {
    public void area() {
        super.area(name);
        System.out.println(height * height + " cm²");
    }
}
