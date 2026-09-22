class Solution {
    public int smallestEvenMultiple(int n) {
        int i=n;
        while(i%2!=0||i%n!=0){
            i++;
        }
        return i;
    }
}