
package BankManagementSystem;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class SignupOne extends JFrame {
    SignupOne() {
        this.setLayout((LayoutManager)null);

        Random ran = new Random();
        System.out.println(ran);
        long random = Math.abs(ran.nextLong() % 9000L) + 1000L;

        JLabel formno = new JLabel("APPLICATION FORM NO : " + random);
        formno.setFont(new Font("Raleway",Font.BOLD, 38));
        formno.setBounds(140,20,600,40);
        add(formno);

        JLabel personDetails = new JLabel ("Page 1: Personal Details");
        personDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personDetails.setBounds(290,80,300,40);
        add(personDetails);

        JLabel name = new JLabel ("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100,150,100,30);
        add(name);

        JTextField nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD,14));
        nameTextField.setBounds(300,150,400,30);
        add(nameTextField);

        JLabel fathersName = new JLabel("Father's Name:");
        fathersName.setFont(new Font("Raleway",Font.BOLD,20));
        fathersName.setBounds(100,190,200,30);
        add(fathersName);

        JTextField fathersNameTextField = new JTextField();
        fathersNameTextField.setFont(new Font("Raleway", Font.BOLD,20));
        fathersNameTextField.setBounds(300,190,200,30);
        add(fathersNameTextField);



        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD,20 ));
        dob.setBounds(100,230,200,30);
        add(dob);

        JTextField dobTextField = new JTextField();
        dobTextField.setFont(new Font("Raleway", Font.BOLD,30));
        dobTextField.setBounds(300,230,200,30);
        add(dobTextField);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD,20 ));
        gender.setBounds(100,270,200,30);
        add(gender);

        JTextField genderTextField = new JTextField();
        genderTextField.setFont(new Font("Raleway", Font.BOLD,20 ));
        genderTextField.setBounds(300,270,200,30);
        add(genderTextField);

        JLabel mail = new JLabel("Email:");
        mail.setFont(new Font("Raleway", Font.BOLD,20 ));
        mail.setBounds(100,310,200,30);
        add(mail);

        JTextField mailTextField = new JTextField();
        mailTextField.setFont(new Font("Raleway", Font.BOLD,20 ));
        mailTextField.setBounds(300,310,200,30);
        add(mailTextField);

        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD,20 ));
        marital.setBounds(100,350,200,30);
        add(marital);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD,20 ));
        address.setBounds(100,390,200,30);
        add(address);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD,20 ));
        city.setBounds(100,430,200,30);
        add(city);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD,20 ));
        state.setBounds(100,470,200,30);
        add(state);

        JLabel pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway", Font.BOLD,20 ));
        pincode.setBounds(100,510,200,30);
        add(pincode);


        this.add(formno);
        this.add(personDetails);
        this.getContentPane().setBackground(Color.white);
        this.setSize(850, 800);
        this.setLocation(350, 10);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new SignupOne();
    }
}
