package system;

public interface CleaningExpense {
	//public static and final implicitly 
	public double COST_PER_ROOM = 40.00;
	
	// Interface methods are implicitly abstract and public 
	double calculateCleaningCost(int roomsCleared, double COST_PER_ROOM); 
}
