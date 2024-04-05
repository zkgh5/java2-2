public class Ex4_04 {
        String title;
    String author;       

    public Ex4_04 () {
        title = "해리포터"
    }
    public Ex4_04(String t) {
        title = t; author = "작자미상"
    }

    public Ex4_04(String t, String a) {
        title = t; author = a;
    }
    public static void main(String[] args) {
        Ex4_04 lovestory = new Ex4_04(t:"춘향전");
        Ex4_04 littlePrince = new Ex4_04(t:"어린왕자", a:"생텍쥐페리");
        System.out.println(foo.title + " " + foo.author);
        System.out.println(lovestory.title + " " + lovestory.author);
        System.out.println(littlePrince.title + " " + littlePrince.author);
    }
    }

