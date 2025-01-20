class basic{
    public static void number(int n){
        if(n==0) 
        return;
        System.out.println(n);
        number(n-1);
    }
    public  static void main(String args[]){
        int n=5;
        number(5);
    }
}