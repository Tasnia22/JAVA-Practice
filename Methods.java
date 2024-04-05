//public vs static
//we created a static method, which means that it can be accessed without creating an object of the class,
// unlike public, which can only be accessed by objects

public class Methods{
  //static method

  static void StaticMethod()
  {
    System.out.println("Static methods can be called without creating objects ");
  }

  //public method

  public void PublicMethod()
  {
    System.out.println("Public Methods must be called by creating objects");
  }

  //main method
  public static void main(String[]args)
  {
    StaticMethod();
    Methods T = new Methods();
    T.PublicMethod();

  }
}