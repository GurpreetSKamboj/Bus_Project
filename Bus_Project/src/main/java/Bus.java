
public class Bus {

	int busNumber;
	String type;
	String name;
	BusLine busLine;
	timeSchedule timeSchedule;

	public Bus() {

	}

	public Bus(int busNumber, String type, String name) {
		this.busNumber = busNumber;
		this.name = name;
		this.type = type;
	}

	public int getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BusLine getBusLine() {
		return busLine;
	}

	public void setBusLine(BusLine busLine) {
		this.busLine = busLine;
	}

	public timeSchedule getTimeSchedule() {
		return timeSchedule;
	}

	public void setTimeSchedule(timeSchedule timeSchedule) {
		this.timeSchedule = timeSchedule;
	}
}
