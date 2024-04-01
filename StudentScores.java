import java.util.*;
class StudentScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        int[] scores = new int[n];
        System.out.println("Enter the test scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        
        Arrays.sort(scores);

       
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        double average = total / (double) n;

        // Counting the number of students above, at, and below the average
        int aboveAverage = 0, atAverage = 0, belowAverage = 0;
        for (int score : scores) {
            if (score > average) {
                aboveAverage++;
            } else if (score == average) {
                atAverage++;
            } else {
                belowAverage++;
            }
        }

        // Calculating the median score
        int median;
        if (n % 2 == 0) {
            median = (scores[n / 2 - 1] + scores[n / 2]) / 2;
        } else {
            median = scores[n / 2];
        }

        // Displaying the results
        System.out.println("Number of students above average: " + aboveAverage);
        System.out.println("Number of students at average: " + atAverage);
        System.out.println("Number of students below average: " + belowAverage);
        System.out.println("Median score: " + median);

        scanner.close();
    }
}
