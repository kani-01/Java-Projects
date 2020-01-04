/**
 @author Govind Yatnalkar & Kanimuli
 * @Marshall ID: 901-87-5614
 * @date: 04/01/2018
 * @CS580 Advanced OOPS Programming Assignment - JAVA Project - Maze Solver
 */

package programmingAssignments;

public class MazeSolverTest {

	public static void main(String[] args) {
		MazeSolver myMaze = new MazeSolver("unsolvable.txt");
		myMaze.readMaze();
		myMaze.displayMaze();
		if(myMaze.solveMaze())
			System.out.println("Maze Solved Successfully!!!");
		else
			System.out.println("Maze Not Solvable...");
		
		
	}
	
}
