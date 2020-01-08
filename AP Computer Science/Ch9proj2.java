
public class Ch9proj2{
	public static void main(String[] args) {
		Sandwich sandwich;
		Salad salad;
		Drink drink;
		sandwich=new Sandwich("Cheeseburger", 2.75);
		salad=new Salad("Spinach, Salad", 1.25);
		drink=new Drink("Orange Soda", 1.25);
		Trio trio=new Trio(sandwich, salad, drink);
		System.out.println(sandwich.getName()+" $"+sandwich.getPrice());
		System.out.println(salad.getName()+" $"+salad.getPrice());
		System.out.println(drink.getName()+" $"+drink.getPrice());
		System.out.println(trio.getName()+" $"+trio.getPrice());
		System.out.println();
		sandwich=new Sandwich("Club Sandwich", 2.75);
		salad=new Salad("Coleslaw", 1.25);
		drink=new Drink("Cappuccino", 3.50);
		trio=new Trio(sandwich, salad, drink);
		System.out.println(sandwich.getName()+" $"+sandwich.getPrice());
		System.out.println(salad.getName()+" $"+salad.getPrice());
		System.out.println(drink.getName()+" $"+drink.getPrice());
		System.out.println(trio.getName()+" $"+trio.getPrice());
	}
}
