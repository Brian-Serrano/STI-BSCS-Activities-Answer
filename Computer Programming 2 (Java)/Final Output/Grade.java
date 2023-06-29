import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Grade implements ActionListener
{
	private static JLabel name;
	private static JLabel one;
	private static JLabel two;
	private static JTextField name2;
	private static JTextField one2;
	private static JTextField two2;
	private static JButton average;
	private static JLabel averagedisplay;

	public static void main(String[] args){

		JPanel pa = new JPanel ();
		JFrame fr = new JFrame("Grade");
		fr.setSize(450, 250);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.add(pa);
		pa.setLayout(null);

		name = new JLabel("Name");
		name.setBounds(10, 20, 115, 25);
		pa.add(name);

		name2 = new JTextField(20);
		name2.setBounds(135, 20, 200, 25);
		pa.add(name2);

		one = new JLabel("1st Sem Grade");
		one.setBounds(10, 50, 115, 25);
		pa.add(one);

		one2 = new JTextField(20);
		one2.setBounds(135, 50, 200, 25);
		pa.add(one2);

		two = new JLabel("2nd Sem Grade");
		two.setBounds(10, 80, 115, 25);
		pa.add(two);

		two2 = new JTextField(20);
		two2.setBounds(135, 80, 200, 25);
		pa.add(two2);

		average = new JButton("Display Average");
		average.setBounds(10, 110, 140, 25);
		average.addActionListener(new Grade());
		pa.add(average);

		averagedisplay = new JLabel("");
		averagedisplay.setBounds(10, 140, 115, 25);
		pa.add(averagedisplay);

		fr.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		double one3 = Double.parseDouble(one2.getText());
		double two3 = Double.parseDouble(two2.getText());
		double displayed = (one3 + two3)/2;
		averagedisplay.setText(Double.toString(displayed));
	}
}