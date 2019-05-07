import java.util.Random;

public class RandomWalk {
	int maxSteps; // maximum number of steps in a walk
	int maxCoord;
	int x;
	int y;
	int current;
	int boundary;
	
	public RandomWalk (int max, int edge) {
		x = 0;y = 0;current = 0;
		this.maxSteps = max;
		this.boundary = edge;
	}
	public RandomWalk(int max, int edge, int startX, int startY){
		this.maxSteps = max;
		this.boundary = edge;
		this.x = startX;
		this.y = startY;
		current = 0;
	}
	public String toString(){
		
			String result = "Steps : " + current + " Position : " + "("+ x +","+ y +")";
			
			return result;
	}
	public void takeStep() {
		int direction = (int)(Math.random()*4);
		switch(direction) {
		case 0 : x++; break;//go right
		case 1 : y++; break; // go up
		case 2 : x--; break; //go left
		case 3 : y--; break; //go down
		default : break;
		
		
		}
		current ++;
		
		
	}
	
	public boolean inBounds() {
		int newBoundary = boundary * -1;	
		 
		if(x > boundary || y > boundary || x < newBoundary || y < newBoundary)
		{
			return false;
		}
		else {
			return true;
		}
	}
	public boolean moreSteps() {
		if(current < maxSteps) {
			return true;
		}
		else {
			return false;
		}
	}
	public void walk() {
		
		while(moreSteps() && inBounds()) {
			takeStep();
		}
	}

}
