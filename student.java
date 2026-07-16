import java.util.*;

class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int total = 0;
        int[] marks = new int[n];
        System.out.println("Enter the marks of " + n + " students:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("The marks of " + n + " students are:");
        for (int i : marks) {
            System.out.print(i + " ");
            total += i;
        }
        System.out.println("total marks=" + total);
        System.out.println("average marks=" + (total / n));
        int max = Arrays.stream(marks).max().getAsInt();
        System.out.println("maximum marks=" + max);
        int min = Arrays.stream(marks).min().getAsInt();
        System.out.println("minimum marks=" + min);
    }
}