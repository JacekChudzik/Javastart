package parts;

public class Part {

	 String name;
	 int id;
	 String producerName;
	 String model;
	 int serialNumb;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProducerName() {
		return producerName;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSerialNumb() {
		return serialNumb;
	}

	public void setSerialNumb(int serialNumb) {
		this.serialNumb = serialNumb;
	}

	public void printInfo() {
		System.out.println(getName() + ";" + getModel() + ";" + getId() + ";" + getProducerName() + ";"
				+ getSerialNumb());
	}

}
