package loginmodule;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class SignupUserForm extends JDialog implements ActionListener {
    private final JPanel panelA, panelB;
    private final JLabel newUserNameLabel, newPasswordLabel, confirmNewPasswordLabel;
    private final JTextField newUserNameLabelTxtBox;
    private final JPasswordField newPasswordTxtBox, confirmNewPasswordTxtBox;
    private final JButton signUpBtn, cancelBtn;
    private int result = -1;
    public static final int COMPLETE_OPTION = 1; //return 1 if sign up is complete
    public static final int CANCEL_OPTION = 0; //return 0 if sign up is cancelled
    private final SaveNewCredentialsToFile saver = new SaveNewCredentialsToFile();
    private String enteredUserName, enteredPassword, enteredConfirmPassword;
    
    public SignupUserForm(Frame parent) {
        super(parent, true);
        newUserNameLabel = new JLabel();
        newUserNameLabel.setText("User name:");
        newUserNameLabelTxtBox = new JTextField();
        
        newPasswordLabel = new JLabel();
        newPasswordLabel.setText("Password:");
        newPasswordTxtBox = new JPasswordField();
        
        confirmNewPasswordLabel = new JLabel();
        confirmNewPasswordLabel.setText("Confirm password:");
        confirmNewPasswordTxtBox = new JPasswordField();
        
        signUpBtn = new JButton("Sign Up");
        cancelBtn = new JButton("Cancel");
        
        panelA = new JPanel();
        panelA.setLayout(new BoxLayout(panelA, BoxLayout.PAGE_AXIS));
        panelA.setBorder(new EmptyBorder(15, 10, 0, 10));
        
        panelB = new JPanel();
        panelB.setLayout(new GridLayout(1, 1, 5, 5));
        panelB.setBorder(new EmptyBorder(0, 10, 10, 10));
        
        panelA.add(newUserNameLabel);
        panelA.add(newUserNameLabelTxtBox);
        panelA.add(newPasswordLabel);
        panelA.add(newPasswordTxtBox);
        panelA.add(confirmNewPasswordLabel);
        panelA.add(confirmNewPasswordTxtBox);
        
        panelB.add(cancelBtn);
        panelB.add(signUpBtn);
        
        cancelBtn.addActionListener(this);
        signUpBtn.addActionListener(this);
        
        this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0; c.gridy = 0;
        c.weightx = 1.0; c.weighty = 0.1;
        this.add(panelA, c);
        c.gridx = 0; c.gridy = 1;
        this.add(panelB, c);
        this.setTitle("Sign Up Form");
        this.setSize(250, 230);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    
    public int showSignupDialog() {
        this.clearFields();
        enteredUserName = enteredPassword = enteredConfirmPassword = "";
        this.setVisible(true);
        return result;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cancelBtn) {
            result = CANCEL_OPTION;
            this.setVisible(false);
            this.clearFields();
        } else if (e.getSource() == signUpBtn) {
            enteredUserName = newUserNameLabelTxtBox.getText().toString();
            enteredPassword = newPasswordTxtBox.getText().toString();
            enteredConfirmPassword = confirmNewPasswordTxtBox.getText().toString();
            this.validateUserInput();
        }
    }
    
    private void clearFields() {
        newUserNameLabelTxtBox.setText("");
        newPasswordTxtBox.setText("");
        confirmNewPasswordTxtBox.setText("");
    }
    
    private void validateUserInput() {
        if (enteredUserName.equals("") || enteredPassword.equals("") || enteredConfirmPassword.equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.", "Warning!", JOptionPane.ERROR_MESSAGE);
        } else {
            if (enteredPassword.equals(enteredConfirmPassword)) {
                if (saver.saveCredentials(enteredUserName, enteredPassword)) {
                    JOptionPane.showMessageDialog(this, "You have successfully created a new account.", "Message!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Can't create new account. Please contact your administrator.", "Warning!", JOptionPane.ERROR_MESSAGE);
                }
                result = COMPLETE_OPTION;
                this.setVisible(false);
                this.clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Password and confirm password does not match.", "Warning!", JOptionPane.ERROR_MESSAGE);
            }
        }
            
    }
}