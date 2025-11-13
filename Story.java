package hackathon;

import java.util.Scanner;

public class Story {

	static Scanner sc = new Scanner(System.in);
	
	static void mm() {
		
		System.out.println(" Game ");
		System.out.println(" [1]Start ");
		System.out.println(" [2]Close ");
		int n = sc.nextInt();
		
		switch(n) {
			case 1:
				System.out.print("Starting.");
				try {
					Thread.sleep(1500);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print(".");
				try {
					Thread.sleep(1500);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print(".");
				break;
			case 2:
				System.out.println("Ending.");
				try {
					Thread.sleep(1500);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print(".");
				try {
					Thread.sleep(1500);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print(".");
				break;
			default :
				System.out.println("That's not a choice.");
		}
	
	}
	
	static void s() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
	
	static void prol() {
		
		System.out.println(
				"You're a tourist travelling across the Philippines in a cheap rental scooter that you found from a sketchy guy online");
		System.out.println();
		try {
			Thread.sleep(1500);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(
				"You find yourself suddenly from the main road into a long forest where you kept going straight for an hour, when you suddenly teh scooter starts breaking down by a mysterious bridge");
		System.out.println();
		try {
			Thread.sleep(1500);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(
				"Across the bridge sits a town, eerily quiet and no people on sight. You decide to leave your scooter to explore the town, hoping to find people to ask for help to leave this place");
		System.out.println();
		try {
			Thread.sleep(1500);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("as you explore the town you find it completely empty and not a single local resident on sight, The night crawls in and you decide to stay a seemingly broken down house for now to be safe from the night.");
	}
	
	static void s1() {
		
		System.out.println("HOUSE 1:");
		System.out.println();
		try {
			Thread.sleep(750);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(
				"as you enter the house you see the interior, windows broken down and dust scattered all over the floor.");
		try {
			Thread.sleep(750);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(
				"you notice an out-of-place amulet by the table in the center of the room and as you try to pick it up ");
		try {
			Thread.sleep(750);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out
				.println("you feel an intense pain stabbing on your chest -%$^!$!*!#$&(you get disoriented)");
		
		// SCENE
		
		System.out.println("");
		System.out.println("BACK TO BRIDGE:");
		System.out.println("After the weird occurrence you find yourself back at the bridge with the night closing in again you have a choice to make:");
		System.out.println("A. try to enter the first house again");
		System.out.println("B. pick a cottage you spot at a distance to stay the night in");
		System.out.println("");
		System.out.print("Pick your choice: ");
		String c = sc.nextLine();
		
		switch (c) {
			case "A":
				
				break;
			case "B":
				
				break;
		}
	}
	
	static void s1c() {
		
		System.out.println("A. try to enter the first house again");
		System.out.println("B. pick a cottage you spot at a distance to stay the night in");
		System.out.println("");
		System.out.print("Pick your choice: ");
		String c = sc.nextLine();
		
		switch (c) {
			case "A":
				
				break;
			case "B":
				
				break;
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		mm();
		try {
			Thread.sleep(1500);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		s();
		prol();
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		story1();
		
		sc.close();
	}
	
	static void story1() {
		s();
		s1();
	}
		
}
