import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Signup Page");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create username label and field
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(10, 20, 80, 25);
        frame.add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(100, 20, 165, 25);
        frame.add(usernameField);

        // Create password label and field
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        frame.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(100, 50, 165, 25);
        frame.add(passwordField);

        // Create email label and field
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(10, 80, 80, 25);
        frame.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(100, 80, 165, 25);
        frame.add(emailField);

        // Create signup button
        JButton signupButton = new JButton("Sign Up");
        signupButton.setBounds(100, 110, 100, 25);
        frame.add(signupButton);

        // Add action listener to the button
        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                String email = emailField.getText();

                // Basic validation
                if (username.isEmpty() || password.isEmpty() || email.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "All fields are required!");
                } else {
                    // In a real application, you would save these details to a database
                    JOptionPane.showMessageDialog(frame, "Signup successful!");
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}