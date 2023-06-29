package loginmodule;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class LoginUserForm extends JFrame implements ActionListener{
    private final JPanel panelA, panelB, panelC;
    private final JLabel userLabel, passwordLabel;
    private final JTextField userNameTxtBox;
    private final JPasswordField passwordTxtBox;
    private final JButton loginBtn, clearBtn, signUpLinkBtn;
    private VerifyUserLogin verifier;
    private String enteredUserName, enteredPassword;
    private final SignupUserForm signup = new SignupUserForm(this);
    private MainPageForm mainForm;
    
    public LoginUserForm() {
        userLabel = new JLabel();
        userLabel.setText("User name:");
        userNameTxtBox = new JTextField();
        
        passwordLabel = new JLabel();
        passwordLabel.setText("Password:");
        passwordTxtBox = new JPasswordField();
        
        loginBtn = new JButton("Login");
        clearBtn = new JButton("Clear");
        
        signUpLinkBtn = new JButton("<html><a href=''>Sign Up</a></html>");
        signUpLinkBtn.setForeground(Color.BLUE.darker());
        signUpLinkBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        signUpLinkBtn.setBorder(BorderFactory.createEmptyBorder());
        signUpLinkBtn.setContentAreaFilled(false);
        
        panelA = new JPanel();
        panelA.setLayout(new BoxLayout(panelA, BoxLayout.PAGE_AXIS));
        panelA.setBorder(new EmptyBorder(15, 10, 0, 10));
        
        panelB = new JPanel();
        panelB.setLayout(new GridLayout(1, 1, 5, 5));
        panelB.setBorder(new EmptyBorder(0, 10, 0, 10));
        
        panelC = new JPanel();
        panelC.setLayout(new BoxLayout(panelC, BoxLayout.PAGE_AXIS));
        panelC.setBorder(new EmptyBorder(0, 10, 0, 10));
        
        panelA.add(userLabel);
        panelA.add(userNameTxtBox);
        panelA.add(passwordLabel);
        panelA.add(passwordTxtBox);
        
        panelB.add(clearBtn);
        panelB.add(loginBtn);
        
        panelC.add(signUpLinkBtn);
        
        loginBtn.addActionListener(this);
        clearBtn.addActionListener(this);
        signUpLinkBtn.addActionListener(this);
    }
    
    public void setForm() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0; c.gridy = 0;
        c.weightx = 1.0; c.weighty = 0.1;
        this.add(panelA, c);
        c.gridx = 0; c.gridy = 1;
        this.add(panelB, c);
        c.gridx = 0; c.gridy = 2;
        this.add(panelC, c);
        this.setTitle("Login Form");
        this.setSize(250, 230);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginBtn) {
            enteredUserName = userNameTxtBox.getText().toString();
            enteredPassword = passwordTxtBox.getText().toString();
            this.validateUserInput();
        } else if (e.getSource() == clearBtn) {
            this.clearFields();
        } else if (e.getSource() == signUpLinkBtn) {
            this.setVisible(false);
            int result = signup.showSignupDialog();
            if(result == SignupUserForm.CANCEL_OPTION || result == SignupUserForm.COMPLETE_OPTION) {
                this.clearFields();
                this.setVisible(true);
            }
        }
    }
    
    private void clearFields() {
        userNameTxtBox.setText("");
        passwordTxtBox.setText("");
    }
    
    private void validateUserInput() {
        if (enteredUserName.equals("") || enteredPassword.equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.", "Warning!", JOptionPane.ERROR_MESSAGE);
        } else {
            verifier = new VerifyUserLogin();
            if(verifier.verifyUserLoginCredentials(enteredUserName, enteredPassword)) {
                this.setVisible(false);
                mainForm = new MainPageForm(enteredUserName);
            } else {
                JOptionPane.showMessageDialog(this, "The username or password you entered is incorrect.", "Warning!", JOptionPane.ERROR_MESSAGE);
            }
        }
    } 
}
