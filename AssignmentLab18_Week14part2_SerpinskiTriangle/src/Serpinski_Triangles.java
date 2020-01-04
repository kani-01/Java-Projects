
import java.io.*;
import java.awt.*;
import java.applet.*;

public class Serpinski_Triangles extends Applet{

	public void sierpinski(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3)
	{
		g.drawLine(x1, y1, x2, y2);
		g.drawLine(x2, y2, x3, y3);
		g.drawLine(x3, y3, x1, y1);
		double perimeter = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)+(x1-x3)*(x1-x3)+(y1-y3)*(y1-y3)+(x3-x2)*(x3-x2)+(y3-y2)*(y3-y2);
		
		if(perimeter>50)
		{
			for(long i=0;i<1000;i++);
			sierpinski(g,x1,y1,(x1+x2)/2,(y1+y2)/2,(x1+x3)/2,(y1+y3)/2);
			for(long i=0;i<1000;i++);
			sierpinski(g,(x1+x2)/2,(y1+y2)/2,x2,y2,(x2+x3)/2,(y2+y3)/2);
			for(long i=0;i<1000;i++);
			sierpinski(g,(x1+x3)/2,(y1+y3)/2,(x2+x3)/2,(y2+y3)/2,x3,y3);
		}
		
	}
	
	
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		int width=this.getWidth();
		int height=this.getHeight();
		g.setColor(Color.BLACK);
		sierpinski(g,width/2,0,width,height,0,height);
	}

}
