public class DiamondPattern {

    public static void main(String[]args){

        int n = 5;

        for(int i=n;i>=1;i--){//first half
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=2*(n-i);j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i=1;i<=n;i++){//second half
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }for(int j=0;j<=2*(n-i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
