package StudentInformationSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainOperations {
    //EVERYTHING IS DONE IN CONSOLE INPUT OUTPUT!!!

    static List<StudentInfo> list;

    public static void main(String[] args) {

        list=new ArrayList<>();

        Scanner sc=new Scanner(System.in);

        char ch='Y';
        do {

            System.out.println("--------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Select one of the two operations - \n 1.Add Details of a new Student \n 2.Delete an entry \n 3.Get Details of Students \n 4.Exit");
            System.out.println("Press 1 for first option and 2 for second and so on....");

            int selOption=sc.nextInt();

            if(selOption==1)
            {
                System.out.println("Enter Roll No., name, gender & Phone No. of student respectively:");
                int roll=sc.nextInt();
                String dummy=sc.nextLine();
                String name=sc.nextLine();
                String gender=sc.nextLine();
                Long phone=sc.nextLong();
                StudentInfo newStud=new StudentInfo(roll, name, gender, phone);
                list.add(newStud);
            }
            else if(selOption==2)
            {
                System.out.println("\nEnter Roll No. of Student whose entry is to be deleted.");
                int id=sc.nextInt();
                deleteEntry(id);
            }
            else if(selOption==3)
            {
                getDetails();
            }
            else if(selOption==4)
                return;
            else {
                System.out.println("Wrong no. entered !!");
            }

            System.out.println("Press 'Y' or 'y' to continue else press 'N' or 'n' to abort!!!");
            ch=sc.next().charAt(0);

            if(ch=='N'||ch=='n')
                System.out.println("Aborted!");

        }while(ch=='Y'||ch=='y');

    }

    private static void deleteEntry(int roll)
    {
        int id=0;
        for(StudentInfo s:list)
        {
            if(s.roll==roll)
                break;
            id++;
        }
        try {
            list.remove(id);}
        catch (Exception e) {
            System.out.println("Roll No. does not exist!!!");
        }
        System.out.println();
    }

    private static void getDetails()
    {
        System.out.println("\nRollNo.\t\tNameOfStudent\t\tGender\t\tPhone No.");

        for(StudentInfo s:list)
        {
            System.out.println(s.roll+"\t\t"+s.name+"\t\t"+s.gender+"\t\t"+s.phone);
        }

        System.out.println("\n");
    }
}
