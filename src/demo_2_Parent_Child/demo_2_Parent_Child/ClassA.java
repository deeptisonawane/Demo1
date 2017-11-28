package demo_2_Parent_Child;

public class ClassA extends ClassB implements InterfaceX
{
	public void parent(){
		System.out.println("Good Morning this is new one");
	}

	@Override
	public void morningI() {
		System.out.println("abc");
		
	}

	@Override
	public void eveningI() {
		System.out.println("pqr");
		
	}

	@Override
	public void AfternoonI() {
		System.out.println("xyz");
		
	}

		}

