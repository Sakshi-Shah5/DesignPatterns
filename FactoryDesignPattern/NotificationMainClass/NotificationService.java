package FactoryDesignPattern.NotificationMainClass;

import java.util.Scanner;

import FactoryDesignPattern.NotificationSystem.Notification;
import FactoryDesignPattern.NotificationSystem.NotificationFactory;

public class NotificationService {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the channel name = ");
	     String channel = sc.next();
		
		NotificationFactory nf = new NotificationFactory();
		Notification no = nf.getNotificationChannel(channel);
		
		no.notifyUser();
		sc.close();
	}

}
