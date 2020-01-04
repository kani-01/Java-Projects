
public class MURectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MURectangle Rectangle = new MURectangle();
		Rectangle.setHeight(10);
		Rectangle.setWidth(20);
		System.out.println("Area is = "+Rectangle.findArea());
		System.out.println("Perimeter is = "+Rectangle.findPerimeter());
		System.out.println("Diagonal is = "+Rectangle.findDiagonal());
		Rectangle.strSquare();
		System.out.println("String is"+ Rectangle.toString());

	}

}
