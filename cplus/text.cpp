#include<iostream>
#include<cstring>

using namespace std;
// namespace name
int main()
{
    string str1="RJSFVJS";
    string str2="Google";
    string str3;
    int len;

    str3=str1;
    cout<<"str3:"<<str3<<endl;

    str3=str1+str2;
    cout<<"str1+str2:"<<str3<<endl;

    len=str3.size();
    cout<<"the len of str3:"<<len<<endl;


}

