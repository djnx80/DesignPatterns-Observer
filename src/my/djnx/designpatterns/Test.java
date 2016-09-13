package my.djnx.designpatterns;

public class Test {

	public static void main(String[] args) {
		MessageBox messageBox = new MessageBox();
		
		// if you are register (login) then you will receive new messages. like on the forum.
		User user = new User("Przemek");
		messageBox.register(user);
		messageBox.newMessage();
		System.out.println("");
		User user2 = new User("Janek");
		messageBox.register(user2);
		messageBox.newMessage();
		System.out.println("");
		messageBox.unregister(user);
		messageBox.newMessage();
	}

}
