package healthsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {

    JTextField t1, t2, t3, t4, t5;
    JButton b1;

    public Signup2() {
        setTitle("Symptocare - Sign Up");
        setLayout(null);

        // User Details Fields
        JLabel l1 = new JLabel("Email:");
        l1.setBounds(100, 50, 100, 30);
        add(l1);
        t1 = new JTextField();
        t1.setBounds(200, 50, 200, 30);
        add(t1);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(100, 100, 100, 30);
        add(l2);
        t2 = new JTextField();
        t2.setBounds(200, 100, 200, 30);
        add(t2);

        JLabel l3 = new JLabel("Weight:");
        l3.setBounds(100, 150, 100, 30);
        add(l3);
        t3 = new JTextField();
        t3.setBounds(200, 150, 200, 30);
        add(t3);

        JLabel l4 = new JLabel("Height:");
        l4.setBounds(100, 200, 100, 30);
        add(l4);
        t4 = new JTextField();
        t4.setBounds(200, 200, 200, 30);
        add(t4);

        JLabel l5 = new JLabel("Medications:");
        l5.setBounds(100, 250, 100, 30);
        add(l5);
        t5 = new JTextField();
        t5.setBounds(200, 250, 200, 30);
        add(t5);

        // Sign Up Button
        b1 = new JButton("Sign Up");
        b1.setBounds(200, 300, 100, 30);
        b1.addActionListener(this);
        add(b1);

        // Frame settings
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String email = t1.getText();
        String password = t2.getText();
        String weight = t3.getText();
        String height = t4.getText();
        String medications = t5.getText();

        // Here you can insert the signup data into the database

        JOptionPane.showMessageDialog(this, "Account created successfully!");
        new Login();  // Go to Login page
        this.dispose();  // Close the signup screen
    }

    public static void main(String[] args) {
        new Signup2();
    }
}
