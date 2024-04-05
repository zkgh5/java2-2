public class Ex4_3 {
    int radius;
    String name;

    public Circle() { 
        radius = 1; name = "";
    }

    public Circle(int r, String n) {
        radius = r; name = n;
    }
    public double   getArea() {
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Circle pizza = new Cicle(10, "자바피자");
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은" + area);
        
        circle donut = new Circle();
        donut.name = "도넛 피자";
        area = donut.getArea();
        System.out.println(donut.anme + "의 면적은 " +);
    }
}
