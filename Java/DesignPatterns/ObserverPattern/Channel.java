package ObserverPattern;
import java.util.List;
import java.util.ArrayList;
public class Channel {
  List<Subscriber>subs = new ArrayList<>();
  private String title;
  public void subscribe(Subscriber sub)
  {
	  subs.add(sub);
  }
  public void unsubscribe(Subscriber sub)
  {
	  subs.remove(sub);
  }
  public void notifysubscribers()
  {
	  for(Subscriber sub:subs)
	  {
		  sub.update();
	  }
  }
  public void upload(String title)
  {
	  this.title = title;
	  notifysubscribers();
  }
}
