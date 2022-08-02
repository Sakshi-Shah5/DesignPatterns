package FactoryDesignPattern.NotificationSystem;

public class NotificationFactory {
	
    public Notification getNotificationChannel(String channel){
        if(channel == null || channel.isEmpty())   
        	return null;
        
        switch(channel){
            case "SMS": 
            	 return new SMS();
                
            case "EMAIL": 
            	return new Email();
            	
            case "Whatsapp":
            	return new Whatsapp();
            
            default : throw new IllegalArgumentException("Unknow Channel "+ channel);
        }
    }
}
