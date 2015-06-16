
abstract public class Animal extends Object{

	private int weight;
	
	public Animal (int weight){
		setWeight(weight);
	}//end of constructor method
	
	abstract public void makeNoise();

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		String result;
		result = " I'm an animal weighing:" + weight;
		return result;
	}
	
	
	
}//end of Animal class
