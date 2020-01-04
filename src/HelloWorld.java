
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;

class Building

{
	//variables
int Bricks = 0;
int doors = 0;
int windows = 0;
int cement = 0;
String buildname="";
	
 Building (int a, int b, int c, int d, String str)
{
	this.Bricks = a;
	this.doors = b;
	this.windows = c;
	this.cement = d;
	this.buildname = str;
}
//methods
public String createbuiding(String buildname1, int a, int b, int c, int d)
{
	Bricks = a;
	doors = b;
	windows = c;
	cement = d;
	buildname= buildname1;
	System.out.println("I am "+buildname);
	
	System.out.println("I will use "+a+" Bricks,"+b+" doors,"+c+" windows,"+d+" loads of cement");
	System.out.println();
	return "Builing created";
	
}
	public void paintbuilding()
	{
		System.out.println( buildname +" painted");
	}
}

public class HelloWorld {

	public static void main(String[] args) {
		
		//Building NYCbuilding = new Building();
		int a[] = new int[5];
		a[0]=1;
		Building NYCbuilding[] = new Building[5];
		
		NYCbuilding[0].createbuiding("Nyc surya Building", 500, 20, 10, 12344);
		
		Building mybuild = new Building (500,20,10,12344,"Nyc surya Building");
		
		NYCbuilding[0].paintbuilding();
		System.out.println(NYCbuilding[1].createbuiding("Nyc surya Building", 500, 20, 10, 12344));
		NYCbuilding[1].paintbuilding();
		 
		List<String> mylist = new ArrayList<String>();
		mylist.add("Surya");
		mylist.add("Balu");
 	System.out.println(mylist.size());
		
		
	}

}
