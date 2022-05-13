public class PalindromicTriangle {

    public static void main(String[]args){

        int n=4;

        for(int i=1;i<=n;i++){//Outer LOOP
            for(int j=1;j<=n-i;j++){//Spaces
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){//first Half
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){//Second Half
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
