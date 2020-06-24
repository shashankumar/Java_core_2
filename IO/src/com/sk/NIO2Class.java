package com.sk;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

public class NIO2Class {

	public static void main(String[] args) throws IOException {
	String property = System.getProperty("user.home");
//		System.out.println(property);
//		
//		Path path = Paths.get(property);
//		System.out.println(path);
		
		String fileName = "myfile_" + UUID.randomUUID().toString() + ".txt";
	    Path p = Paths.get(property + "/" + fileName);
	    System.out.println((Files.exists(p)));
	 
	    Files.createFile(p);
	    System.out.println((Files.exists(p)));

	}

}
