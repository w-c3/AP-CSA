public class StudentTest {

    private int mathScore;
    private int elaScore;
    private String name;

    public StudentTest(String name1, int mathScore1, int elaScore1){
       mathScore = mathScore1;
       name = name1;
       elaScore = elaScore1;
    }

	public int getMathScore() {
	    return mathScore;
	}

	public void setMathScore(int mathScore1) {
		mathScore = mathScore1;
	}

	public int getElaScore() {
	    return elaScore;
	}

	public void setElaScore(int elaScore1) {
		elaScore = elaScore1;
	}

	public String getName() {
		return name;
	}

}