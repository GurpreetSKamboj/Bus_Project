import java.util.ArrayList;

public class Bus_routing_system {
	// Declaring Variables
	ArrayList Buses = new ArrayList();
	// Stop stop= new Stop();

	public static void main(String[] args) {

	}

	public String addBus(int busNumber, String type, String name) {
		Bus bus1 = new Bus(busNumber, type, name);
		Buses.add(bus1);
		return ("Bus added successfull");
	}

	public String removeBus(Bus bus) {
		if (Buses.contains(bus) == true) {
			Buses.remove(bus);
		}
		return ("Bus removed successfull");
	}

	public void assignBus(BusLine busLine, timeSchedule timeSchedule, Bus bus) {
		if(Buses.contains(bus)==true) {
			bus.setTimeSchedule(timeSchedule);
			bus.setBusLine(busLine);
		}
		
	}
}
