/**
 * Author: Kelvin Chen
 * Date: 12/22/2017
 * Lab 4.2
 */
package lab4_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Runner {

	public static void main(String[] args) throws IOException 
	{
		File sat = new File("SATSCORES.csv");
		
		CSVUtilities csv = new CSVUtilities(sat);
		
		List<String> heading = csv.getColumnHeaders();
		for (String x: heading) 
		{
			System.out.println(x);
		}
		//test string
		List<String> School = CSVUtilities.getDataString(0);
		for(String x : School)
		{
			System.out.print(x+ " ");
		}
		System.out.println();
		List<String> Name = CSVUtilities.getDataString(1);
		for(String x : Name)
		{
			System.out.print(x+ " ");
		}
		System.out.println();
		//test int
		List<Integer> Takers = CSVUtilities.getDataInt(2);
		for(int x : Takers)
		{
			System.out.print(x+ " ");
		}
		System.out.println();
		List<Integer> Eng = CSVUtilities.getDataInt(3);
		for(int x : Eng)
		{
			System.out.print(x+ " ");
		}
		System.out.println();
		List<Integer> math = CSVUtilities.getDataInt(4);
		for(int x : math)
		{
			System.out.print(x+ " ");
		}
		System.out.println();
		List<Integer> Writ = CSVUtilities.getDataInt(5);
		for(int x : Writ)
		{
			System.out.print(x+ " ");
		}
		System.out.println();
	 }
	
	

	

}
