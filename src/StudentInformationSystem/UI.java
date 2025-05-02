package StudentInformationSystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class UI extends JFrame implements ActionListener{
    List<StudentInfo> list;

    JButton B1,B2,B3;
    JTextArea A1;
    JTextField T1,T2,T3,T4;
    JTextField del;
    JLabel L1,L2,L3,L4,delL;

    public UI() {
        super("Welcome to Student Manager!");
        list=new ArrayList<StudentInfo>();

        L1=new JLabel("Enter Roll No.");
        L1.setBounds(50,25,200,30);
        T1=new JTextField();
        T1.setBounds(50,50,200,30);

        L2=new JLabel("Enter Name Of the Student");
        L2.setBounds(50,100,200,30);
        T2=new JTextField();
        T2.setBounds(50,125,200,30);

        L3=new JLabel("Enter Gender");
        L3.setBounds(50,175,200,30);
        T3=new JTextField();
        T3.setBounds(50,200,200,30);

        L4=new JLabel("Enter Phone No.");
        L4.setBounds(50,250,200,30);
        T4=new JTextField();
        T4.setBounds(50,275,200,30);

        del=new JTextField();
        del.setBounds(225,375,150,30);

        delL=new JLabel("Write Roll No. to be deleted!(Below)");
        delL.setBounds(225, 350, 200, 30);

        B1=new JButton("Add New Student");
        B1.setBounds(50, 325, 150, 30);
        B1.addActionListener(this);

        B2=new JButton("Delete");
        B2.setBounds(225, 325, 150, 30);
        B2.addActionListener(this);

        B3=new JButton("Show Details");
        B3.setBounds(50, 375, 150, 30);
        B3.addActionListener(this);


        A1=new JTextArea("Currently their is nothing in the Database!");
        A1.setBounds(450,25,700,500);
        A1.setVisible(true);

        add(L1);add(T1);
        add(L2);add(T2);
        add(L3);add(T3);
        add(L4);add(T4);
        add(B1);add(B2);
        add(B3);add(delL);
        add(A1);add(del);
        setLayout(null);
        setVisible(true);
        setSize(1200,650);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==B1)
        {
            int roll=Integer.parseInt(T1.getText());
            String name=T2.getText();
            String gender=T3.getText();
            Long phone=Long.parseLong(T4.getText());
            StudentInfo newStud=new StudentInfo(roll,name,gender,phone);

            boolean doesContains=false;
            for(StudentInfo stud:list)
            {
                if(stud.roll==roll)
                {
                    doesContains=true;break;
                }
            }
            if(!doesContains)
                list.add(newStud);
        }
        else if(e.getSource()==B2)
        {
            int roll=Integer.parseInt(del.getText());

            int id=0;
            for(StudentInfo s:list)
            {
                if(s.roll==roll)
                    break;
                id++;
            }
            try {
                list.remove(id);}
            catch (Exception ef) {
//				System.out.println("Roll No. does not exist!!!");
                A1.append("Roll No. does not exist!!!");
            }

        }
        else
        {
            A1.setVisible(true);
            A1.setText("");
            A1.setText("\nRollNo.\t\tName\t\tGender\t\tPhone No.");
            for(StudentInfo s:list)
            {
                A1.append("\n"+s.roll+"\t\t"+s.name+"\t\t"+s.gender+"\t\t"+s.phone+"\n");
            }
        }

    }

    //Just For Testing UI!!!
    public static void main(String [] args)
    {
        new UI();
    }

}
