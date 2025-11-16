package com.hust.kstn.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
	public static void main(String[] args) {
    	String filename = "src/com/hust/kstn/garbage/test.txt"; 
        
        byte[] inputBytes = { 0 };
        long startTime, endTime, prevTime;
        try {
			inputBytes = Files.readAllBytes(Paths.get(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println("Running Garbage Creator: ");
        startTime = System.currentTimeMillis();
        prevTime = startTime;
        String outputString = "";
        for (byte b : inputBytes) {
        	outputString += (char)b; 
        	endTime = System.currentTimeMillis();
        	if (endTime - prevTime >= 300000) {
        		prevTime = endTime; System.out.println("5 minutes has passed: ");
        	}
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
    }
}
