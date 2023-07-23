import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the number of game scores
        System.out.print("Enter the number of game scores: ");
        int numberOfScores = scanner.nextInt();
        
        int[] scores = new int[numberOfScores];
        
        // Get the game scores
        for (int i = 0; i < numberOfScores; i++) {
            System.out.print("Enter game score #" + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }
        
        // Bubble sort
        for (int i = 0; i < numberOfScores - 1; i++) {
            for (int j = 0; j < numberOfScores - i - 1; j++) {
                if (scores[j] > scores[j + 1]) {
                    // Swap the scores
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                }
            }
        }
        
        // Display the sorted scores
        System.out.println("Sorted Scores:");
        for (int i = 0; i < numberOfScores; i++) {
            System.out.println(scores[i]);
        }
    }
}

