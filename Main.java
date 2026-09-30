import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AVLTree tree = new AVLTree();

        while (true) {

            System.out.println("\n===== Student Record Management =====");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display Students");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    tree.insert(new Student(id, name, marks));

                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = sc.nextInt();

                    tree.search(searchId);
                    break;

                case 3:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = sc.nextInt();

                    tree.delete(deleteId);

                    System.out.println("Delete operation completed.");
                    break;

                case 4:
                    tree.display();
                    break;

                case 5:
                    System.out.println("Program ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}