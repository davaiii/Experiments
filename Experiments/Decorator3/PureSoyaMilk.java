
public class PureSoyaMilk extends SoyaMilkWithHook {
	
	void addCondiments() {
		System.out.println("add nothing");
	}
	
	boolean customerWantsCondiments() {
		return false;
	}

}
