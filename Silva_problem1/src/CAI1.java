//The program shall generate random numbers with a SecureRandom object
import java.security.SecureRandom;
import java.util.Scanner; 


public class CAI1 {

	SecureRandom RandomNum = new SecureRandom();
	Scanner UserInput = new Scanner(System.in);
	
	private int num1 = RandomNum.nextInt(10);
	private int num2 = RandomNum.nextInt(10);
	private int Useranswer;
	private int correctAnswer = num1 * num2;;
	
	
	public static void main(String[] args) {
		CAI1 user = new CAI1();
		//Create a main method that runs your program by calling the "quiz" method
		user.quiz();

	}
	public void askQuestion() {
		//The program shall ask the student to solve a multiplication problem
		//Create a method called "askQuestion" that prints the problem to the screen
		System.out.println("How much is " + num1 + " * " + num2 + " ?");
		readResponse();
    }
	
	public void quiz() {
		//Create a method called "quiz" that contains the program logic
		//A multiplication problem shall contain two numbers sampled from a uniform random distribution in the range of 0 to 9 (inclusive)
		 askQuestion();
		 isAnswerCorrect();
		
	}
    
	public void readResponse() {
	//Create a method called "readResponse" that reads the answer from the student
		Useranswer = UserInput.nextInt();
	}
	
	public void isAnswerCorrect() {
		//Create a method called "isAsnwerCorrect" that checks to see if the student's answer matches the correct answer to the problem
		if ( Useranswer == correctAnswer) {
			displayCorrectResponse();
			//The program shall terminate when a correct response is provided by the student
			System.exit(1);
		}else {
			displayIncorrectResponse();
		}
	}
	
	public void displayCorrectResponse() {
		//Create a method called "displayCorrectResponse" that prints out the response when a student enters a correct answer
		//The program shall display the message "Very good!" if the student provides a correct response
		System.out.println("Very good!");
	}	
	
	public void displayIncorrectResponse() {
		//The program shall display the message "No. Please try again." if the student provides an incorrect response
		//Create a method called "displayInorrectResponse" that prints out the response when a student enters an incorrect answer
		System.out.println("No. Please try again.");
		//The program shall continue to ask the student to solve the original multiplication problem until the student provides the correct answer
		askQuestion();
		isAnswerCorrect();
	}
}
	
		
	