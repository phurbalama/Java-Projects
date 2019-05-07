import java.util.*;
public class TestWalk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int maxSteps; // maximum number of steps in a walk
//		int maxCoord; // the maximum x and y coordinate
//		int x, y; // starting x and y coordinates for a walk
//		Scanner scan = new Scanner(System.in);
//		System.out.println ("\nRandom Walk Test Program");
//		System.out.println ();
//		System.out.print ("Enter the boundary for the square: ");
//		maxCoord = scan.nextInt();
//		System.out.print ("Enter the maximum number of steps: ");
//		maxSteps = scan.nextInt();
//		System.out.print ("Enter the starting x and y coordinates with" + " a space between: ");
//
//		x = scan.nextInt();
//		y = scan.nextInt();

		RandomWalk obj1 = new RandomWalk(200,10,0,0);
//		RandomWalk obj2 = new RandomWalk(maxSteps,maxCoord,x,y);
		
		obj1.walk();
	
		System.out.println(obj1.toString());
	
	}

}
