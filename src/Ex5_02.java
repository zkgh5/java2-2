class Point1 {
    private int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public void showPoint() {
            System.out.println("(" + x + "," + y + ")");
        }
}

class ColorPoint1 extends Point1 {
    private String color;
    public ColorPoint1(int x, int y, String color) {
        super(x, y);
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void showColorPoint() {
        System.out.println(color);
        showPoint();
    }
}
public class Ex5_02 {
    public static void main(String[] args) {
        ColorPoint1 cp = new ColorPoint1(5, 6, "blue")
        cp.showColorPoint();   
    }
    }
