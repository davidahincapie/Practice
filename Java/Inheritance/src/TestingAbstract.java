
public class TestingAbstract {

	public static void main(String[] args) {
		
		//Animal myAnimal = new Animal(45); //cant make an instance of an abstract class
		Animal pet = new Dog(89, "Max");
		Cat fluffy = new Cat(17,"FLUFFY",true);
		
		//foo(myAnimal); 
		foo(pet);
		foo(fluffy);
		
	}//end of main

	public static void foo(Animal myPet){
		
		myPet.makeNoise();
		
	}//end of foo
	
}//end of TestingAbstract
