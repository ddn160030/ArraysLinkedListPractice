// Lab 3
import java.util.Scanner;

public class FA2024_Student_Nguyen {
    public static void main(String[] args) {
        FA2024_DataStructureFromJava_ArrayList_LinkedList_Nguyen ArrayList = new FA2024_DataStructureFromJava_ArrayList_LinkedList_Nguyen();
        FA2024_DataStructureFromJava_ArrayList_LinkedList_Nguyen LinkedList = new FA2024_DataStructureFromJava_ArrayList_LinkedList_Nguyen();
        System.out.println("JAVA Data Structures - Dustin Nguyen");
        System.out.println("------------------------------------------------------------");
        System.out.println("1. JAVA ARRAYLIST");
        System.out.println("2. JAVA LINKEDLIST");
        System.out.println("0. EXIT");
        System.out.println("Type 1 or 2 to select data structure type or 0 to exit.");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input) {
            case 1: ArrayList.ArrayListMethod();
            break;
            case 2: LinkedList.LinkedListMethod();
        }
    }
}
