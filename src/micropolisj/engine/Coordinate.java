package micropolisj.engine;

/*
 * ADDED BY IRENE
 * This makes life simpler for me bc I havent used java in a while. 
 * Basically, there are just coordinate values such as (x,y)
 * 
 * */

public class Coordinate {

	int x;
	int y;
	
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}

	public void printCoord() {
		System.out.println("Coordinate: (" + this.x + ", " + this.y + ")");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// I dont think I really need to run anything here..

	}

}
