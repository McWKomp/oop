package mainPackage.figuresPackage;

public class Circle extends Figure {
    public void area() {
        super.area(name);
        double area = 2 * (Math.PI) * width;
        System.out.println(area + " cm²");
    }

}
