class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int arr[]= new int[m+n];
        int k=0;
        for(int x:nums1){
            arr[k++]=x;
        }
        for(int y:nums2){
            arr[k++]=y;
        }
        /*for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }*/
        Arrays.sort(arr);
        int sum=m+n;
        int x=sum/2;
        double median;
        if(sum%2==0){
            median=(arr[x]+arr[x-1])/2.0;

        }
        else{
            median=arr[x];
        }
        return median;
    }
}