package SingletonPatternPrinciple;

public class Main {
public static void main(String[] args) {
	// Logger Logger1= new Logger();-->Its not possbile because we declared constructor as  that it as private
       Logger Log1 =Logger.getInstance();
       System.out.println(Log1);
       Logger Log2 = Logger.getInstance();
        	System.out.println(Log1==Log2);
        
}
}
