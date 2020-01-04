import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
   @author Govind Yatnalkar & Kanimozhi Kalaichelvan
 * @Marshall ID: 901-87-5614, 901-88-1363
 * @date: 04/23/2018
 * @CS580 Advanced OOPS Programming Assignment - JAVA Project - Maze Solver
 */

public class MazeSolverTest extends Applet{

	private static final long serialVersionUID = 1L;
	static char[][] maze;
	int n, startX, startY, goalX, goalY;
	String filename="maze6.txt";
	boolean final_status;
	Button nextButton = new Button("Reload the Maze");

	//The initilization method of Applet
	public void init() {
		this.add(nextButton);
		this.setSize(500,500); //you can choose the size
		ActionListener listener = new NextListener();
		nextButton.addActionListener(listener);
	}

	//Code for action listener or the button
	class NextListener implements ActionListener{
		public void actionPerformed(ActionEvent event)
		{
			if(solveMaze()) {
				 System.out.println("Maze Solved Successfully!!");
				 final_status = true;
			}
			 else {
				 final_status = false;
				 System.out.println("Maze Not Solvable...");
			 }
			writeMaze();
			repaint();
		}
	}

	//Read the maze from a txt file into an 2D array
	public void readMaze() {
		try
		{
			FileReader fr = new FileReader(filename);
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(fr);
			n = Integer.parseInt(br.readLine());
			maze = new char[n][n];

			for(int i = 0; i < n ;i++) 
			{
				String s  = br.readLine();
				for(int j = 0; j< n; j++) 
				{
					maze[i][j] = s.charAt(j);

					//The start of maze
					if(maze[i][j] == 'S') 
					{
						//Code to get start coordinate
						startX=i;
						startY=j;
					}

					//The Goal of maze
					if(maze[i][j] == 'G') 
					{
						//Code to get the end coordinate
						goalX=i;
						goalY=j;

					}
				}
			}
		}
		catch(FileNotFoundException e) 
		{
			//File not found exception
			e.getMessage();
			e.printStackTrace();
			System.out.println("File Not Found");
		}
		catch(IOException e) {
			//Invalid Entry Exception
			e.getMessage();
			e.printStackTrace();
			System.out.println("Invalid Entry");
		}
	}

	public void paint(Graphics g) 
	{
		readMaze();
		System.out.println();
		
		//k and l divide the frame into n squares
		int k= this.getHeight()/n;
		int l= this.getWidth()/n;

		for(int i = 0; i < n ; i++) 
		{
			for(int j = 0; j < n ; j++)
			{
				//Fill black squares for #
				if(maze[i][j]=='#')
				{
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					g.setColor(Color.BLACK);
					g.fillRect(i*l,j*k,l,k);
				}

				//If only G is there
				if(n ==1 && (maze[i][j]=='G')) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					g.setColor(Color.CYAN);
					g.fillRect(i*l,j*k,l,k);
				}else{
					if((maze[i][j]=='S')||(maze[i][j]=='G'))
					{
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						g.setColor(Color.RED);
						g.fillRect(i*l,j*k,l,k);
					}
				}

				if(maze[i][j]=='.')
				{
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					g.setColor(Color.WHITE);
					g.fillRect(i*l,j*k,l,k);
				}
			}
		}

		for(int i = 0; i < n ; i++) 
		{
			for(int j = 0; j < n ; j++)
			{
				System.out.print(maze[i][j]);
				if(maze[i][j]=='P')
				{
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					g.setColor(Color.CYAN);
					g.fillRect(i*l,j*k,l,k);
				}
			}
			System.out.println();
		}	
		
		/*if(final_status == true)
			g.drawString("Maze Solved Successfully", 20, 20);
		else
			g.drawString("Maze Not Solvable", 20, 20);*/
	}

	public boolean solveMaze() 
	{
		boolean status = solveMaze(startX, startY);
		return status;
	}

	private boolean solveMaze(int x, int y) {

		System.out.println("Press Enter for next step \n "
				+ "Currently Checking row = "+x+ " and column ="+y+" goalX = "+goalX+ " goalY = "+goalY );
		if(x<0 || x>=n || y<0 || y>=n)
			return false;

		if(x == goalX && y == goalY)
			return true;

		if (maze[x][y] == '#') {
			return false;
		}

		if (maze[x][y] == 'G') {
			return true;
		}

		if (maze[x][y] == 'P') {
			return false;
		}
		if(maze[x][y]=='.')
		{
			maze[x][y] = 'P';
			displayMaze();
		}

		//east
		if(solveMaze(x+1,y) == true)
			return true;
		//south
		if(solveMaze(x, y+1) == true)
			return true;
		//west
		if(solveMaze(x-1,y) == true)
			return true;
		//north
		if(solveMaze(x,y-1) == true)
			return true;
		return false;
	}

	public void displayMaze() 
	{
		System.out.println();
		for(int i = 0; i < n ; i++) 
		{
			for(int j = 0; j < n ; j++)
				System.out.print(maze[i][j]);
		}
		System.out.println();
	}

	public void writeMaze() {
		try
		{
			FileWriter fwrite = new FileWriter(filename);
			PrintWriter pw = new PrintWriter(fwrite);
			String len = Integer.toString(n);
			fwrite.write(len);
			pw.println();

			for(int i = 0; i < n ;i++) 
			{
				for(int j = 0; j< n; j++) 
				{
					String str= Character.toString(maze[i][j]);
					fwrite.append(str);
				}
				pw.println();
			}
			fwrite.close();

		}
		catch(FileNotFoundException e) 
		{
			e.getMessage();
			e.printStackTrace();
			System.out.println("File Not Found");
		}
		catch(IOException e) {
			e.getMessage();
			e.printStackTrace();
			System.out.println("Invalid Entry");
		}
	}
}

