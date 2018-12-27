package command03;

public class Chicken implements Command{
	Chef chef ;
	public Chicken(Chef chef){
		this.chef=chef;
	}
	public void execute(){
		chef.makeChicken();
	}
}
