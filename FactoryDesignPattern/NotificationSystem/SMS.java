package FactoryDesignPattern.NotificationSystem;

public class SMS implements Notification{

	public void notifyUser() {
		System.out.println("Sending SMS notification");
	}
}
