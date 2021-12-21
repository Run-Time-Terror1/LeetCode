/*
https://youtu.be/hUfxElqYvJ8
*/
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        if((n&(n-1)) == 0)return true;
        return false;
    }
}
/*
1  -- 1
2 -- 10
4 -- 100
8 --- 1000
16
...
1000000 in binary true;
 1000 - 8
 0111 - 7
 n & (n-1) == 0
 retrun true;




*/
