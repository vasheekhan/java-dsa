import java.util.Scanner;
class Fibonnaci{
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the position of the fibonnaci number");
       int position=input.nextInt();
       fibonnacinumber(position);
    }
    static void fibonnacinumber(int position){
        int p=position;
        int a=0;
        int b=1;
        int temp=0;
        if(p==0){
            System.out.println("the element is "+a);
            return;
        }
        if(p==1){
                        System.out.println("the element is "+b);

        }
        for(int i=2;i<=p;i++){
            temp=a+b;
            a=b;
            b=temp;
        }
        System.out.println("the element is "+b);
    
    }
}