import java.util.Scanner;

public class StudentResults {
	Scanner input = new Scanner(System.in);
	private String studentName;
	private int studentScore;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentScore() {
		return studentScore;
	}
	public void setStudentScore(int studentScore) {
		this.studentScore = studentScore;
	}
	

	int counter = 1;
	int passedTotal = 0;
	int failedTotal = 0;
	int results = 0;

	public void ResultAnalyser(){
	while (counter <= 10) {
		System.out.printf("Enter student%d result (1 = pass, 2 = fail): ", counter);
		int results = input.nextInt();
		
		if ((results > 2) || (results <= 0)) {
			System.out.println("Enter 1 for pass or 2 for failed");
			continue;
			}else if (results == 1){
			passedTotal++;
			}else {
				failedTotal++;	
			}
								
		counter++;
	}
		
		System.out.printf("\nTotal Number of pass is %d ", passedTotal);
		System.out.printf("\nTotal Number of fail is %d ", failedTotal);
		if (passedTotal >= 8){
			System.out.println("\nBonus to the Lecturer");
		}
	}


}
