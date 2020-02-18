
public class Grade {
	private int score;
	
	public Grade() {
		
	}
	public void setScore(int score) {
		this.score = score;
		if (score >= 90 && score <= 100) {
			System.out.print("A");
		}
		if (score >= 80 && score < 90) {
			System.out.println("B");
		}
	}
	public int getScore() {
		return score;
	}
}
