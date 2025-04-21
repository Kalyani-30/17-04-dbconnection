package com.neoteric.variable.exception;

public class BService {

    public void testNearestCatch(String fileName){

        System.out.println(" Enter into the testNearestCatch block in BService");
        CService cService= new CService();
        cService.testNearestCatch(fileName);
        System.out.println("exit from file");
    }
}
