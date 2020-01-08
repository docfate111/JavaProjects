package src;
import java.util.Scanner;
public class BuyTicket {
	public static void main(String[] args) {
		Scanner kboard=new Scanner(System.in);
		System.out.print("Buy ticket? y/n ");
		String ticket=kboard.nextLine();
		Ticket walkupTicket=new Walkup();
		while(ticket.equals("y")) {
			Scanner kboard1=new Scanner(System.in);
			System.out.print("How many days in advance? ");
			int days=kboard1.nextInt();
			
			Scanner kboard2=new Scanner(System.in);
			System.out.print("Are you a student? y/n ");
			String answer=kboard2.nextLine();
			
			Ticket studentTicket=new StudentAdvance(days);
			Ticket advanceTicket=new Advance(days);
			
			if(days==0) {
				System.out.println("Please buy walkup ticket ");
				System.out.println(walkupTicket);
			}else {
				if(answer.equals("y")) {
					System.out.println(studentTicket+"\nPrice: "+studentTicket.getPrice());
				}else {
					System.out.println(advanceTicket+"\nPrice: "+advanceTicket.getPrice());
				}
			}
			System.out.print("\nBuy more tickets? y/n ");
			ticket=kboard.nextLine();
		}
	}
}

