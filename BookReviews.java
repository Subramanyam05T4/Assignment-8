import java.util.*;

public class BookReviews {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.print("Enter the number of books: ");
        int n = scanner.nextInt();
        int[] reviews = new int[n];
        System.out.println("Enter the reviews for each book:");
        for (int i = 0; i < n; i++) {
            reviews[i] = scanner.nextInt();
        }


        int[] ratingRanges = new int[2]; // ratingRanges[0] for 1-5 stars, ratingRanges[1] for 6-10 stars
        for (int review : reviews) {
            if (review >= 1 && review <= 5) {
                ratingRanges[0]++;
            } else if (review >= 6 && review <= 10) {
                ratingRanges[1]++;
            } else {
                System.out.println("Invalid review rating: " + review);
            }
        }


        int positiveReviews = 0, neutralReviews = 0, negativeReviews = 0;
        for (int review : reviews) {
            if (review >= 7 && review <= 10) {
                positiveReviews++;
            } else if (review >= 4 && review <= 6) {
                neutralReviews++;
            } else if (review >= 1 && review <= 3) {
                negativeReviews++;
            }
        }


        System.out.println("Number of books with reviews between 1-5 stars: " + ratingRanges[0]);
        System.out.println("Number of books with reviews between 6-10 stars: " + ratingRanges[1]);
        System.out.println("Number of books with positive reviews: " + positiveReviews);
        System.out.println("Number of books with neutral reviews: " + neutralReviews);
        System.out.println("Number of books with negative reviews: " + negativeReviews);

        scanner.close();
    }
}
