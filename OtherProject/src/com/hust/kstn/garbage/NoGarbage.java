package com.hust.kstn.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
	public static void main (String[] args) {
		String filename = "src/com/hust/kstn/garbage/test.txt"; 
        
        byte[] inputBytes = { 0 };
        long startTime, endTime;
        try {
			inputBytes = Files.readAllBytes(Paths.get(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println("Running No Garbage: ");
        startTime = System.currentTimeMillis();
        
        StringBuilder outputString = new StringBuilder();
        for (byte b : inputBytes) {
        	outputString.append((char)b); 
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
	}
}
