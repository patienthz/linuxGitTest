# Static用法

*static* 表示静态，是一个修饰符号，可以修饰成员方法和成员变量

## 静态变量

被*static*修饰成员变量，叫做静态变量

### 特点：

1. 被该类所有对象共享
2. 不属于对象，属于类
3. 随着类的加载而加载，优先于对象存在

### 调用方法：

- 使用类名调用

## 静态方法

被*static*修饰的成员方法，叫做静态方法

### 特点：

1. 多用在测试类和工具类中
2. *JavaBean*类中很少会用

### 调用方法

- 类名调用

# 类
## *JavaBean类*
- 用来描述一类事务的类
- 例如：Student,Teacher,Dod,Cat等
## 测试类
- 用来检查其他类是否书写正确，带有main方法的类，是程序的入口
## 工具类
- 不是用来描述一类事物，而是帮忙做一些事情的类
### 命名规则
1. 类名见名知意
2. 私有化构造方法，即禁止外界创造该类的对象
3. 方法定义为静态
```java
public class ArrUtil{
    private  ArrUtil(){}
    
    public static int getMax(){}
    public static int getMin(){}
}
```