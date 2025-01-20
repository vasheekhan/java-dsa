import java.util.Scanner;
class Armstrong1{
    public static void main(String []args){
        armstrong();


    }
    static void armstrong(){
       
        for(int i=100;i<=999;i++){
             int sum=0;
            int no=i;
        while(no!=0){
            int ld=no%10;
            sum=sum+(ld*ld*ld);
            no=no/10;
        }
        if(sum==i){
            System.out.println(sum);
        }
        }
    }
}