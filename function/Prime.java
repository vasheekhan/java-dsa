import java.util.Scanner;
class Prime{
    public static void main(String []args){
        int number;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        number=input.nextInt();
        primeNumber(number);

    }
    static void primeNumber(int number){
        int count=0;
        for(int i=2;i<=number;i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==1){
            System.out.println("the number is prime "+number);
        }
        else{
            System.out.println("the number is not prime "+number);
        }
    }
}