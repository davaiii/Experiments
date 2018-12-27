package command03;


public class Servant {
	Command command;
	public void setCommand(Command command){
		this.command=command;
	}
	public void startExecuteCommand(){
		command.execute();
	}
}
