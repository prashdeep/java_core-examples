public class Car{
	
    private String color;
    private long chassieNumber;
    private String model;
    private static int counter;

    public Car(String color, String model){
        this.color = color;
        this.model = model;
        this.chassieNumber = 344545;
        counter++;
    }

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public long getChassieNumber() {
		return chassieNumber;
	}

	public void setChassieNumber(long chassieNumber) {
		this.chassieNumber = chassieNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public static int getCounter() {
		return counter;
	}
	
}
