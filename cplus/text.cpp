#include <iostream>

#define length 10

using namespace std;

class myclass{
    public:
    static int Classvar;
};
int myclass::Classvar=30;
string green="kafdjijksfjk";
string green1="folskof";

int main(){
    cout<<"var:"<<myclass::Classvar<<length<<endl;
    return 0;
}