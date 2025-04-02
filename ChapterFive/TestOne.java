public class TestOne {
    public static void main(String[] args) {
        // int balance = 10;

        // while (true) {
        // if (balance < 9) {
        // continue;
        // }
        // balance = balance - 9;
        // }

        // System.out.println("Balance is " + balance);

        int sum = 0;
        int i = 0;

        while (i < 4) {
            if (i % 3 == 0) {
                continue;
            }
            sum += i;
            i++;
        }
    }
}

// Output
/**
 * Balance is 1
 * 
 */