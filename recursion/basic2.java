class basic2{
    public static void number(int n){
        if(n==6) 
        return;
        System.out.println(n);
        number(n+1);
    }
    public  static void main(String args[]){
        int n=1;
        number(n);
    }
}