
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
		List<Sat> scores = readScoresfromCSV("SATSCORES.csv");
		for(Sat s: scores)
		{
			System.out.println(s);
		}

		File sat = new File("information.csv");
		
		CSVUtilities csv = new CSVUtilities(sat);
		
		List<String> heading = csv.getColumnHeaders();
		for (String x: heading) 
		{
			System.out.println(x);
		}
	 }
	
	private static List<Sat> readScoresfromCSV(String fileName)
	{
		List<Sat> scores = new ArrayList<>();
		Path pathToFile = Paths.get(fileName);
		try(BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII))
		{
			String line = br.readLine();
			while(line!= null)
			{
				  String[] attributes = line.split(",");
				  
				  Sat score = createScore(attributes);
				  scores.add(score);
				  line = br.readLine();
			}
		 } catch (IOException ioe) 
		{
			  ioe.printStackTrace();
		}
		 return scores;
	}
	private static Sat createScore(String[] metadata)
	{
		String DBN =  metadata[0];
		String school = metadata[1];
		int satTakers = Integer.parseInt(metadata[2]);
		int avgEnglish = Integer.parseInt(metadata[3]);
		int avgMath = Integer.parseInt(metadata[4]);
		int avgWriting = Integer.parseInt(metadata[5]);
		Sat test = new Sat(DBN,school,satTakers,avgEnglish,avgMath,avgWriting);
		return test;
	}
	
	

}
