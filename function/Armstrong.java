import java.util.Scanner;
class Armstrong{
    public static void main(String []args){
        int number;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        number=input.nextInt();
        armstrong(number);


    }
    static void armstrong(int number){
        int sum=0;
        int temp=number;
        int n=number;
        while(n!=0){
            int ld=n%10;
            sum=sum+(ld*ld*ld);
            n=n/10;
        }
        if(sum==temp){
            System.out.println("the given number is armstrong number "+temp);
        }
        else{
          System.out.println("the given number is not armstrong number "+temp);
        }

    }
}