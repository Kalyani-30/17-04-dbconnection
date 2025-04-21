package com.neoteric.variable.exception;

import java.io.File;
import java.io.FileNotFoundException;

public class AService {

    public void testNearestCatch(String fileName) throws FileNotFoundException {
        File file = new File(fileName);

        // Check if the file exists
        if (!file.exists()) {
            throw new FileNotFoundException("The file '" + fileName + "' was not found.");
        }

        System.out.println("Entered into testNearestCatch() of AService");
    }
}
