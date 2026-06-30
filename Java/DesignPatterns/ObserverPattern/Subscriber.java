package ObserverPattern;

public class Subscriber {
private String name;
private Channel channel;
  public void update()
  {
	  System.out.println("video Uploaded");
	  
  }
  public Subscriber(String name) {
	
	this.name = name;
}
  public void subscriberChannel(Channel ch)
  {
	  channel = ch;
  }
}
