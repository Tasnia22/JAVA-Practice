class Class1 {
    int x = 19;

    static class Multiclass2 {
        int y = 7;
    }
}

public class Multiclass {
    public static void main(String[] args) {
        Class1 myclass = new Class1();
        Class1.Multiclass2 myclass2 = new Class1.Multiclass2();
        System.out.println(myclass2.y + myclass.x);
    }
}
