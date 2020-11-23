package Class1_BasicConcepts.Class1_1_WhatIsDataStructure;

public class Class1_1_3 {
    public static void main(String[] args) {
        //x最高阶数
        int n = 5;
        //x前各项系数
        double a[] = {3, 4, 5, 6, 7, 8};
        //x的值
        double x = 9;
        Class1_1_3 class1_1_3 = new Class1_1_3();
        System.out.println(class1_1_3.funAdv(n, a, x));
    }

    //标准算法计算多项式
    //f(x)=[a0]+[a1]*x+...+[an-1]*x^[n-1]+[an]*x^[n]
    double funBasic(int n, double a[], double x) {
        int i;
        double p = a[0];
        for (i = 1; i <= n; i++) {
            p += (a[i] * Math.pow(x, i));
        }
        return p;
    }

    //秦九韶算法
    //f(x)=[a0]+x([a1]+x*(...([an-1]+x*([an]))...))
    double funAdv(int n, double a[], double x) {
        int i;
        double p = a[n];
        for (i = n; i > 0; i--) {
            p = a[i - 1] + x * p;
        }
        return p;
    }
}
