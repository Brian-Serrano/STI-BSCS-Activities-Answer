package loginmodule;

import java.awt.event.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class MainPageForm extends JFrame implements ActionListener{
    private final JPanel mainPanel, panelContainer, leftPanel, rightPanel;
    private JLabel userNameLabel, leftPanelLabel, rightPanelLabel, hourlyRateLabel, totalHoursLabel, overtimeHoursLabel, regularPayLabel, regularPayLabelA, overtimePayLabel, overtimePayLabelA, netPayLabel, netPayLabelA, dummyLabel;
    private final String welcomeMessage = "Welcome, ";
    private final String userName;
    private final JButton clearBtn, computeBtn;
    private final JTextField hourlyRateTxtBox, totalHoursTxtBox, overtimeHoursTxtBox;
    private PayrollCalculator calculator = new PayrollCalculator();
    private double regularPay, overtimePay, netPay, hoursWorked, hourlyRate, overtimeHours;
    
    public MainPageForm(String username) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Main Form");
        this.setSize(700, 280);
        //this.setResizable(false);
        this.setLocationRelativeTo(null);
        mainPanel = new JPanel();
        
        userName = username;
        userNameLabel = new JLabel(welcomeMessage + userName + "!");
        userNameLabel.setHorizontalAlignment(JLabel.RIGHT);
        userNameLabel.setFont(new Font("Calibri", Font.BOLD, 18));
        userNameLabel.setBounds(0, 10, this.getWidth()-30, 50);
        
        panelContainer = new JPanel();
        panelContainer.setLayout(new GridLayout(1, 1, 5, 1));
        panelContainer.setBounds(0, (userNameLabel.getY()+userNameLabel.getHeight())-30, this.getWidth()-20, 150);
        
        leftPanel = new JPanel();
        leftPanel.setOpaque(true);
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.PAGE_AXIS));
        leftPanel.setBorder(new EmptyBorder(15, 10, 0, 10));
        
        leftPanelLabel = new JLabel("<html><u>Compute Salary</u></html>");
        leftPanelLabel.setFont(new Font("Calibri", Font.BOLD, 18));
        
        hourlyRateLabel = new JLabel("Rate per hour:");
        hourlyRateTxtBox = new JTextField();
        hourlyRateTxtBox.setHorizontalAlignment(JTextField.RIGHT);
        totalHoursLabel = new JLabel("Total hours worked:");
        totalHoursTxtBox = new JTextField();
        totalHoursTxtBox.setHorizontalAlignment(JTextField.RIGHT);
        overtimeHoursLabel = new JLabel("Total hours of overtime:");
        overtimeHoursTxtBox = new JTextField(); 
        overtimeHoursTxtBox.setHorizontalAlignment(JTextField.RIGHT);
        
        leftPanel.add(leftPanelLabel);
        leftPanel.add(hourlyRateLabel);
        leftPanel.add(hourlyRateTxtBox);
        leftPanel.add(totalHoursLabel);
        leftPanel.add(totalHoursTxtBox);
        leftPanel.add(overtimeHoursLabel);
        leftPanel.add(overtimeHoursTxtBox);

        clearBtn = new JButton("Clear");
        clearBtn.setBounds(10, 200, 100, 30);
        computeBtn = new JButton("Compute salary");
        computeBtn.setBounds(clearBtn.getX()+clearBtn.getWidth()+10, 200, 150, 30);
        
        this.add(clearBtn);
        this.add(computeBtn);
        
        rightPanel = new JPanel();
        rightPanel.setOpaque(true);
        rightPanel.setLayout(new GridLayout(4, 2));
        rightPanel.setBorder(new EmptyBorder(15, 10, 0, 10));
        
        rightPanelLabel = new JLabel("<html><u>Payroll</u></html>");
        rightPanelLabel.setFont(new Font("Calibri", Font.BOLD, 18));
        
        regularPayLabel = new JLabel("Regular pay:");
        dummyLabel = new JLabel("");
        regularPayLabelA = new JLabel("0.0");
        regularPayLabelA.setHorizontalAlignment(JLabel.RIGHT);
        overtimePayLabel = new JLabel("Overtime pay:");
        overtimePayLabelA = new JLabel("0.0");
        overtimePayLabelA.setHorizontalAlignment(JLabel.RIGHT);
        
        netPayLabel = new JLabel("Net pay:");
        netPayLabel.setFont(new Font("Calibri", Font.ITALIC, 20));
        netPayLabelA = new JLabel("0.0");
        netPayLabelA.setFont(new Font("Calibri", Font.ITALIC, 20));
        netPayLabelA.setHorizontalAlignment(JLabel.RIGHT);
        netPayLabel.setForeground(Color.blue.darker());
        netPayLabelA.setForeground(Color.blue.darker());
        
        rightPanel.add(rightPanelLabel);
        rightPanel.add(dummyLabel);
        rightPanel.add(regularPayLabel);
        rightPanel.add(regularPayLabelA);
        rightPanel.add(overtimePayLabel);
        rightPanel.add(overtimePayLabelA);
        rightPanel.add(netPayLabel);
        rightPanel.add(netPayLabelA);
        
        panelContainer.add(leftPanel);
        panelContainer.add(rightPanel);
        
        mainPanel.setLayout(null);
        mainPanel.add(userNameLabel);
        mainPanel.add(panelContainer);
        
        this.add(mainPanel);
        this.validate();
        this.setVisible(true);
        computeBtn.addActionListener(this);
        clearBtn.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == computeBtn) {
            if (validateInput()) {
                hourlyRate = Double.parseDouble(hourlyRateTxtBox.getText());
                hoursWorked = Double.parseDouble(totalHoursTxtBox.getText());
                overtimeHours = Double.parseDouble(overtimeHoursTxtBox.getText());
                netPay = calculator.getTotalSalary(hourlyRate, hoursWorked, overtimeHours);
                regularPay = calculator.getRegularPay();
                overtimePay = calculator.getOverTimePay();
                regularPayLabelA.setText(Double.toString(regularPay));
                overtimePayLabelA.setText(Double.toString(overtimePay));
                netPayLabelA.setText(Double.toString(netPay));
            } else {
                JOptionPane.showMessageDialog(this, "Please fill all fields.", "Warning!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            clearInput();
        }
    }
    
    private boolean validateInput() {
        if (hourlyRateTxtBox.getText().equals("") || totalHoursTxtBox.getText().equals("") || overtimeHoursTxtBox.getText().equals("")) {
            return false;
        }
        return true;
    }
    
    private void clearInput() {
        hourlyRateTxtBox.setText("");
        totalHoursTxtBox.setText("");
        overtimeHoursTxtBox.setText("");
        regularPayLabelA.setText("0.0");
        overtimePayLabelA.setText("0.0");
        netPayLabelA.setText("0.0");
    }
}