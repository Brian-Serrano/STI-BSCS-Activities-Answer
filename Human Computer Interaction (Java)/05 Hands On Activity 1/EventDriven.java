import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventDriven extends JFrame {

    JPanel pnlMain = new JPanel();

    JLabel lblFirstName = new JLabel("First Name:");
    JLabel lblLastName = new JLabel("Last Name:");
    JLabel lblMiddleName = new JLabel("Middle Name:");
    JLabel lblMobileNumber = new JLabel("Mobile Number:");
    JLabel lblEmailAddress = new JLabel("Email Address:");

    JTextField fldFirstName = new JTextField(15);
    JTextField fldLastName = new JTextField(15);
    JTextField fldMiddleName = new JTextField(15);
    JTextField fldMobileNumber = new JTextField(15);
    JTextField fldEmailAddress = new JTextField(15);

    JButton btnSubmit2 = new JButton("Submit");
    JButton btnClearAll2 = new JButton("Clear All");

    JFrame output = new JFrame("OUTPUT");
    JTextArea outputarea = new JTextArea(10,25);
    JButton btnOkay2 = new JButton("Okay");

    FlowLayout fl = new FlowLayout();

    public EventDriven(){

    	this.setSize(230,310);
    	this.setLocation(200,200);
    	this.setTitle("INPUT");
    	this.setResizable(false);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	pnlMain.add(lblFirstName);
    	pnlMain.add(fldFirstName);
    	pnlMain.add(lblLastName);
    	pnlMain.add(fldLastName);
    	pnlMain.add(lblMiddleName);
    	pnlMain.add(fldMiddleName);
    	pnlMain.add(lblMobileNumber);
    	pnlMain.add(fldMobileNumber);
    	pnlMain.add(lblEmailAddress);
    	pnlMain.add(fldEmailAddress);

		btnSubmit2.addActionListener(new btnSubmit());
    	pnlMain.add(btnSubmit2);
		btnClearAll2.addActionListener(new btnClearAll());
		pnlMain.add(btnClearAll2);

		this.add(pnlMain);
		this.setVisible(true);
    }

    class btnSubmit implements ActionListener{

    	@Override
    	public void actionPerformed(ActionEvent a){

			String firstname = fldFirstName.getText();
			String lastname = fldLastName.getText();
			String middlename = fldMiddleName.getText();
			String mobilenumber = fldMobileNumber.getText();
			String emailaddress = fldEmailAddress.getText();

			output.setSize(310,240);
			output.setLocation(200,200);

			outputarea.setEditable(false);
			outputarea.setText("");
			outputarea.append("\nFirst Name: " + firstname + "\nLast Name: " + lastname + "\nMiddle Name: " + middlename + "\nMobile Number: " + mobilenumber + "\nEmail Address: " + emailaddress);


			output.add(outputarea);
			btnSubmit2.setEnabled(false);

			btnOkay2.addActionListener(new btnOkay());
			output.add(btnOkay2);

			output.setVisible(true);
			output.setLayout(new FlowLayout());

    	}
    }

    class btnClearAll implements ActionListener{

    	@Override
    	public void actionPerformed(ActionEvent e){

    		fldFirstName.setText("");
    		fldLastName.setText("");
    		fldMiddleName.setText("");
    		fldMobileNumber.setText("");
    		fldEmailAddress.setText("");
    	}

    }

    class btnOkay implements ActionListener{

    	@Override
    	public void actionPerformed(ActionEvent d){

    		outputarea.setText("");
    		output.setVisible(false);
    		btnSubmit2.setEnabled(true);

    		fldFirstName.setText("");
    		fldLastName.setText("");
    		fldMiddleName.setText("");
    		fldMobileNumber.setText("");
    		fldEmailAddress.setText("");
    	}

    }

    public static void main(String[] args) {
		EventDriven eventdriven = new EventDriven();
    }
}
