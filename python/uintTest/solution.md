# pytest 报错—— zsh: command not found: pytest

## 操作环境

>  - **ubuntu 22.04.3**
>  - **vscode** 
>  - **python和pip3版本**

 
```bash
> python3 --version
Python 3.10.12
```

```bash
> pip3 --version
pip 22.0.2 from /usr/lib/python3/dist-packages/pip (python 3.10)
```

## 问题描述

> 在利用**python3**下载**pip3**后,利用**pip3**下载**pytest**,结果操作完仍然显示如下图：
> 
```bash
 > pytest --version zsh: command not found: pytest 
 ```
## 产生原因 
> 通过**pip**安装**pytest**不会使其成为系统命令，而是会将其安装到**python**

## 问题解决

> 使用命令： 
```bash 
> python3 -m pytest -v test_calculator.py
 ```
>    效果：
>    ```bash
>    ====================== test session starts =======================
> platform linux -- Python 3.10.12, pytest-8.1.1, pluggy-1.4.0 --
> /usr/bin/python3 cachedir: .pytest_cache rootdir:
> /home/zhuo/project_code/python collected 4 items                      
> 
> 
> test_calculator.py::test_positive PASSED                   [ 25%]
> test_calculator.py::test_negative PASSED                   [ 50%]
> test_calculator.py::test_zero PASSED                       [ 75%]
> test_calculator.py::test_str PASSED                        [100%]
> 
> ======================= 4 passed in 0.01s ========================
>    ```
## 参考

 1. [https://www.cnblogs.com/rychh/p/17812543.html](https://www.cnblogs.com/rychh/p/17812543.html)
 2. [https://blog.csdn.net/qq_37998956/article/details/120248449](https://blog.csdn.net/qq_37998956/article/details/120248449)

