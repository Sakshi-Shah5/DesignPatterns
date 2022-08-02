package FactoryDesignPattern.NotificationSystem;

public class Email implements Notification{
  
	@Override
	public void notifyUser(){
		System.out.println("Sending Email notification");
	}
	
}
