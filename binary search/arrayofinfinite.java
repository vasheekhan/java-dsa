//amazon interview question
//find element in infinte array
class arrayofinfinite{
    public static void main(String []args){
int []arr={3,5,7,9,10,90,100,130,140,160,170};
int target=10;
System.out.println(ans(arr,target));
    }
    //start with the box of two
    static int ans(int[] arr, int target){
//finding range
int start=0;
int end=1;
while(target>arr[end]){
    ///double the value of start and end
    int temp=end+1;//this the new start
    //end =previous end + sizeofbox*2;
     end=end+(end - start + 1)*2; //here we have  to use previous start that why we use new variable 
    start=temp;
    
}
return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end - start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}