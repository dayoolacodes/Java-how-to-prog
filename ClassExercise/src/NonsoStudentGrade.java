/*collect score of 20 students, output their grade*/
import java.util.Scanner;

public class NonsoStudentGrade {
	
	public static void gradeDisplay() {
		Scanner input = new Scanner(System.in);
		int[] arrayRes = new int[3];
		char[] arrayGrade = new char[arrayRes.length];
		
		for(int j=0; j<arrayRes.length;j++) {
		System.out.print("Enter Score: ");
		int grade = input.nextInt();
		arrayRes[j] = grade;
		}
		
		for(int k=0;k<arrayRes.length;k++) {
		switch(arrayRes[k]/10) {
		case 1:
		case 2:
			arrayGrade[k]= 'F';
			break;
		case 3:
			arrayGrade[k]= 'E';
			break;
		case 4:
			arrayGrade[k]= 'D';
			break;
		case 5:
			arrayGrade[k]= 'C';
			break;
		case 6:
			arrayGrade[k]= 'B';
			break;
		case 7:
		case 8:
		case 9:
		case 10:
			arrayGrade[k]= 'A';
		break;
		default:
			arrayGrade[k]= 'f';
			break;		
		}
	} input.close();
		System.out.println("\nScore\t\tGrade");
		for(int i=0;i<arrayRes.length;i++) {
			System.out.println("______________________________");
			System.out.printf("%d\t\t%c\n",arrayRes[i],arrayGrade[i]);
		}	
	
	}

	public static void main(String... args) {
		gradeDisplay();
	}
	
}