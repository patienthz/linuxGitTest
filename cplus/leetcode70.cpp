//dp
#include <iostream>
class Solution {
public:
    int climbStairs(int n) {
        if (n<=2)
        {
            return n;            /* code */
        }
        else{
            int var1=1,var2=2,temp;
            for (int i = 3; i <= n; i++)
            {
                /* code */
                temp=var1+var2;
                var1=var2;
                var2=temp;
            }
            return var2;
        }    
    }
};

