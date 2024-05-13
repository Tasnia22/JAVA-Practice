
//It can be used to set initial values for object attributes:
//A constructor in Java is a special method that is used to initialize objects.


public class Constructor {
    int x;  // Create a class attribute

    // Create a class constructor for the Main((COnstructor)class
    public Constructor()
    {
        x = 5;

    }
    public static void main(String[]agrs)
    {
        Constructor num= new Constructor();
        System.out.println(num.x);

    }
    
}
