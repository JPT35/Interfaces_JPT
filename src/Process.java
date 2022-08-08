public class Process implements Priority, Comparable<Process>{

	protected String processID;
	protected int priority;
	
	
	public Process() {
		
	this.processID = "";
	this.priority = 0;
	
	}//end empty argument
	
	public Process(String processID, int priority) {
		
		this.setPriority(priority);
		this.setProcessID(processID);
		
		
	}//end preferred 
		

	
	public String getProcessID() {
		return processID;
	}//end getProcessID

	public void setProcessID(String processID) {
		this.processID = processID;
	}//end setPriority

	public int getPriority() {
		return priority;
	}//end getPriority

	
	@Override
	public String toString() {
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	}

	@Override
	public void getPriority(int priority) {
		// TODO Auto-generated method stub
		
	}//end getPriority
	@Override
	public void setPriority(int priority) {
		this.priority = priority;
		
	}//end getPriority

	
	@Override
	public int compareTo(Process o) {
		if (this.getPriority() == o.getPriority())
			return 1;
			
			return -1;
			
		
	}
	
	
}//end class