import java.util.Scanner;
class CountingThenumberOfOccurence{
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number ");
        int number=input.nextInt();
        System.out.println("enter the digit whose number of occurence you have to find");
        int digit=input.nextInt();
       int Occurence= occurence(number,digit);
       System.out.println("the number of occurence of "+digit+" is "+Occurence);
    }
    static int occurence(int number,int digit){
        int c=0;
        int n=number;
        int d=digit;
        while(n!=0){
            int ld=n%10;
            if(ld==d){
                c++;
            }
            n=n/10;
        }
        return c;
    }
}