package dp.sda.flywight;

public class Car implements Vehicle {

	private Engine engine;
	private String color;
	public Car(Engine engine, String color) {
		this.engine = engine;
		this.color = color;

		// Building a new car is a very expensive operation!
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Error while creating a new car" + e);
		}
	}

	public void start() {
		System.out.println("Car is starting!");
		engine.start();
	}

	public void stop() {
		System.out.println("Car is stopping!");
		engine.stop();
	}

	public String getColor() {
		return this.color;
	}

}
