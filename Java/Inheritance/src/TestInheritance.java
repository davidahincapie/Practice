/**
 * @author David Hincapie
 *
 */
public class TestInheritance {

	public static void main(String[] args) {
		//Animal
		Animal myPet = new Animal(12);
		System.out.println(myPet);
		
		//Dog
		Dog max = new Dog(34, "MAX");
		Dog rover = new Dog(34,"ROVER");
		if (max.equals(rover)){
			System.out.println("Max and Rover are equal");
		}else{
			System.out.println("Max and Rover are NOT equal");
		}
		
		max.setWeight(56);
		System.out.println(max);
		
		//Cat
		Cat fluffy = new Cat(12,"FLUFFY",true);
		System.out.println(fluffy);
		
		Animal pet;
		pet = fluffy;
		System.out.println(pet);
		pet = max;
		System.out.println(pet);
		
		System.out.println("");
		foo(max);
		foo(fluffy);
		foo(myPet);
		
		
	}//end of main

	public static void foo(Animal animal){
		
		if(animal instanceof Cat){
			System.out.println("In foo: I'm a Cat");
		}
		if(animal instanceof Dog){
			System.out.println("In foo: I'm a Dog");
		}
		if(animal instanceof Animal){
			System.out.println("In foo: I'm a Animal");
		}
		System.out.println("In foo:" + animal.toString());
	
	}//end of foo
	
}//end of TestInheritance
