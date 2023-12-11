//Annotation

import java.util.*;

class Animal
{
	void eatSomething(){
		System.out.println("Eating Something");
	}
}
class Dog extends Animal
{
	void eatSomething(){
		System.out.println("Eating Food");
	}
}
class J110
{
	public static void main(String args[])
	{
		Animal a1 = new Dog();
		a1.eatSomething();
	}
}