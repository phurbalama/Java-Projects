import java.util.Random;

public class RandomWalk {
	int maxSteps; // maximum number of steps in a walk
	int maxCoord;
	int x;
	int y;
	int current;
	int edge;
	
	public RandomWalk (int max, int edge) {
		x = 0;y = 0;current = 0;
		this.maxSteps = max;
		this.edge = edge;
	}
	public RandomWalk(int max, int edge, int startX, int startY){
		this.maxSteps = max;
		this.edge = edge;
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
	public boolean moreSteps() {
		if(current < maxSteps) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean inBounds() {
		int newEdge = edge * -1;	
		 
		if(x > edge || y > edge || x < newEdge || y < newEdge)
		{
			return false;
		}
		else {
			return true;
		}
	}
	public void walk() {
		
		while(moreSteps() && inBounds()) {
			takeStep();
		}
	}

}
