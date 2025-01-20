import java.util.Scanner;
class CharA{
    public static void main(String []args){
        Scanner input= new Scanner(System.in);
        System.out.println("enter the character ");
        char c=input.next().trim().charAt(0);//it will give you a string if you dont use char at 0 so first of all conver t it into char then remove all the leading and trailing spaces so that you get a specific character 
        checkTheCase(c);
    }
    static void checkTheCase(char c){
        if(c>='A' && c<='Z' ){
            System.out.println("the character is of upper case "+c); 
        }
        else if(c>='a'&&c<='z'){
            System.out.println("the character is of lower case "+c);
        }
        else{
            System.out.println("invalid character "+c);
        }
    }
}