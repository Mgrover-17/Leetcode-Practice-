import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int[] grades = new int[numberOfStudents];

        // Input the grades of students
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the grade of student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        // Sorting the grades using insertion sort
        insertionSort(grades);

        // Displaying the sorted grades to the school administration
        System.out.println("\nSorted grades in ascending order:");
        for (int grade : grades) {
            System.out.println(grade);
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}

