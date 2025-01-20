class floor{
    public static void main(String []args){
        int []arr={2,3,5,9,14,16,18};
        int target=4;
      int   ans=cieling(arr,target);
        System.out.println(ans);
    }
    static int cieling(int []arr,int target){
        int res=0;
        int s=0;
        int e=arr.length-1;
        int mid;
        while(s<=e){
            mid=s+(e-s)/2;
            if(arr[mid]<=target){
                res=arr[mid];
                s=mid+1;
            }
            else{
                e=mid-1;
            }
           

        }
         return res;
    }

}