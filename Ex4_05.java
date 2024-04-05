public class Ex4_05 {
    String title;
    String author;       

public Ex4_05 () {
    this(t:"", a:"");
}
public Ex4_05(String t) {
    this(title, a = "작자미상")
}

public Ex4_05(String t, String a) {
    this.title=title; this.author=author;
}
public static void main(String[] args) {
    Ex4_04 lovestory = new Ex4_05(t:"춘향전");
    Ex4_04 littlePrince = new Ex4_05(t:"어린왕자", a:"생텍쥐페리");
    System.out.println(foo.title + " " + foo.author);
    System.out.println(lovestory.title + " " + lovestory.author);
    System.out.println(littlePrince.title + " " + littlePrince.author);
}
}