
/**
	 @author Govind Yatnalkar & Kanimozhi Kalaichelvan
	 * @Marshall ID: 901-87-5614, 901881363
	 * @date: 04/01/2018
	 * @CS580 Advanced OOPS Programming Assignment - JAVA Project - Maze Solver
*/

public class MazeTest {

		public static void main(String[] args) {
			MazeSolver myMaze = new MazeSolver("C:\\Users\\Ezhil Malliga\\eclipse-workspace\\AssignmentLab_MazeProject\\src\\maze7.txt");
			myMaze.readMaze();
			myMaze.displayMaze();
			myMaze.solveMaze();						
		}
}
