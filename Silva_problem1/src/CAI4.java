//The program shall generate random numbers with a SecureRandom object
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI4 {
	
	SecureRandom RandomNum = new SecureRandom();
	Scanner UserInput = new Scanner(System.in);
	//A multiplication problem shall contain two numbers sampled from a uniform random distribution in the range of 0 to 9 (inclusive)
	private int num1; 
	private int num2;
	private int Useranswer;
	private int correctAnswer = num1 * num2;
	private int response = RandomNum.nextInt(4);
	private int problemCounter = 0;
	private int correctness;
	private double Percentage; 
	private int difficulty;
	
	
	public static void main(String[] args) {
		//Create a main method that runs your program by calling the "quiz" method
		CAI4 user = new CAI4();
			user.quiz();
	}
	
	public void askQuestion() {
		//Create a function called "askQuestion" that prints the problem to the screen
		//The program shall ask the student to solve 10 different multiplication problems
		while(problemCounter < 10) {
			System.out.println("How much is " + num1 + " * " + num2 + " ?");
			problemCounter++;
			readResponse();
			isAnswerCorrect();
			
			generateQuestionArgument();
		}
		
    }
	
	public void quiz() {
		//Create a method called "quiz" that contains the program logic
		 readDifficulty();
		 generateQuestionArgument();
		 askQuestion();
		 displayCompletionMessage();
		
	}
    
	public void readResponse() {
		//Create a function called "readResponse" that reads the answer from the student
		Useranswer = UserInput.nextInt();
		correctAnswer = num1 * num2;
	}
	
	public void isAnswerCorrect() {
		//Create a function called "isAsnwerCorrect" that checks to see if the student's answer matches the correct answer to the problem
		if ( Useranswer == correctAnswer) {
			//The program shall terminate when a correct response is provided by the student
			response = RandomNum.nextInt(4);
			displayCorrectResponse();
			correctness++;
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
	}
	
	public void displayCompletionMessage() {
		//The program shall display the student's score after the student has attempted to solve 10 problems
		//The student's score shall be the percentage of problems correctly solved
		//Create a function called "displayCompletionMessage" that prints out the studen't score and appropriate score response
		Percentage = ((double)correctness/problemCounter) * 100;
		//The program shall display the student's score after the student has attempted to solve 10 problems
		//The student's score shall be the percentage of problems correctly solved
		if(Percentage >= 75.00) {
			//The program shall display the message "Congratulations, you are ready to go to the next level!" if the student's score is greater than or equal to 75%
			System.out.println("\nCongratulations, you are ready to go to the next level! You scored a " + String.format("%.2f",Percentage ) + "%");
		}else {
			//The program shall display the message "Please ask your teacher for extra help." if the student's score is less than 75
			System.out.println("Please ask your teacher for extra help, you scored a " + String.format("%.2f",Percentage ) + "%");
		}
		
		ResetOption();
		
	}
	
	public void ResetOption() {
		//The program shall ask the student if they want to solve a new problem set after the score message has been displayed
		//The program shall restart when the student agrees to solve a new problem set
		while(problemCounter == 10) {
			System.out.println("\nWould you like to answer 10 more questions?\n1.Yes\n2.No");
			readResponse();
				if(Useranswer == 1) {
					System.out.println("Good luck !");
					problemCounter = 0;
					correctness = 0;
					quiz();
				}else if ( Useranswer == 2) {
					//The program shall terminate when the student declines to solve another problem set
					System.out.println("Thank you for playing!");
					System.exit(1);
				}else {
					System.out.println("Please Enter a valid option");
				}
		}
	}
	
	public void readDifficulty() {
		//Create a function called "readDifficulty" that reads the difficulty level from the student
		//The program shall ask the student to enter a difficulty level of 1, 2, 3, or 4
		System.out.println("Please Select a difficulty level(1-4)");
		difficulty = UserInput.nextInt();
		generateQuestionArgument();
			
	}
	
	public void generateQuestionArgument() {
		//Create a function called "generateQuestionArgument" that uses the difficulty level to generate a random number
		//Multiplication problems shall contain two numbers sampled from a uniform random distribution with bounds determined by the problem difficulty
		
		if(difficulty == 1) {
			//A difficulty level of 1 shall limit random numbers to the range of 0-9, inclusive
			num1 = RandomNum.nextInt(10);
			num2 = RandomNum.nextInt(10);
		}else if (difficulty == 2) {
			//A difficulty level of 2 shall limit random numbers to the range of 0-99, inclusive
			num1 = RandomNum.nextInt(100);
			num2 = RandomNum.nextInt(100);
		}else if (difficulty == 3) {
			//A difficulty level of 3 shall limit random numbers to the range of 0-999, inclusive
			num1 = RandomNum.nextInt(1000);
			num2 = RandomNum.nextInt(1000);
		}else if (difficulty == 4) {
			//A difficulty level of 4 shall limit random numbers to the range of 0-9999, inclusive
			num1 = RandomNum.nextInt(10000);
			num2 = RandomNum.nextInt(10000);
		}else {
			readDifficulty();
		}
		
	}
	

}
