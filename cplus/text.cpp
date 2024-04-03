#include <iostream>

using namespace std;

class Box{
    public:
    double height;
    double length;
    double weight;

    double get(){
        return height*length*weight;
    }
    void set(double h,double w,double l){
        height=h;
        length=l;
        weight=w;
    }
};

int main(){
    Box box1;
    double h,l,w;
    double vol;
    cout<<"输入高长宽：";
    cin>>h>>l>>w;
    box1.set(h,l,w);
    cout<<"体积："<<box1.get()<<endl;

}