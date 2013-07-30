import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class emplSchedule {
	@SuppressWarnings("resource")
	public static <Int> void main(String[] args) throws IOException {
		Scanner s = new Scanner (System.in);
		@SuppressWarnings("unused")
		java.util.ArrayList<String> emplName =
				new ArrayList<String>();
		@SuppressWarnings("unused")
		java.util.ArrayList<String> emplNumber = 
				new ArrayList<String>();

		String employeeName = null;
		//String employeeNumber = null;
		String dec = null;
		
		//int nameCount = emplName.size();
		int stop = 1;
		int countEmpl = 0;
		int bye = 0;
		boolean end = true;
		ArrayList<String> emplN = new ArrayList<String>();
		@SuppressWarnings("unused")
		ArrayList<String> emplNo = new ArrayList<String>();
		
		while(end !=false){
			System.out.println("This is an employee schedule.\n Press 1 to enter names. \n Press 2 to view names. \n Press 3 to add more items to the list. \n Press 4 to exit");
			//dec = s.nextLine();
			do {
				dec = s.nextLine();
			}while(!dec.matches("[1-4]"));
			switch(dec){
					case "1":
						if(emplN.isEmpty()){
							System.out.println("Enter your new employees names \n");
							while(stop != 0){
								employeeName = s.next();
								emplN.add(employeeName + ",");
									if(employeeName.equals("stop")){
										stop = 0;
									}
							}	
							
						bye = emplN.size()-1;
						//emplN.remove(bye-1);
							}
						break;
					case "2":
						if(emplN.isEmpty()&& countEmpl < 1){ 
							System.out.println(" You have not added any empl");
							emplN.clear();
							stop = 2;
							countEmpl--;
						}
						else{
							System.out.println("You have added " + bye + " employees");
						}
						stop = 2;
						break;
					case "3":
						if(!emplN.isEmpty()){
							System.out.println("You have already entered some users. \n Press '1' to enter more names.");
							dec = s.next(); 
								switch(dec){
								case "1":
									System.out.println("Enter your new employees names \n");
									do{
										employeeName = s.next();
										emplN.add(employeeName);
											if(employeeName.equals("stop")){
												stop = 0;
												emplN.remove("stop");
											}
											bye = emplN.size()-1;
									}while(stop != 0);
								break;
								
								default:
									stop = 1;	
								}
						}
						else{
							System.out.println("There are no items in the list.\n");
							stop = 2;
						}
						break;

					case "4":
						
						System.out.println("Saving...");
						FileWriter writeOut = new FileWriter("clothes.txt");
						for(String str: emplN) {
							writeOut.write(str);
						}
						writeOut.close();
						
						stop = 0;
						end = false;
						System.out.println("End of application");
						break;
						
					default:
						stop = 0;	
			}
		}
	}
}
