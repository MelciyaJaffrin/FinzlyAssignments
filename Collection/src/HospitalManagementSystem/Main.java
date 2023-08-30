package HospitalManagementSystem;

import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
    static  Map<Integer,Patient> patients = new HashMap<>();

    public static void main(String[] args) {
        
        while (true){
            System.out.println();
            System.out.println("Hospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patient Details");
            System.out.println("3. Search Patient by ID");
            System.out.println("4. List All Patients");
            System.out.println("5. Exit");
            System.out.println();
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    addPatient();
                    break;
                case 2 :
                    viewPatientDetails();
                    break;
                case 3 :
                    searchPatient();
                    break;
                case 4 :
                    listAllPatients();
                    break;
                case 5 :
                	System.out.println("System closed");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice !!!");
            }
        }
    }

    private static void listAllPatients() {
        for (Patient patient: patients.values()){
            System.out.println(patient.toString());
        }
    }

    private static void searchPatient() {
        System.out.println("Enter Patient Id");
        int id = sc.nextInt();
        if (patients.containsKey(id)){
            System.out.println(patients.get(id).toString());
        } else {
            System.out.println("No Record Found !!!");
        }
    }

    private static void viewPatientDetails() {
        System.out.println("Enter Patient Id ");
        int id = sc.nextInt();
        if (patients.containsKey(id)){
            System.out.println(patients.get(id).toString());
        } else {
            System.out.println("No Record Found !!!");
        }
    }

    private static void addPatient() {
        System.out.println("Enter Patient ID");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Patient Name");
        String name = sc.nextLine();
        System.out.println("Enter Patient Age");
        int age = sc.nextInt();
        patients.put(id,new Patient(id,name,age));
        System.out.println("Patient Added");
    }

}
