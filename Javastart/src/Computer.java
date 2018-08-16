
public class Computer {

	private String producer;
	private int model;

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Computer))
			return false;

		Computer c = (Computer) obj;

		if (this.producer == c.producer && this.model == c.model) 
			return true;
	
		if (this.producer != null) {
			if (!this.producer.equals(c.producer))
				return false;
		} else if (this.producer == null && c.producer != null)
			return false;

		if (this.model != 0) {
			if (this.model != c.model)
				return false;
		} else if (this.model == 0 && c.model != 0)
			return false;
		return true;
		
		
		
	}

	@Override
	public String toString() {
		return producer + "," + model;
	}

	public Computer(String producer, int model) {
		super();
		this.producer = producer;
		this.model = model;
	}

}
