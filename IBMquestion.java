import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IBMquestion {
    public static void main(String[] args) {
        int n = 4;
        List<Integer> numSeq = new ArrayList<>(Arrays.asList(2,1,4,3));

        int firstScore = 0;
        int secondScore = 0;

        for (int roundNum = 0; roundNum < n; roundNum++) {
            int pickedNumber = numSeq.remove(0);  // Remove the first number from the sequence

            if (roundNum % 2 == 0) {  // If it's the first player's turn
                firstScore += pickedNumber;
            } else {  // If it's the second player's turn
                secondScore += pickedNumber;
                if (pickedNumber % 2 == 0) {
                    // Do not reverse the list here
                }
            }
        }

        // Reverse the list if necessary after the loop
        if (n % 2 == 0) {
            Collections.reverse(numSeq);
        }

        // Calculate the difference in scores
        int scoreDifference = firstScore - secondScore;

        System.out.println("The total difference between players' scores is: " + scoreDifference);
    }
}