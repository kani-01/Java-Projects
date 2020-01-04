import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class CalculateButtonHandler implements	ActionListener //Line 1
	{
	private JTextField lengthTF, widthTF, areaTF,perimeterTF;
	public void actionPerformed(ActionEvent e) //Line 2
	{
	double width, length, area, perimeter; //Line 3
	
	length	= Double.parseDouble(lengthTF.getText()); //Line 4
	width	= Double.parseDouble(widthTF.getText()); //Line 5
	area = length * width; //Line 6
	perimeter = 2 * (length + width); //Line 7
	areaTF.setText("" + area); //Line 8
	perimeterTF.setText("" + perimeter); //Line 9
	}
	}

