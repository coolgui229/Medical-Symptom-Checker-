package healthsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField t1;
    JPasswordField p1;
    JButton b1, b2;

    public Login() {
        // Title and layout setup
        setTitle("Symptocare - Login");
        setLayout(null);

        // Username Label and Field
        l1 = new JLabel("Username:");
        l1.setFont(new Font("Verdana", Font.PLAIN, 14));
        l1.setBounds(100, 100, 100, 30);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(200, 100, 200, 30);
        add(t1);

        // Password Label and Field
        l2 = new JLabel("Password:");
        l2.setFont(new Font("Verdana", Font.PLAIN, 14));
        l2.setBounds(100, 150, 100, 30);
        add(l2);

        p1 = new JPasswordField();
        p1.setBounds(200, 150, 200, 30);
        add(p1);

        // Login Button
        b1 = new JButton("Login");
        b1.setBounds(200, 200, 100, 30);
        b1.addActionListener(this);
        add(b1);

        // Sign Up Button
        b2 = new JButton("Sign Up");
        b2.setBounds(320, 200, 100, 30);
        b2.addActionListener(this);
        add(b2);

        // Frame settings
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            // Perform login validation here
            String username = t1.getText();
            String password = new String(p1.getPassword());

            if (username.equals("user") && password.equals("password")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
                new Home();  // Proceed to Home screen
                this.dispose();  // Close login window
            } else {
                JOptionPane.showMessageDialog(this, "Invalid credentials. Try again.");
            }
        } else if (e.getSource() == b2) {
            new Signup2();  // Open Signup screen
            this.dispose();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
