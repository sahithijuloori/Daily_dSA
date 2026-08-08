class Solution {
    public int subtractProductAndSum(int n) {
       int product=1;
       int sum=0;
       while(n>0){
        int x=n%10;
        product*=x;
        sum+=x;
        n=n/10;
       } 
       int z=product-sum;
       return z;
    }
}