public class Task implements Priority, Comparable <Task>{

	protected String name;
	protected int priority;
	private Status stat;
	
	
	
	public Task () {
		this.name = "";
		this.priority = 0;
		this.stat = Status.NOT_STARTED;
		
	}//end empty argument constructor
	
	public Task (String name) {
		
		this.setName(name);
		this.priority = 0;
		this.stat = Status.NOT_STARTED;
		
	}//end preferred constructor 
		
	public String getName() {
		return name;
		
		
	}//end getName
	
	public void setName(String name) {
			this.name = name;
			
		}//end setName
	public Status getStat() {
		return stat;
	}//end getStatus
	
	public void setStat(Status stat) {
		this.stat = stat;
	}//end setStatus
		
	public int getPriority() {
		return priority;
	}//end getPriority
	
	public void setPriority(int priority) {
		this.priority = priority;
	}//end setPriority

	
	
	@Override
	public String toString() {
		return "Task [name=" + name + ", priority=" + priority + ", stat=" + stat + "]";
	}

	

	@Override
	public int compareTo(Task o) {
		
		if (this.getPriority() == o.getPriority())
			return 1;
		
		return -1;
		}//end compareTo

	@Override
	public void getPriority(int priority) {
		this.priority = priority;
		
	}
		

	}//end class
