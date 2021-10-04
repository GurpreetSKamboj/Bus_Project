import java.sql.Time;

public class BusLine {
	
	int busLineNumber=0;
	route thisRoute= new route();
	boolean forwardSeriesOfRoutes= true;
	
	public BusLine() {
		
	}
	
	public BusLine(int busLineNumber, route thisRoute, boolean forwardSeriesOfRoutes) {
		this.busLineNumber= busLineNumber;
		this.thisRoute= thisRoute;
		this.forwardSeriesOfRoutes= forwardSeriesOfRoutes;
	}
}
