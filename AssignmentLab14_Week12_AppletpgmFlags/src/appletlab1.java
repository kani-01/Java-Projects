
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class appletlab1 extends Applet{

	 Button nextButton = new Button("Next");
	 int count =0;

	 public void init() {
	 this.add(nextButton);
	 this.setSize(500,500); //you can choose the size
	 ActionListener listener = new NextListener();
	 nextButton.addActionListener(listener);
	 }
	 class NextListener implements ActionListener{
	 public void actionPerformed(ActionEvent event)
	 {
	 count++;
	 repaint();
	 }
	 };

	 public void paint(Graphics g)
	 {
		 int[] xPoints = {0,0,this.getWidth()/2};
		 int[] yPoints = {0,this.getHeight(),this.getHeight()/2};
	 if(count%3==0)
	 //replace the following code with code to draw the Swedish flag
	 {
//		 g.drawString("Applet one code executed", 0,20);
		  int n=this.getWidth()/7;
		  int o=this.getHeight()/7;
		  g.setColor(Color.RED);
		  g.fillRect(0,0,this.getWidth(),this.getHeight());
		  g.setColor(Color.WHITE);
		  for(int m=o;m<(this.getHeight()-(2*o));m++)
		  {
		  g.fillRect(3*n,m,o,o);
		  }
		  for(int r=n;r<(this.getWidth()-(2*n));r++)
		  {
		  g.fillRect(r,3*o,o,o);
		  } 
//		  for(int m=n;m<(this.getHeight()-n);m++)
//		  {
//		  g.fillRect(n,m,50,50);
//		  }
//		  for(int m=q;m<(this.getHeight());m++)
//		  {
//		  g.fillRect((q+m)/2,l,50,50);
//		  }
	 
	 }
	 else if (count%3==1)
	 //replace this line with code to draw concentric circles shown below
	 {
//		 g.drawString("Applet two executed", 0,40);
//		 g.drawOval(0, 0, 50, 50);
		 int i=200,j=200;
		  while(i>=10)
		  {
		   g.drawOval(i,i,j,j);   
		   i = i - 5;
		   j = j + 10;
		  }
		 
	 }
	 else
	 //replace this
	 {
		 g.drawString("Option 3 executed",0,60);
		 g.setColor(Color.WHITE);
		 g.fillRect(0,0,this.getWidth()/2,this.getHeight()/2);
		 g.setColor(Color.RED);
		 g.fillRect(0,this.getHeight()/2,this.getWidth(),this.getHeight()/2);
		 g.setColor(Color.BLUE);
//		 g.fillOval(0, 0, 100, 100);
		 g.fillPolygon(xPoints, yPoints,3 );
		 
	 }
	 } // end of the paint method
} // end of Applet 

