package command03;

public class Test {
	public static void main(String[] args) {
		Chef chef11=new Chef();
		Command command1 =new MuttonString(chef11);
		Command command2 =new Chicken(chef11);
		Servant girl001=new Servant();
		girl001.setCommand(command1);
		girl001.startExecuteCommand();
		girl001.setCommand(command2);
		girl001.startExecuteCommand();
	}
}
