
package lab4_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) 
	{
		List<Sat> scores = readScoresfromCSV("SATSCORES.csv");
		for(Sat s: score)
		{
			System.out.println(s);
		}

	}
	private static List<Sat> readBooksFromCSV(String fileName)
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
		 
		
	}

}
