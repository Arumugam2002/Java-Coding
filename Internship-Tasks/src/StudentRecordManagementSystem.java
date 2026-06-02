import java.util.*;

public class StudentRecordManagementSystem {

	int studentId;
	String name;

	double marks;

	public StudentRecordManagementSystem(int studentId, String name, double marks) {
		this.studentId = studentId;
		this.name = name;
		this.marks = marks;
	}

	static ArrayList<StudentRecordManagementSystem> studentList = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public void display() {
		System.out.println("The student details are " + studentId + " " + name + " " + marks);
	}

	public static void insertStudentDetails() {
		System.out.println("Enter Student Id:- ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Student Name");
		String name = sc.nextLine();

		System.out.println("Enter Marks:- ");
		double marks = sc.nextDouble();

		StudentRecordManagementSystem student1 = new StudentRecordManagementSystem(id, name, marks);
		studentList.add(student1);

		System.out.println("Student added successfully");
	}

	public static void updateStudentDetails() {
		System.out.println("Enter Student Id to update");
		int id = sc.nextInt();
		sc.nextLine();

		boolean found = false;

		for (StudentRecordManagementSystem student : studentList) {
			if (student.studentId == id) {
				System.out.println("Enter new name:- ");
				String name = sc.nextLine();

				System.out.println("Enter new Marks:- ");
				double marks = sc.nextDouble();

				student.name = name;
				student.marks = marks;

				System.out.println("Student Updated Successfully");
				found = true;
				break;

			}
		}

		if (!found) {
			System.out.println("Student " + id + " not found");
		}

	}

	public static void viewStudentDetails() {
		if (studentList.isEmpty()) {
			System.out.println("No students details are present");
		} else {
			System.out.println("///////StudentDetails///////");
			for (StudentRecordManagementSystem studentDetails : studentList) {
				studentDetails.display();
			}
		}
	}

	public static void deleteStudentDetails() {
		System.out.println("Enter Student Id to delete");
		int id = sc.nextInt();
		

		boolean removeData = false;

		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).studentId == id) {

				studentList.remove(i);
				System.out.println("Student Data removed successfully");
				removeData = true;
				break;

			}
		}

		if (!removeData) {
			System.out.println("Student " + id + " not found");
		}
	}

	public static void main(String[] args)
	{
		
		int choice;
		
		do {
			System.out.println("Student Management System");
			
			System.out.println("1. Insert Student");
            System.out.println("2. Update Student");
            System.out.println("3. View Students");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            
            switch(choice)
            {
            	case 1: insertStudentDetails();
            	break;
            	
            	case 2: updateStudentDetails();
            	break;
            	
            	case 3: viewStudentDetails();
            	break;
            	
            	case 4: deleteStudentDetails();
            	break;
            	
            	case 5: 
            		System.out.println("Program exited");
            		break;
            	default: System.out.println("Invalid choice/number");
            }
			
		}while(choice != 5);
		
		
	}

}
