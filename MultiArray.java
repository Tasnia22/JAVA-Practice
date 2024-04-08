public class MultiArray {
    public static void main(String[]args)
    {    
        
        int num[][]= {
            {3,5,7},
            {9,0,6},
            {1,2,0} };

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(num[i][j] + " ");

            }
            System.out.println();
        }
    }
}
