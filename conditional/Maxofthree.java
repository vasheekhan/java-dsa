import java.util.Scanner;
class Maxofthree{
    public static void main(String []args){
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first number ");
        a=input.nextInt();
        System.out.println("enter the second number ");
        b=input.nextInt();
        System.out.println("enter the third number ");
        c=input.nextInt();
     int max=maxofthree(a,b,c);
     System.out.println("the maximum number out of three is "+max);


    }
    static int maxofthree(int a,int b,int c){
        if(a>=b && b>=c){
            return a;
        }
         else if(b>=c && b>=a){
            return b;
        }
         else{
            return c;
        }
    }
}