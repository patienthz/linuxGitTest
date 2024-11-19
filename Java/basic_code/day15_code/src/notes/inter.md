## Interface 接口

### 接口：Interface 可以理解成各种各样行为的规则

1. 接口代表规则是行为的抽象。想要让哪个类拥有一个行为，就让这个类去实现对应的接口
2. 当一个方法参数是接口时，可以传递接口所有实现的类的对象，这种方式称为**接口多态**

- *接口多态的example*:

```java
public interface transport {

}

public void MoveHouse(transport t) {

}
```

定义一个运输**transport**的接口，在实现搬家**MoveHouse**这个方法时，可以接受多种的可以运输的对象

### 一些JDK更新

- JDK7以前：接口中只能定义抽象方法
- JDK8：接口中可以定义有方法体的方法(默认方法：default;静态：static)
- JDK9:接口中可以定义私有的方法
  私有方法分成两类：
    1. 普通的私有方法
    2. 静态的私有方法 分别对应默认方法和静态方法