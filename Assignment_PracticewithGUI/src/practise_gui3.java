import javax.swing.*;
import java.awt.*;
public class practise_gui3 extends JFrame
		{
		private static final int WIDTH = 500;
		private static final int HEIGHT = 300;
		private JLabel lengthL, widthL, areaL, perimeterL;
		private JTextField lengthTF, widthTF, areaTF,perimeterTF;
		private JButton calculateB,exitB;
		
		public CalculateButtonHandler cbHandler;
		public ExitButtonHandler ebHandler;		
		
		public practise_gui3()
		{
		setTitle("Area and Perimeter of a Rectangle");
		lengthL =new JLabel("Enter the length: ", SwingConstants.RIGHT);
		widthL =new JLabel("Enter the width: ", SwingConstants.RIGHT);
		areaL = new JLabel("Area: ", SwingConstants.RIGHT);
		perimeterL =new JLabel("Perimeter: ", SwingConstants.RIGHT);
		lengthTF = new JTextField(10);
		widthTF = new JTextField(10);
		areaTF = new JTextField(10);
		perimeterTF = new JTextField(10);

		//Create Calculate Button
		calculateB = new JButton("Calculate");
		cbHandler = new CalculateButtonHandler();
		calculateB.addActionListener(cbHandler);
		
		//Create Exit Button
		exitB = new JButton("Exit");
		ebHandler = new ExitButtonHandler();
		exitB.addActionListener(ebHandler);
		
		exitB = new JButton("Exit");
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(5, 2));
		pane.add(lengthL);
		pane.add(lengthTF);
		pane.add(widthL);
		pane.add(widthTF);
		pane.add(areaL);
		pane.add(areaTF);
		pane.add(perimeterL);
		pane.add(perimeterTF);
		pane.add(calculateB);
		pane.add(exitB);
		
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
		public static void main(String[] args)
		{
			practise_gui3 rectObject = new practise_gui3();
		}
}

