//The program shall generate random numbers with a SecureRandom object
import java.security.SecureRandom;
import java.util.Scanner;


public class CAI2 {

	SecureRandom RandomNum = new SecureRandom();
	Scanner UserInput = new Scanner(System.in);
	//A multiplication problem shall contain two numbers sampled from a uniform random distribution in the range of 0 to 9 (inclusive)
	private int num1 = RandomNum.nextInt(10);
	private int num2 = RandomNum.nextInt(10);
	private int Useranswer;
	private int correctAnswer = num1 * num2;
	private int response = RandomNum.nextInt(4);
	
	
	public static void main(String[] args) {
		//Part 1: Create a main method that runs your program by calling the "quiz" method
		CAI2 user = new CAI2();
		
		user.quiz();

	}
	public void askQuestion() {
		//Create a function called "askQuestion" that prints the problem to the screen
		//The program shall ask the student to solve a multiplication problem
		System.out.println("How much is " + num1 + " * " + num2 + " ?");
		readResponse();
    }
	
	public void quiz() {
		//Create a method called "quiz" that contains the program logic
		 askQuestion();
		 isAnswerCorrect();
		
	}
    
	public void readResponse() {
		//Create a function called "readResponse" that reads the answer from the student
		Useranswer = UserInput.nextInt();
	}
	
	public void isAnswerCorrect() {
		//Create a function called "isAsnwerCorrect" that checks to see if the student's answer matches the correct answer to the problem
		if ( Useranswer == correctAnswer) {
			//The program shall terminate when a correct response is provided by the student
			response = RandomNum.nextInt(4);
			displayCorrectResponse();
			System.exit(1);
		}else {
			response = RandomNum.nextInt(4);
			displayIncorrectResponse();
		}
	}
	
	public void displayCorrectResponse() {
		//Create a function called "displayCorrectResponse" that prints out the response when a student enters a correct answer
		//The program shall display a random positive message if the student provides a correct response
		switch(response) {
		
		case 0:
			System.out.println("Very good!");
			break;
		case 1:
			System.out.println("Excellent!");
			break;
		case 2:
			System.out.println("Nice work!");
			break;
		case 3:
			System.out.println("Keep up the good work!");
			break;
	
		}
	}
	
	public void displayIncorrectResponse() {
		//Create a function called "displayInorrectResponse" that prints out the response when a student enters an incorrect answer
		//The program shall display a random negative message if the student provides an incorrect response
		switch(response) {

		case 0:
			System.out.println("No. Please try again.");
			break;
		case 1:
			System.out.println("Wrong. Try once more.");
			break;
		case 2:
			System.out.println("Don't give up!");
			break;
		case 3:
			System.out.println("No. Keep trying.");
			break;	
		}
		//The program shall continue to ask the student to solve the original multiplication problem until the student provides the correct answer
		askQuestion();
		isAnswerCorrect();
	}

}
