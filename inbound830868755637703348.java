
import java.util.*;
public class Rey {
				private String add;
				public Rey (String i){
								this.add = i;
				}
				public String myadd (){
								return add;
				}
				public String toString(){
								return "Your data: "+ add;
				}
				public void ln(String ln){
								System.out.println(ln);
				}
				public void l(String l){
								System.out.print(l);
				}
				public static void main(String[] args) {
						
								LinkedList <String> mylink = new LinkedList <> ();
								Scanner scan = new Scanner (System.in);
								while(true){
												System.out.println("\n\t\t LINKEDLIST");
								System.out.println("\t1. Add");
								System.out.println("\t2. Delete");
							System.out.println("\t3. Update");
							System.out.println("\t4. Display");
												System.out.println("\t5. Exit");
								System.out.print("Enter a number: ");
								String num = scan.nextLine();
								
								switch(num){
												case "1":
												System.out.println("\t\tAdd");
												System.out.print("Please Enter: ");
												String enter = scan.nextLine();
												mylink.add(enter);
												break;
												case "2":
												System.out.println("\t\tDelete");
												System.out.print("Enter the element to remove: ");
												String remove = scan.nextLine();
												mylink.remove(remove);
												break;
												case "3":
												System.out.print("Enter the element you want to update: ");
												String update= scan.nextLine();
												mylink.remove(update);
												System.out.print("Enter a new data: ");
												String data = scan.nextLine();
												mylink.add(data);
												break;
												case "4":
												for(String lee: mylink){
																System.out.println(lee);
												}
												break;
												case "5":
												System.exit(0);
												break;
								}
								}
				}
				
}