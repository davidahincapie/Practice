
public class Dog extends Animal{

	private String name;
	
public Dog(int weight, String name){
	super(weight);	
	setName(name);
	}//end of constructor method

public void makeNoise(){
	System.out.println("Woof woof");
	
}//end of makeNoise

public boolean equals(Object obj){
	if(!(obj instanceof Dog)){
		return false;
	}//end of if
	
	boolean result = false;
	
	if(this.getWeight() == ((Dog)obj).getWeight()){
		result = true;
	}//end of if
	return result;
}//end of equals
	
	public String getName() {
		return name;
	}

	public void setName(String name) {

		int length = name.length();
		if (length != 2)
			this.name= "bob";
		else
		this.name = name;
	}

	public String toString(){
		String result;
		
		result = "Dog:" + name + super.toString();
		
		return result;
	}//end of toString
	
	
}//end of Dog class
