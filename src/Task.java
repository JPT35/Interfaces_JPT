public class Task implements Priority, Comparable <Task>{

	protected String name;
	protected int priority;
	private Status stat;
	
	private enum Status{NOT_STARTED, IN_PROCESS, COMPLETE}
	
	public Task () {
		this.name = "";
		this.priority = 0;
		this.stat = Status.COMPLETE;
		
	}//end empty argument constructor
	
	public Task (String name, int priority, Status stat) {
		
		this.setName(name);
		this.setPriority(priority);
		this.setStat(stat);
		
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
	public void getPriority(int priority) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(Task o) {
		
		if (this.getPriority() == o.getPriority())
		return 1;
		return -1;
		}
		

	}//end class
