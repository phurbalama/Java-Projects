import java.util.*;
public class TestWalk {

	public static void main(String[] args) {
	

		RandomWalk objectOne = new RandomWalk(50,10,0,0);
//		RandomWalk objectTwo = new RandomWalk(maxSteps,maxCoord,x,y);
		
		objectOne.walk();  //where the operating of steps will be done
	
		System.out.println(objectOne.toString()); // prints outs the position and the current coordinate
	
	}

}
