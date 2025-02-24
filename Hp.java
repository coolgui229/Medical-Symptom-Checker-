package healthsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener {

    JButton b1, b2, b3;

    public Home() {
        // Title and layout setup
        setTitle("Symptocare - Home");
        setLayout(null);

        // Buttons for navigation
        b1 = new JButton("Symptom Checker");
        b1.setBounds(100, 100, 200, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Treatment Centers");
        b2.setBounds(100, 160, 200, 40);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("Logout");
        b3.setBounds(100, 220, 200, 40);
        b3.addActionListener(this);
        add(b3);

        // Frame settings
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            // Open Symptom Checker screen
            JOptionPane.showMessageDialog(this, "Opening Symptom Checker");
        } else if (e.getSource() == b2) {
            new TreatmentCenters();  // Open Treatment Centers screen
            this.dispose();  // Close Home screen
        } else if (e.getSource() == b3) {
            new Login();  // Log out and go back to Login screen
            this.dispose();  // Close Home screen
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}
