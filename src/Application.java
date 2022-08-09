

public class Application {

	public static void main(String[] args) {
		
	
		
		
		Task t1 = new Task("Task 3");
		Task t2 = new Task("Task 2");
		
		
		//System.out.println("Enter priority number: ");
		
		t1.priority =1;
		t2.priority =1;
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		
		int x = t1.compareTo(t2);
		System.out.println(x);
		
		Process p1 = new Process("Process One", 5);
		Process p2 = new Process("Process Two", 10);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
			
		int c = p1.compareTo(p2);
		System.out.println(c);
		
		
		
		}//end main

	}//end class
