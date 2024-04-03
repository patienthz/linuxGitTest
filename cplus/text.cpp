#include <iostream>

class MyClass {
public:
    int data;

    void display() {
        std::cout << "Data: " << data << std::endl;
    }
};

int main() {
    // 创建类对象
    MyClass obj;
    obj.data = 42;

    // 声明和初始化指向类的指针
    MyClass *ptr = &obj;

    // 通过指针访问成员变量
    std::cout << "Data via pointer: " << ptr->data << std::endl;

    // 通过指针调用成员函数
    ptr->display();

    return 0;
}