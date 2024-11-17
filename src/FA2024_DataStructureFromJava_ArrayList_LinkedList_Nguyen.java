import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

// Modified Student class with ID and phone number
class Student {
    private String id;
    private String name;
    private String address;
    private String phoneNumber;

    public Student(String id, String name, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student[id=" + id + ", name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
    }
}

public class FA2024_DataStructureFromJava_ArrayList_LinkedList_Nguyen {
    public static void ArrayListMethod() {
        Scanner scanner = new Scanner(System.in);
        ArrayList list = new ArrayList();

        // TASK 1: OPERATION ADD
        System.out.println("TASK1: OPERATION ADD – Insert nodes to the ArrayList");

        // Add numbers 0-49
        for (int i = 0; i < 50; i++) {
            list.add(i);
        }

        // Add 5 students with additional fields
        System.out.println("Enter information for 5 students:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter student " + (i+1) + " ID:");
            String id = scanner.nextLine();
            System.out.println("Enter student " + (i+1) + " name:");
            String name = scanner.nextLine();
            System.out.println("Enter student " + (i+1) + " address:");
            String address = scanner.nextLine();
            System.out.println("Enter student " + (i+1) + " phone number:");
            String phoneNumber = scanner.nextLine();
            list.add(new Student(id, name, address, phoneNumber));
        }

        // Add numbers 55-99
        for (int i = 55; i < 100; i++) {
            list.add(i);
        }

        // TASK 2: OPERATION GET
        System.out.println("\nTASK2: OPERATION GET - Read information of one node");

        // Get and display node at index 40 (should be a number)
        int number40 = (int) list.get(40);
        System.out.println("Node at index 40: " + number40);

        // Get and display node at index 50 (should be a student)
        Student student50 = (Student) list.get(50);
        System.out.println("Node at index 50: " + student50);

        // TASK 3: VERIFY ENCAPSULATION
        System.out.println("\nVERIFY ENCAPSULATION FEATURE (ArrayList is not an encapsulated data structure)");

        // Get student at index 51
        Student student51 = (Student) list.get(51);

        // Change address and phone number of student51
        System.out.println("Enter new address for student51:");
        String newAddress = scanner.nextLine();
        System.out.println("Enter new phone number for student51:");
        String newPhone = scanner.nextLine();
        student51.setAddress(newAddress);
        student51.setPhoneNumber(newPhone);

        // Get student at index 51 again
        Student inside51 = (Student) list.get(51);

        // Compare and verify encapsulation
        if (student51.toString().equals(inside51.toString())) {
            System.out.println("Java ArrayList is unencapsulated");
        } else {
            System.out.println("Java ArrayList is encapsulated");
        }

        // TASK 4: OPERATION SET
        System.out.println("\nTASK4: OPERATION SET – Update information of one node");

        // Get student at index 52
        Student student52 = (Student) list.get(52);
        System.out.println("Original student at index 52: " + student52);

        // Update address and phone number
        System.out.println("Enter new address for student52:");
        String newAddress52 = scanner.nextLine();
        System.out.println("Enter new phone number for student52:");
        String newPhone52 = scanner.nextLine();
        student52.setAddress(newAddress52);
        student52.setPhoneNumber(newPhone52);

        // Set updated student back to ArrayList
        list.set(52, student52);

        // Verify update
        Student newStudent52 = (Student) list.get(52);
        System.out.println("Updated student at index 52: " + newStudent52);

        // TASK 5: CHECK SIZE
        System.out.println("\nTASK5: OPERATION SIZE – Read total number of nodes in ArrayList");
        int size = list.size();
        System.out.println("Current size of ArrayList: " + size);

        // TASK 6: OPERATION REMOVE
        System.out.println("\nTASK6: OPERATION REMOVE – Delete one node");

        // Remove node at index 53
        list.remove(53);

        // Verify size reduction
        int newSize = list.size();
        System.out.println("New size after removal: " + newSize);
        System.out.println("Size reduced by: " + (size - newSize));
    }
    public static void LinkedListMethod() {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        // TASK 1 OPERATION ADD
        System.out.println("TASK1: OPERATION ADD - Insert nodes to the LinkedList");
        System.out.println("Enter information for 3 students: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter student " + (i+1) + "name: ");
            String name = scanner.nextLine();
            System.out.println("Enter student " + (i+1) + "address: ");
            String address = scanner.nextLine();
            System.out.println("Enter student " + (i+1) + "phone number: ");
            String phoneNumber = scanner.nextLine();
            System.out.println("Enter student " + (i+1) + "id: ");
            String id = scanner.nextLine();
            linkedList.add(new Student(id, name, address,phoneNumber));
        }

        System.out.println("Enter student to be inserted first into the LinkedList");
        System.out.println("Enter student name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter student address: ");
        String firstAddress = scanner.nextLine();
        System.out.println("Enter student phone number: ");
        String firstPhoneNumber = scanner.nextLine();
        System.out.println("Enter student id: ");
        String firstId = scanner.nextLine();
        linkedList.addFirst(new Student(firstId, firstName, firstAddress,firstPhoneNumber));

        System.out.println("Enter student to be inserted last into the LinkedList");
        System.out.println("Enter student name: ");
        String secondName = scanner.nextLine();
        System.out.println("Enter student address: ");
        String secondAddress = scanner.nextLine();
        System.out.println("Enter student phone number: ");
        String secondPhoneNumber = scanner.nextLine();
        System.out.println("Enter student id: ");
        String secondId = scanner.nextLine();
        linkedList.addLast(new Student(secondId, secondName, secondAddress,secondPhoneNumber));

        //TASK 2 OPERATION GET
        System.out.println("TASK2: OPERATION Get - Read information of nodes");
        for (int i = 0; i < 3; i++) {
            Student student = (Student) linkedList.get(i);
            System.out.println("Student at index " + (i + 1) + student.toString());
        }
            System.out.println("First node: " + linkedList.getFirst());
            System.out.println("Last node: " + linkedList.getLast());

            //TASK 3 VERIFY ENCAPSULATION
            System.out.println("TASK3: VERIFY ENCAPSULATION FEATURE");
            Student student1 = (Student) linkedList.get(1);
            System.out.println("Student at index 1: " + student1.toString());
            System.out.println("Set new address for student at index 1: ");
            student1.setAddress(scanner.nextLine());
            Student inside1 = (Student) linkedList.get(1);

            if (student1.toString().equals(inside1.toString())) {
                System.out.println("Java LinkedList is unencapsulated");
            } else {
                System.out.println("Java LinkedList is encapsulated");
            }

        //TASK4: OPERATION SET
        System.out.println("TASK4: OPERATION SET - Update information of nodes");
        Student student2 = (Student) linkedList.get(2);
        System.out.println("Student at index 2: " + student2.toString());
        System.out.println("Set new address for student at index 2: ");
        student2.setAddress(scanner.nextLine());
        linkedList.set(2, student2);
        System.out.println(linkedList.get(2));

        //TASK 5: CHECK THE SIZE
        System.out.println("TASK5: OPERATION SIZE - Read total number of nodes in LinkedList");
        int size = linkedList.size();
        System.out.println("Current size of LinkedList: " + size);

        //TASK 6: OPERATION REMOVE
        System.out.println("OPERATION REMOVE - Delete one node");
        linkedList.remove(3);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList.size());

    }
}