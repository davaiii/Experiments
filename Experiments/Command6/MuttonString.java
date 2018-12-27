package command03;

public class MuttonString implements Command{
	Chef chef ;
	public MuttonString(Chef chef){
		this.chef=chef;
	}
	public void execute(){
		chef.makeMuttonSting();
	}
}

