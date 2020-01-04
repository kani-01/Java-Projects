/**
	 @author Govind Yatnalkar & Kanimozhi Kalaichelvan
	 * @Marshall ID: 901-87-5614, 901881363
	 * @date: 04/01/2018
	 * @CS580 Advanced OOPS Programming Assignment - JAVA Project - Maze Solver
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MazeSolver {

	static char[][] maze;
	int n, startX, startY, goalX, goalY;
	String filename;

	public MazeSolver(String filename) 
	{
		this.filename = filename;
	}

	public void readMaze() {
		try
		{
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			n = Integer.parseInt(br.readLine());
			maze = new char[n][n];

			for(int i = 0; i < n ;i++) 
			{
				String s  = br.readLine();
				for(int j = 0; j< n; j++) 
				{
					maze[i][j] = s.charAt(j);
					if(maze[i][j] == 'S') 
					{
						//Code to get start coordinate
						startX=i;
						startY=j;
					}
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

	public void displayMaze() 
	{
		System.out.println();
		for(int i = 0; i < n ; i++) 
		{
			for(int j = 0; j < n ; j++)
				System.out.print(maze[i][j]);
				System.out.println();
		}
	}

	public void solveMaze() 
	{
		solveMaze(startX, startY);
	}

	private boolean solveMaze(int x, int y) {
		Scanner mys = new Scanner(System.in);
		System.out.println("Press Enter for next step \n "
				+ "Currently Checking row = "+x+ " and column ="+y+" goalX = "+goalX+ " goalY = "+goalY );
		String e = mys.nextLine();

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
        
        if(solveMaze(x+1,y) == true)
			return true;
		if(solveMaze(x, y+1) == true)
			return true;
        if(solveMaze(x-1,y) == true)
			return true;
		if(solveMaze(x,y-1) == true)
			return true;
		
		return false;
		
	}
}
