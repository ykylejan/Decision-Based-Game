package decisongame;

import java.util.Scanner;

public class DecisonGame {

	public static void main(String[] args) {
		int choice = 0;
		
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		Scanner input4 = new Scanner(System.in);
		
		String mainstory="I am currently trapped in a dungeon. \n"
				+"I can't seem to find my way out. \n"
				+"I did some exploring and I found a humanoid monster. \n";
		
		String storyA="I decided to fight the monster. \n"
				+"I dashed diretly towards it. \n"
				+"But I suddenly remember I don't have any equipments.\n";
		String storyA1="I tried to punch the monster, but it has no effect. \n"
				+"The monster has an overwhelming strength, and it punched you back. \n"
				+"You died \n"
				+" \n"
				+"BAD ENDING";
		String storyA2="I tried to block using my arms for the monster's attack. \n"
				+"But the monster has an overwhelming strength, and it pierced your block thorugh it. \n"
				+"You died \n"
				+" \n"
				+"BAD ENDING";
		String storyA3="I decided to stop midway and run back. \n"
				+"But the monster has an overwhelming speed, and it chased you quick and punched. \n"
				+"You died \n"
				+" \n"
				+"BAD ENDING";
		
		
		String storyB="I avoided the monster and proceeded to my exploration \n"
				+"But the monster still senses me and was hostile. \n"
				+"It ran towards me. \n";
		String storyB1="I tried to counter it with a punch, but it has no effect. \n"
				+"But the monster has an overwhelming strenth, and it punched you back. \n"
				+"You died \n"
				+" \n"
				+"BAD ENDING";
		String storyB2="I tried to block using my arms for the monster's attack. \n"
				+"But the monster has an overwhelming strength, and it pierced your block through it. \n"
				+"You died \n"
				+" \n"
				+"BAD ENDING";
		String storyB3="I decided to run away from it. \n"
				+"But the monster has an overwhelming speed, and it chased you quick and punched. \n"
				+"You died \n"
				+" \n"
				+"BAD ENDING";
		
		
		String storyC="I decided to play it safe and find another route instead. \n"
				+"I kept exploring the dungeon. \n"
				+"After many longs walks, I found a chest. \n";
		String storyC1="The chest didn't have a lock so I opened it. \n"
				+"But as soon as I opened the chest, a deadly pitfall trapped activated! \n"
				+"You died \n"
				+" \n"
				+"BAD ENDING";
		String storyC2="I decided to rest for a bit instead of opening the chest first \n"
				+"As soon as I lay down to the wall, the humanoid monster suprised you with an attack! \n"
				+"You died \n"
				+" \n"
				+"BAD ENDING";
		String storyC3="I decided to leave it and prioritize my way out of here. \n"
				+"I kept exploring more and I was very exhausted. \n"
				+ " \n"
				+"Soon I was about to give up, I found a door. \n"
				+"I opened the door, and it was outside! \n"
				+"You Escaped and Lived! \n"
				+" \n"
				+"GOOD ENDING";
		
		do {
			System.out.println(mainstory); 
			System.out.println("What will you do? ");
			System.out.println("1. Confont and fight it ");
			System.out.println("2. Avoid it ");
			System.out.println("3. Find another route");
			choice=input.nextInt();
			
			if(choice == 1) {
				System.out.println(storyA);
				System.out.println("What will you do next!? \n");
				do {
					System.out.println("1. Attack it with a punch");
					System.out.println("2. Defend it with a block");
					System.out.println("3. Stop and go back");			
					choice=input2.nextInt();
					if (choice==1) {
						System.out.println(storyA1);
						break;
					}
					else if (choice==2) {
						System.out.println(storyA2);
						break;
					}
					else if (choice==3) {
						System.out.println(storyA3);
						break;
					}
					else {
						continue;
					}
				}while(choice!=3);
				
				break;
			}
			else if(choice == 2) {
				System.out.println(storyB);
				System.out.println("What will you do next!? \n");
				do {
					System.out.println("1. Counter it with a punch");
					System.out.println("2. Defend it with a block");
					System.out.println("3. Ran away from it");
					choice=input3.nextInt();
					if (choice==1) {
						System.out.println(storyB1);
						break;
					}
					else if (choice==2) {
						System.out.println(storyB2);
						break;
					}
					else if (choice==3) {
						System.out.println(storyB3);
						break;
					}
					else {
						continue;
					}
					
				}while(choice!=3);

				break;
			}
			else if(choice == 3) {
				System.out.println(storyC);
				System.out.println("What will you do next? \n");
				do {
					System.out.println("1. Open the chest ");
					System.out.println("2. Rest for a bit");
					System.out.println("3. Leave it");
					choice=input4.nextInt();
					if (choice==1) {
						System.out.println(storyC1);
						break;
					}
					else if (choice==2) {
						System.out.println(storyC2);
						break;
					}
					else if (choice==3) {
						System.out.println(storyC3);
						break;
					}
					else {
						continue;
					}
				}while(choice!=3);
				
			}
			else {
				continue;
			}
			break;
		} while(choice!=3);
	}

}
