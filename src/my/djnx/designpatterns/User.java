package my.djnx.designpatterns;

import my.djnx.designpatterns.interfaces.Observer;

public class User implements Observer {
	
	private String name;
	private int messageCounter;
	
	public User(String name){
		this.name = name;
		messageCounter = 0;
	}
	
	public String getName()	{
		return name;
	}
	@Override
	public void update() {
		messageCounter++;
		System.out.println(name + " you have " + messageCounter + " new message(s).");	
	}

}
