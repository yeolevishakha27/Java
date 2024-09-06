import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResumeBuilderGUI {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Resume Builder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());

        // Create a panel to hold the form components
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(7, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Create components with labels and text fields
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();
        JLabel phoneLabel = new JLabel("Phone:");
        JTextField phoneField = new JTextField();
        JLabel educationLabel = new JLabel("Education:");
        JTextField educationField = new JTextField();
        JLabel experienceLabel = new JLabel("Experience:");
        JTextField experienceField = new JTextField();
        JLabel skillsLabel = new JLabel("Skills:");
        JTextField skillsField = new JTextField();
        JButton submitButton = new JButton("Submit");

        // Customize component appearance
        nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        emailLabel.setFont(new Font("Arial", Font.BOLD, 14));
        phoneLabel.setFont(new Font("Arial", Font.BOLD, 14));
        educationLabel.setFont(new Font("Arial", Font.BOLD, 14));
        experienceLabel.setFont(new Font("Arial", Font.BOLD, 14));
        skillsLabel.setFont(new Font("Arial", Font.BOLD, 14));

        nameField.setFont(new Font("Arial", Font.PLAIN, 14));
        emailField.setFont(new Font("Arial", Font.PLAIN, 14));
        phoneField.setFont(new Font("Arial", Font.PLAIN, 14));
        educationField.setFont(new Font("Arial", Font.PLAIN, 14));
        experienceField.setFont(new Font("Arial", Font.PLAIN, 14));
        skillsField.setFont(new Font("Arial", Font.PLAIN, 14));

        // Set background color for the form panel
        formPanel.setBackground(new Color(245, 245, 245));

        // Add components to the panel
        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(emailLabel);
        formPanel.add(emailField);
        formPanel.add(phoneLabel);
        formPanel.add(phoneField);
        formPanel.add(educationLabel);
        formPanel.add(educationField);
        formPanel.add(experienceLabel);
        formPanel.add(experienceField);
        formPanel.add(skillsLabel);
        formPanel.add(skillsField);

        // Add submit button to the panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(230, 230, 230));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        buttonPanel.add(submitButton);

        // Add panels to the frame
        frame.add(formPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Add action listener to the button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();
                String education = educationField.getText();
                String experience = experienceField.getText();
                String skills = skillsField.getText();

                // Display the resume in a dialog box
                JOptionPane.showMessageDialog(frame,
                        "Name: " + name + "\nEmail: " + email + "\nPhone: " + phone +
                        "\nEducation: " + education + "\nExperience: " + experience +
                        "\nSkills: " + skills,
                        "Resume",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
