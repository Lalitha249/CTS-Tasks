package ObserverPattern;

public class Youtube {
public static void main(String[] args) {
	Channel lali= new Channel();
	Subscriber s1 = new Subscriber("Lallitha");
	Subscriber s2 = new Subscriber("Lallitha");
	Subscriber s3 = new Subscriber("Lallitha");
	 lali.subscribe(s1);
	 lali.subscribe(s2);
	  s1.subscriberChannel(lali);
	  lali.upload("Video");
	
}
}
