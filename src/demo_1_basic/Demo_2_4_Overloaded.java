package demo_1_basic;

public class Demo_2_4_Overloaded {
	

	public static void main(String[] args) {
		
		Demo_2_4_Overloaded ref = new Demo_2_4_Overloaded();
		
		module1();
		ref.module1(14);
		module1(14, "String name");
	}
	
	public static void module1(){
		
		System.out.println("Selenium");
	}
    public void module1(int x){   //OVERLOADED
    	
    	System.out.println(x);
    }
    
    public static void module1(int x, String name){    //OVERLOADED
    	
    	System.out.println("Batch");
    	
    }
}