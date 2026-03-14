//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package BankManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
    JButton login;
    JButton signup;
    JButton clear;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login() {
        this.setTitle("AUTOMATED TELLER MACHINE(ATM)");
        this.setLayout((LayoutManager)null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, 1);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        this.add(label);
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", 1, 38));
        text.setBounds(200, 40, 400, 40);
        this.add(text);
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", 1, 38));
        cardno.setBounds(100, 160, 180, 40);
        this.add(cardno);
        this.cardTextField = new JTextField();
        this.cardTextField.setBounds(300, 168, 250, 30);
        this.cardTextField.setFont(new Font("Arial", 1, 14));
        this.add(this.cardTextField);
        JLabel pin = new JLabel("Pin:");
        pin.setFont(new Font("Raleway", 1, 38));
        pin.setBounds(100, 220, 250, 40);
        this.add(pin);
        this.pinTextField = new JPasswordField();
        this.pinTextField.setBounds(300, 228, 250, 30);
        this.pinTextField.setFont(new Font("Arial", 1, 14));
        this.add(this.pinTextField);
        this.login = new JButton("Sign IN");
        this.login.setBounds(300, 300, 100, 30);
        this.login.setBackground(Color.black);
        this.login.setForeground(Color.white);
        this.login.addActionListener(this);
        this.add(this.login);
        this.clear = new JButton("Clear");
        this.clear.setBounds(450, 300, 100, 30);
        this.clear.setBackground(Color.black);
        this.clear.setForeground(Color.white);
        this.clear.addActionListener(this);
        this.add(this.clear);
        this.signup = new JButton("Sign up");
        this.signup.setBounds(300, 350, 250, 30);
        this.signup.setBackground(Color.black);
        this.signup.setForeground(Color.white);
        this.signup.addActionListener(this);
        this.add(this.signup);
        this.getContentPane().setBackground(Color.lightGray);
        this.setSize(810, 490);
        this.setVisible(true);
        this.setLocation(400, 150);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.clear) {
            this.cardTextField.setText("");
            this.pinTextField.setText("");
        } else if (ae.getSource() != this.signup && ae.getSource() == this.login) {
        }

    }

    public static void main(String[] args) {
        new Login();
    }
}

