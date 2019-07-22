/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Hari Venkatesh
 */
//package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class matrixConstruct {
	private static int[][] matrix;
	private static int[][] hmatrix;
	private static int n;
	//static
	static Long toNumeric(String ip) {
	    @SuppressWarnings("resource")
		Scanner sc = new Scanner(ip).useDelimiter("\\.");
	    Long l = (sc.nextLong() << 24) + (sc.nextLong() << 16) + (sc.nextLong() << 8)
	        + (sc.nextLong());

	    sc.close();
	    return l;
	  }
	public static void main(String... args)
	{ 
            int flag=0;
            List<String> ip=new ArrayList<>();
		for(int i=1;i<=20;i++){
			List<Capture1> books = readBooksFromCSV("cap"+i+".csv");
			for (Capture1 b : books)
			{
				if(ip.contains(b.equals("10.0.0.6")))
                                {
                                   
                                    flag=1; 
                                }                                				
			}
		}
                if(flag==1)
                {
                    System.out.println("Flag found found");
                } 
                else
                {
                    System.out.println("Flag found");
                }
		
	}	
	private static List<Capture1> readBooksFromCSV(String fileName) 
        {
		List<Capture1> books = new ArrayList<>();
		Path pathToFile = Paths.get(fileName);
		try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {
			String line = br.readLine();
			while (line != null)
			{
				String[] attributes = line.split(",");
				Capture1 book = createBook(attributes);
				books.add(book);
				line = br.readLine();
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
		return books;
	}
	private static Capture1 createBook(String[] metadata)
	{
		String name = metadata[0];
		int price = Integer.parseInt(metadata[2]);
		String author = metadata[1];
		int seq = Integer.parseInt(metadata[3]);
		return new Capture1(name, price, author,seq);
	}
}
