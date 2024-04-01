import java.util.*;

public class StudentProjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        int[] completionTimes = new int[n];
        System.out.println("Enter the completion times for each student's project (in days):");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + "'s project completion time: ");
            completionTimes[i] = scanner.nextInt();
        }

        
int onTime = 0, late = 0, early = 0;
        for (int time : completionTimes) {
            if (time == 0) {
                onTime++;
            } else if (time < 0) {
                early++;
            } else {
                late++;
            }
        }


System.out.println("Average completion time for each student:");
        for (int i = 0; i < n; i++) {
            int completionTime = completionTimes[i];
            double average = completionTime / (double) n;
            System.out.println("Student " + (i + 1) + ": " + average + " days");
        }


System.out.println("Number of projects completed on time: " + onTime);
        System.out.println("Number of projects completed late: " + late);
        System.out.println("Number of projects completed early: " + early);

        scanner.close();
    }
}
