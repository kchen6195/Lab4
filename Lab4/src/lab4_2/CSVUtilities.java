package lab4_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CSVUtilities {

	private ArrayList<String> CSVData;
	private int cols;
	
	public CSVUtilities(File csv) throws IOException {
		FileReader csvF = new FileReader(csv);
		
		try (BufferedReader br = new BufferedReader(csvF)) {
			String line = br.readLine();
			while (line != null) {
				this.CSVData.add(line);
				line = br.readLine();
			}
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		this.cols = getColumnHeaders().size();
	}

	public List<String> getColumnHeaders()
	{
		return Arrays.asList(CSVData.get(0).split(","));
	}
	
	public List<String> getDataString(int column)
	{
		ArrayList<String> data = new ArrayList<String>();
		for (int x = 0; x < CSVData.size(); x++) 
		{
			String[] temp = CSVData.get(x).split(",");
			data.add(temp[column]);
		}
		return data;
	}
	
	public List<Integer> getDataInt(int column) 
	{
		ArrayList<Integer> data = new ArrayList<Integer>();
		for (int x = 0; x < CSVData.size(); x++)
		{
			String[] temp = CSVData.get(x).split(",");
			data.add(Integer.parseInt(temp[column]));
		}
		return data;
	}
	
	public List<Double> getDataDouble(int column) 
	{
		ArrayList<Double> data = new ArrayList<Double>();
		for (int x = 0; x < CSVData.size(); x++) 
		{
			String[] temp = CSVData.get(x).split(",");
			data.add(Double.parseDouble(temp[column]));
		}
		return data;
	}
}
