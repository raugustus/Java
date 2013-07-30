import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FWtW {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		java.util.ArrayList<String> addArticles = 
				new java.util.ArrayList<String>();
		
		String answer = null;
		String woreOn;
		String dayOfWeek;
		
		String choice;
		int m = 1, t = 1, w = 1, th =1, fr = 1;
		
		boolean done = true;
			

		List<String> Mo = new ArrayList<String>(); // day worn
		List<String> Tu = new ArrayList<String>(); // day worn
		List<String> We = new ArrayList<String>(); // day worn
		List<String> Th = new ArrayList<String>(); // day worn
		List<String> Fr = new ArrayList<String>(); // day worn
		//add total number of outfits avail-- List<String> typesOfPants...


		System.out.println("Did you forget what you wore this week? \n Presss 'y' or 'n'.");
		
			do{
				answer = scan.next();
			}while (!answer.matches("y|n|Y|N"));
		
		
		if (answer.matches("n|N")){ //add input validation
			System.out.println("Bye Bye");
			done = false;
		}
	
		else
			while(done != false){

				System.out.println("1.) Enter clothes you have already worn this week" );
				System.out.println("2.) See what you have worn this week" );
				System.out.println("3.) Total number of outfits that can worn");
				System.out.println("4.) Exit application" );

				do
				{
					choice = scan.next();
				}while(!choice.matches("[0-4)]"));
				
				switch (choice){
				case "1":
					System.out.println("To start type 'start', type 'end' to quit application?");
					do{
						dayOfWeek = scan.next();
					}while (!dayOfWeek.matches("start|end"));
					
					switch(dayOfWeek){
					case "start":
						System.out.println("Enter article(s) of clothing");
						System.out.println("M");
						while(m != 0){
							woreOn = scan.nextLine();
							if(woreOn.equals("done")){
								m = 0;
							}
							Mo.add(woreOn);
							Mo.remove(""); // removes blank spaces
							Mo.remove("done"); //removes keyword that ends list entry from appearing in list
							//Mo.remove(Mo.size()-1);
							//Mo.remove(woreOn.size()-1);
						}
						System.out.println("T");
						while(t != 0){
							woreOn = scan.nextLine();
							if(woreOn.equals("done")){
								t = 0;
							}
							Tu.add(woreOn);
						}		
						System.out.println("W");
						while(w != 0){
							woreOn = scan.nextLine();
							if(woreOn.equals("done")){
								w = 0;
							}
							We.add(woreOn);
						}
						System.out.println("Th");
						while(th != 0){
							woreOn = scan.nextLine();
							if(woreOn.equals("done")){
								th = 0;
							}
							Th.add(woreOn);
						}
						System.out.println("F");
						while(fr != 0){
							woreOn = scan.nextLine();
							if(woreOn.equals("done")){
								fr = 0;
							}
							Fr.add(woreOn);
						}
						break;
					}

				case "2":
					//System.out.println("You have already worn the following items: " );
					//System.out.println(wT);
					System.out.print("You have already worn the following:\n");
					System.out.println("On Monday");
					Iterator<String> itrM = Mo.iterator();
					while(itrM.hasNext()){
						Object element = itrM.next();
						System.out.print(element + " " + "\n");
					}
					Iterator<String> itrTu = Tu.iterator();
					while(itrTu.hasNext()){
						Object element = itrTu.next();
						System.out.print(element + " " + "\n\n");
					}
					Iterator<String> itrWe = We.iterator();
					while(itrWe.hasNext()){
						Object element = itrWe.next();
						System.out.print(element + " " + "\n\n");
					}
					Iterator<String> itrTh = Th.iterator();
					while(itrTh.hasNext()){
						Object element = itrTh.next();
						System.out.print (element + " " + "\n\n");
					}
					Iterator<String> itrFr = Fr.iterator();
					while(itrFr.hasNext()){
						Object element = itrFr.next();
						System.out.print (element + " " + "\n\n");
					}
					break;

				case "3":
					int countMo = 0;
					for (String item : Mo) {
						if (Mo.contains(item))
							countMo++;
					}
					System.out.println(countMo);

					int countTu = 0;
					for (String item : Tu) {
						if (Tu.contains(item))
							countTu++;
					}
					System.out.println(countTu);

					int countWe = 0;
					for (String item : We) {
						if (We.contains(item))
							countWe++;
					}
					System.out.println(countWe);

					int countTh = 0;
					for (String item : Th) {
						if (Th.contains(item))
							countTh++;
					}
					System.out.println(countTh);

					int countFr = 0;
					for (String item : Fr){
						if (Fr.contains(item))
							countFr++;
					}
					System.out.println(countFr);
					break;

				case "4":
					System.out.println("Bye!");
					done = false;
					break;
					
				default:System.out.println("Game Over");
				done = false;
				break;
				} // end switch statement
			}
	} // end main
}// end class

/*
scrap code

List<String> insert = new ArrayList();

for (z = 0; z < 100; z++)
{
	String ze = "" + z;
	insert.add(ze);
	System.out.println("number " + ze);
}
 */