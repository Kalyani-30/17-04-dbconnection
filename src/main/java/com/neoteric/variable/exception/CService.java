package com.neoteric.variable.exception;

public class CService {

    public void testNearestCatch(String filname){

        try {
            System.out.println("Enter into testNearest catch block in cservice");
            System.out.println("filename"+filname.equalsIgnoreCase("example.text"));
        }catch (Exception e){
            System.out.println("Exception occerred");

        }
        System.out.println(" exit from testNearestCatch block in cService");
    }
}
