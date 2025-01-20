class linearsearch{
    public static void main(String []args){
int[] num={23,45,1,2,19,-3,16,-11,28};
int target=19;
int ans=linear(num,target);
System.out.println(ans);
    }
    static int linear(int []arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;

    }
}