import Class1_BasicConcepts.Class1_1_WhatIsDataStructure.Class1_1_3;
import Util.countUsedMemory;
import Util.countUsedTime;

public class countTimeAndMemory {
    public static void main(String[] args) {
        countUsedMemory.countUsedMemoryStart();
        countUsedTime.countUsedTimeStart();
        //---测试代码开始---
        Class1_1_3 class1_1_3 = new Class1_1_3();
        class1_1_3.main(null);
        //---测试代码结束---
        countUsedTime.countUsedTimeEnd();
        countUsedMemory.countUsedMemoryEnd();
    }
}
