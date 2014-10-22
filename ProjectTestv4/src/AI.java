/**
 * 	author Eric Lin
 * 	Completed
 * 		AI class
 */

import java.util.ArrayList;


public class AI {
	private ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(0);
	private ArrayList<ArrayList<Integer>> tempList = new ArrayList<ArrayList<Integer>>(0);
	//private int total;
	//private int num;
	
	//initializes an AI
	public AI(int total, int num){
		for(int x=1; x<=total; x++){
			ArrayList<Integer> nums = new ArrayList<Integer>(0);
			for(int y=1; y<=num; y++){
				nums.add(y);
			}
			this.list.add(nums);
		}
		//this.total = total;
		//this.num = num;
	}
	
	//chooses a random int from its array of ints
	public int chooseNum(int remain){
		int chosen = list.get(remain-1).get((int)(Math.random()*list.get(remain-1).size()));
		return chosen;
	}
	
	//test
	public void printArray(){
		System.out.println(list);
	}
	
	//updates a temp array, later to be stored into original array
	public void updateTemp(int remain, int tempNum){
		ArrayList<Integer> tempList2 = new ArrayList<Integer>(0);
		tempList2.add(remain-1);
		tempList2.add(tempNum);
		tempList.add(tempList2);
	}
	
	//adds temp ints into array
	public void improve(){
		for(int x=0; x<tempList.size(); x++){
			list.get(tempList.get(x).get(0)).add(tempList.get(x).get(1));
		}
	}
	
	//remove all ints in temp
	public void editTemp(){
		tempList.removeAll(tempList);
	}
}
