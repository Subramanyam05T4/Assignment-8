import java.util.*;

 class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of movies: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        String[] categories = new String[n];
        double[] scores = new double[n];
        int[] counts = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Movie " + (i + 1) + " category (e.g., PG, PG-13, R): ");
            categories[i] = scanner.nextLine();

            System.out.print("Enter the rating for movie " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character
        }

        System.out.println("Average ratings for each category:");
        for (int i = 0; i < n; i++) {
            double sum = 0;
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (categories[j].equals(categories[i])) {
                    sum += scores[j];
                    count++;
                }
            }
            double average = count > 0 ? sum / count : 0;
            System.out.println(categories[i] + ": " + average);
        }

        scanner.close();
    }
}
