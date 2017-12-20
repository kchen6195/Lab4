package lab4_2;

public class Sat
{
	private String DBN;
	private String school;
	private int satTakers;
	private int avgEnglish;
	private int avgMath;
	private int avgWriting;
	private int avgScore;
	
	public Sat(String DBN, String school,int satTakers, int avgEnglish,int avgMath, int avgWriting)
	{
		this.DBN = DBN;
		this.school = school;
		this.satTakers = satTakers;
		this.avgEnglish = avgEnglish;
		this.avgMath = avgMath;
		this.avgWriting = avgWriting;
		this.avgScore = avgEnglish + avgMath + avgWriting;
		
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
				+ ", avgMath=" + avgMath + ", avgWriting=" + avgWriting + ", avgScores =" + avgScore +"]";
	}
	
}