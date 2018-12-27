
public abstract class SoyaMilkWithHook {
	
	final void prepareRecipe()
	{
	    if(customerWantsCondiments()) 
	    {
	        addCondiments();
	       
	    }
	    soak();
	    beat();
	}
	
	void selectMaterial()
	{
		System.out.println("add bean");
	}
	abstract void addCondiments();
	
	void soak() 
	{
		System.out.println("add soak");	
	}
	void beat() 
	{
		System.out.println("add beat");
	}
	boolean customerWantsCondiments() 
	{
	   return true;	
	}




}
