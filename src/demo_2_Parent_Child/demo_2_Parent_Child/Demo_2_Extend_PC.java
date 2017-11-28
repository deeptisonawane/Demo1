package demo_2_Parent_Child;

public class Demo_2_Extend_PC {

	public static void main(String[] args) {
		
		
		ClassA ref = new ClassA();
		ref.parent();
		System.out.println(ref.a);
		ref.parent2();
		
		ref.morningI();
		ref.eveningI();
		ref.AfternoonI();
	}

}
