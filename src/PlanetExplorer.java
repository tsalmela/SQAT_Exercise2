import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:
// Finish time:

public class PlanetExplorer {
	String facing = "NORTH";
	int pos_x = 0;
	int pos_y = 0;
	
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
		 
	 */
	}
	
	@SuppressWarnings("null")
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		String[] array = command.split("");
		
		for(int i=0; i<command.length(); i++){
			String a = array[i];
			
			switch (a) {
			case "l":
				turnLeft();
				break;
			case "r":
				turnRight();
				break;
			case "f":
				forward();
				break;
			case "b":
				backward();
				break;
			}
		}
		 
		String palautus = Integer.toString(pos_x);
		palautus += Integer.toString(pos_y);
		palautus += facing;
		//System.out.println("palautus:" + palautus);
		return palautus;
	}
	
	public void turnLeft(){
		facing = "LEFT";
	}
	
	public void turnRight(){
		facing = "RIGHT";
	}
	
	public void forward(){
		//Fix what happens if you go over border
		if(facing == "NORTH"){
			pos_y++;
		} else if(facing == "EAST"){
			pos_x++;
		} else if(facing == "SOUTH"){
			pos_y--;
		} else if(facing == "WEST"){
			pos_x--;
		}
	}
	
	public void backward(){
		if(facing == "NORTH"){
			pos_y--;
		} else if(facing == "EAST"){
			pos_x--;
		} else if(facing == "SOUTH"){
			pos_y++;
		} else if(facing == "WEST"){
			pos_x++;
		}
	}
}
