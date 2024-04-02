public class LogicalOp {
    public static void main(String[] args) {
         int a=7;
         int b=0;
         int g=9;
         int f=2;
         boolean result= a>b && g>f;
         System.out.println(result);


         boolean r= a<b || g>f;
         System.out.println(r);

         boolean T =a>b == g<f;
         System.out.println(T);


    }
    
}
