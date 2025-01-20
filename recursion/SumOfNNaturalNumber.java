class SumOfNNaturalNumber{
    public static int sum1(int n,int sum){
        if(n==0)
       return sum;
 sum+=n;
return sum1(n-1,sum);
    }
    public static void main(String args[]){
        int sum=0;
        int n=10;
    int  total=sum1(n,sum);
    System.out.println(total);
    }
}