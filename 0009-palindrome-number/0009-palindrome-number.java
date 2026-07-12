class Solution {
    public boolean isPalindrome(int x) {
        String xs = String.valueOf(x);
        String reversed = new StringBuilder(xs).reverse().toString();
        if(xs.equals(reversed)){
            return true;
        }
        else{
            return false;
        }

    }
}