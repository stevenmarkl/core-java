package com.Day7;

interface Inner4{
	void display();
}

public class InnerClassEg {
	
	class Inner{
		void display() {
			System.out.println("non static inner class");
		}
	}
	
	static class Inner2{
		void display() {
			System.out.println("static inner class");
		}
	}

	public static void main(String[] args) {
		
		InnerClassEg obj = new InnerClassEg();
		Inner inner = obj.new Inner();
		inner.display();
		
		Inner2 obj1 =new InnerClassEg.Inner2();
		obj1.display();
		
		class Inner3{
			void display() {
				System.out.println("Local Inner class");
				
			}
		}
		
		Inner3 obj2 = new Inner3();
		obj2.display();
		
		Inner4 obj3 = new Inner4() {
			public void display() {
				System.out.println("Anonymous Inner class");
				
			}
		
		};
		obj3.display();
		
	}
}


