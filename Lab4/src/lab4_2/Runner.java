
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
		for(Sat s: scores)
		{
			System.out.println(s);
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
		return Sat(DBN,school,satTakers,avgEnglish,avgMath,avgWriting);
	}
	//
	class Sat
	{
		private String DBN;
		private String school;
		private int satTakers;
		private int avgEnglish;
		private int avgMath;
		private int avgWriting;
		
		public Sat(String DBN, String school,int satTakers, int avgEnglish,int avgMath, int avgWriting)
		{
			this.DBN = DBN;
			this.school = school;
			this.satTakers = satTakers;
			this.avgEnglish = avgEnglish;
			this.avgMath = avgMath;
			this.avgWriting = avgWriting;
			
		}

		public String getDBN() {
			return DBN;
		}

		public void setDBN(String dBN) {
			DBN = dBN;
		}

		public String getSchool() {
			return school;
		}

		public void setSchool(String school) {
			this.school = school;
		}

		public int getSatTakers() {
			return satTakers;
		}

		public void setSatTakers(int satTakers) {
			this.satTakers = satTakers;
		}

		public int getAvgEnglish() {
			return avgEnglish;
		}

		public void setAvgEnglish(int avgEnglish) {
			this.avgEnglish = avgEnglish;
		}

		public int getAvgMath() {
			return avgMath;
		}

		public void setAvgMath(int avgMath) {
			this.avgMath = avgMath;
		}

		public int getAvgWriting() {
			return avgWriting;
		}

		public void setAvgWriting(int avgWriting) {
			this.avgWriting = avgWriting;
		}

		@Override
		public String toString() {
			return "Sat [DBN=" + DBN + ", school=" + school + ", satTakers=" + satTakers + ", avgEnglish=" + avgEnglish
					+ ", avgMath=" + avgMath + ", avgWriting=" + avgWriting + "]";
		}
		
	}

}
