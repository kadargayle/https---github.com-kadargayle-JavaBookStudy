
public class TestBreak {

	public static void main(String[] args) {
		int sum = 0;
		int number = 0;
		
		while (number < 20) {
			number++;
			sum += number;
			if(sum >= 100) {
				break;
			}
			System.out.println("The number is " + number);
			System.out.println("The sum is " + sum);
		}

	}

}


/*
 *the program adds integers from 1 to 20 in this order to sum until sum is greater than or equal to 100. 
 *WIthout the if statement, the program calculates the sum of the numbers from 1 to 20. 
 *THe if statement, the loop terminates when sum becomes greater than or equal to 100.  
 * 
 * */
 