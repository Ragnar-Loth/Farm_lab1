package ua.lviv.iot.firstlab_Farm;

public class Farm {
	static int numberOfPairs;
	private String location;
	private int numberOfAnimals;
	private double capacityFanInWatts;
	private String the—ompanyName;
	protected int amountOfSowingMachinery;
	protected int speciesOfAnimals;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNumberOfAnimals() {
		return numberOfAnimals;
	}

	public void setNumberOfAnimals(int numberOfAnimals) {
		this.numberOfAnimals = numberOfAnimals;
	}

	public double getCapacityFanInWatts() {
		return capacityFanInWatts;
	}

	public void setCapacityFanInWatts(double capacityFanInWatts) {
		this.capacityFanInWatts = capacityFanInWatts;
	}

	public String getThe—ompanyName() {
		return the—ompanyName;
	}

	public void seThe—ompanyName(String the—ompanyName) {
		this.the—ompanyName = the—ompanyName;
	}

	public Farm() {
		this("none", 0, 0, "none", 0, 0);
	}

	public Farm(String location, int numberOfAnimals, double capacityFanInWatts, String the—ompanyName,
			int amountOfSowingMachinery, int speciesOfAnimals) {
		this.location = location;
		this.numberOfAnimals = numberOfAnimals;
		this.capacityFanInWatts = capacityFanInWatts;
		this.the—ompanyName = the—ompanyName;
		this.amountOfSowingMachinery = amountOfSowingMachinery;
		this.speciesOfAnimals = speciesOfAnimals;
	}

	public Farm(String location, int numberOfAnimals, double capacityFanInWatts, int numberOfBuilding) {
		this(location, numberOfAnimals, capacityFanInWatts, null, 0, 0);
	}

	@Override
	public String toString() {
		return "Farm{" + "location='" + location + '\'' + ", numberOfAnimals=" + numberOfAnimals
				+ ", capacityFanInWatts=" + capacityFanInWatts + ", the—ompanyName='" + the—ompanyName + '\''
				+ ", amountOfSowingMachinery=" + amountOfSowingMachinery + ", speciesOfAnimals=" + speciesOfAnimals + '}';
	}

	public static String printStaticNumberOfPairs() {
		return "numberOfPairs :" + numberOfPairs;
	}

	public String printNumbOfMembers() {
		return "numberOfPairs :" + numberOfPairs;
	}

	public void resertValues(String location, int numberOfAnimals, double capacityFanInWatts, String the—ompanyName,
			int amountOfSowingMachinery, int speciesOfAnimals) {
		this.location = location;
		this.numberOfAnimals = numberOfAnimals;
		this.capacityFanInWatts = capacityFanInWatts;
		this.the—ompanyName = the—ompanyName;
		this.amountOfSowingMachinery = amountOfSowingMachinery;
		this.speciesOfAnimals = speciesOfAnimals;
	}

}
