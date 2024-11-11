package edu.pitt.cs;

public class CatImpl implements Cat {

	private int id; 
	private String name;
	private boolean isRented;

	public CatImpl(int id, String name) {
		this.id = id;
		this.name = name;
		this.isRented = false;
	}

	public void rentCat() {
		if (this.isRented == false){
			this.isRented = true;
			System.out.println(this.name +" has been rented.");
		}
		else{
			System.out.println("Sorry, " + this.name + " has already been rented.");
		}
		
	}

	public void returnCat() {
		if (this.isRented == true){
			this.isRented = false;
			System.out.println("Welcome back, " + this.name + "!");
		}
		else{
			System.out.println(this.name + " is already here.");
		}
	}

	public void renameCat(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.id;
	}

	public boolean getRented() {
		return this.isRented;
	}

	public String toString() {
		String ret = "ID " + this.id + ". " + this.name; 
		return ret;
	}

}