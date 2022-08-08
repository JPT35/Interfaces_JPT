
public class Application {

	public static void main(String[] args) {
		
		//Task t1 = new Task("memory", 5, Status.COMPLETE);
		
		Process p1 = new Process("Process One", 5);
		Process p2 = new Process("Process Two", 10);
		
		System.out.println(p1.toString());
			
		int c = p1.compareTo(p2);
		System.out.println(c);
		
			
		}//end main

	}//end class
