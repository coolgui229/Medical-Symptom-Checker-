package healthsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TreatmentCenters extends JFrame implements ActionListener {

    JButton b1, b2, b3;

    public TreatmentCenters() {
        setTitle("Symptocare - Treatment Centers");
        setLayout(null);

        // Sample treatment centers
        JLabel label1 = new JLabel("Treatment Center 1 - Address");
        label1.setBounds(100, 100, 250, 30);
        add(label1);

        JLabel label2 = new JLabel("Treatment Center 2 - Address");
        label2.setBounds(100, 150, 250, 30);
        add(label2);

        JLabel label3 = new JLabel("Treatment Center 3 - Address");
        label3.setBounds(100, 200, 250, 30);
        add(label3);

        // Back Button
        b1 = new JButton("Back");
        b1.setBounds(100, 250, 100, 30);
        b1.addActionListener(this);
        add(b1);

        // Frame settings
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            new Home();  // Go back to Home screen
            this.dispose();  // Close Treatment Centers screen
        }
    }

    public static void main(String[] args) {
        new TreatmentCenters();
    }
}
