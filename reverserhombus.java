import java.util.Scanner;
class reverserhombus{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=c;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=c;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}