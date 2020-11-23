package Class1_BasicConcepts.Class1_1_WhatIsDataStructure;

public class Class1_1_2 {
    public static void main(String[] args) {
        Class1_1_2 class1_1_2 = new Class1_1_2();
        int num = 10000;
        class1_1_2.printForI(num);
        //		class1_1_2.printRecursion(num);
        System.out.println();
    }

    //循环
    void printForI(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
    }

    //递归
    void printRecursion(int n) {
        if (n >= 0) {
            printRecursion(n - 1);
            System.out.print(n + " ");
        }
    }
}
