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

int main(){
    int temp,n;
    std::cout<<"输入要爬的楼梯数"<<std::endl;
    std::cin>>n;
    Solution sol;
    temp=sol.climbStairs(n);
    std::cout<<"一共有"<<temp<<"种方法"<<std::endl;
}
