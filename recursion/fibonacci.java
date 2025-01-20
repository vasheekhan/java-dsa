class fibonacci{
    public static void sum(int a,int b,int num){
        if(num==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        sum(b,c,num-1);
    }
    public static void main(String args[]){
     int a=0;
     int b=1;
     System.out.println(a);
     System.out.println(b);
     int num=7;
     sum(a,b,num-2);
    }
}