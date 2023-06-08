package mainPackage.figuresPackage;

public class Triangle extends Figure {
    public void area() {
        super.area(name);
        System.out.println((height * width) / 2 + " cm²");
    }
}
