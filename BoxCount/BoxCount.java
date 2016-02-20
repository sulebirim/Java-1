/*
*BoxCount.java
*16/02/16
*@author Vladislavs Vasiljevs
*/

public class BoxCount{

	//declare data members
	private int eggs;
	private int boxes;
	private int over;

	//constructor
	public BoxCount(){
		eggs = 0;
		boxes = 0;
		over = 0;

	}

	//Set Methods
	public void setEggs(int eggs){
		this.eggs = eggs;
		}

	//Compute method
	public void computeBoxes(){
		boxes = eggs/12;
	}

	public void computeOver(){
		over = eggs%12;
	}

	//get method
	public int getEggs(){
		return eggs;
	}

	public int getBoxes(){
		return boxes;
	}

	public int getOver(){
		return over;
	}

}
