class factorial{
    public static int fact(int n,int mul){
        if(n==1){
            return mul;
        }
        mul*=n;
        return fact(n-1,mul);
      
    }
    public static void main(String args[]){
     int Factorial= fact(5,1);
     System.out.println(Factorial);
    }
}