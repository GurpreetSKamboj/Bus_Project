import java.util.ArrayList;

public class route {
	// Declaring Variables
	String routeName= "";
	int stop= 0;
	ArrayList seqOfStops= new ArrayList();
	
	//Default Constructor
	public route() {
		this.routeName="";
		this.seqOfStops= new ArrayList();
	}
	
	//Argumental Constructor
	public route(String routeName, ArrayList seqOfStops) {
		this.routeName= routeName;
		this.seqOfStops= seqOfStops;
	}
	
	public void addStop(int stop) {
		if(seqOfStops.contains(stop)==false)
		seqOfStops.add(stop);
	}
	
	public void removeStop(int stop) {
		if(seqOfStops.contains(stop)==true) {
			seqOfStops.remove(stop);
		}
	}
}
	