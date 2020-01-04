
import java.io.*;
import java.awt.*;
import java.applet.*;

public class JavaApplet1 extends Applet {

	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
//		g.setColor(Color.CYAN);
//		g.fillRect(5,5,50,50);
		int k= this.getHeight()/8;
		int l= this.getWidth()/8;
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				if((i+j)%2==0)
				{
					g.setColor(Color.BLACK);
					g.fillRect(i*l,j*k,l,k);
				}
				else
				{
					g.setColor(Color.RED);
					g.fillRect(i*l,j*k,l,k);
				}
			}
		}
	}
}
