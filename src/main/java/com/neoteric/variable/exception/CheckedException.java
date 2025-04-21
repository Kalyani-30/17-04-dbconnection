package com.neoteric.variable.exception;

import java.io.FileNotFoundException;

public class CheckedException {

    public void getFile(String filename) {
        System.out.println("Updating file details...");

        try {
            AService aService = new AService();
            aService.testNearestCatch(filename);

        } catch (FileNotFoundException fe) {
            System.err.println("Error occurred while handling the file: " + fe.getMessage());
        }


        System.out.println("Filename: " + filename);
    }
}
