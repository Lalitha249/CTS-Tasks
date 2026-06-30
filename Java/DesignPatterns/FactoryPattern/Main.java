package FactoryPattern;

public class Main {
public static void main(String[] args) {
	NotificationFactory f= new NotificationFactory();
	Notification n = f.getNotification("Email");
	n.send();
	
}
}
