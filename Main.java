package PharmaciGestion;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		ArrayList<Client> arrayClient = new ArrayList<Client>();
		ArrayList<Medicament> arrayMedicament = new ArrayList<Medicament>();
		ArrayList<Pharmacien> arrayPharmacien = new ArrayList<Pharmacien>();
		
		boolean Quit = false;

		while(Quit != true) {		    
			 System.out.println(" 1 Client");
			 System.out.println(" 2 Médicament");
			 System.out.println(" 3 Pharmacien");
			 
			Scanner scanner = new Scanner(System.in);
			Scanner scanner2 = new Scanner(System.in);
		    int choix = scanner.nextInt();
		    
		    //add new client
		    
		    switch(choix) {
			    case 1:
					System.out.println("1- add client");
					System.out.println("2- show client");
					System.out.println("3- modifier client");
					System.out.println("4- delete client");
					
					int input = scanner.nextInt();

				switch(input) {
					case 1:

					System.out.print("Add new client? (Y/N) : ");
					char yn = scanner.next().charAt(0);

					switch(yn) {
					case 'Y':
						while(yn == 'Y') {
							
							Client clientObj = new Client();

							int id;
							System.out.println("entrez vous id! :");
							id = scanner.nextInt();
							clientObj.setId(id);
							
							String nomP;
							System.out.println("entrez vous nom et prenom! :");
							nomP = scanner2.nextLine();
							clientObj.setNom(nomP);
							
							String email;
							System.out.println("entrez vous email! :");
							email = scanner2.nextLine();
							clientObj.setEmail(email);
							
							int tele;
							System.out.println("entrez vous telephone! :");
							tele = scanner.nextInt();
							clientObj.setTele(tele);
								
							int badge;
							System.out.println("entrez vous badge! :");
							badge = scanner.nextInt();
							clientObj.setBadge(badge);
							
							boolean isFidel = clientObj.getFidele();
							
							if(clientObj.getBadge() >= 3) {
								clientObj.setFidele(true);
							}
							else {
								clientObj.setFidele(false);
							}
							
							arrayClient.add(clientObj);
							
							System.out.print("Add another client? y/n : ");
					    	  yn = scanner.next().charAt(0);
						}
					break;
					case 'N':
					break;
					}
					break;
					
					case 2:
						for(Client client: arrayClient) {
							System.out.println(client.toString());
						}
					break;
					
					case 3:
						System.out.println("entrer identifiere du client pour modifier");
						int clientId = scanner.nextInt() -1;
						
						Client clientObj = new Client();
						
						int id;
						System.out.println("entrez vous id ! :");
						id = scanner.nextInt();
						clientObj.setId(id);
						
						String nomP;
						System.out.println("entrez vous nom et prenom! :");
						nomP = scanner2.nextLine();
						clientObj.setNom(nomP);
						
						String email;
						System.out.println("entrez vous email! :");
						email = scanner2.nextLine();
						clientObj.setEmail(email);
						
						int tele;
						System.out.println("entrez vous telephone! :");
						tele = scanner.nextInt();
						clientObj.setTele(tele);
							
						int badge;
						System.out.println("entrez vous badge! :");
						badge = scanner.nextInt();
						clientObj.setBadge(badge);
						
						arrayClient.set(clientId, clientObj);
					break;
					
					case 4:
						System.out.println("tapez le id d'utilisateur pour suprimez");
						
						id = scanner.nextInt() - 1;
						
						arrayClient.remove(id);
						
					break;
				}
			    break;
			    
			    case 2:
					System.out.println("1- add médicament");
					System.out.println("2- show médicament");
					System.out.println("3- modifier médicament");
					System.out.println("4- delete médicament");
					
					int inputM = scanner.nextInt();

					switch(inputM) {
						case 1:

						System.out.print("Add new Médicament? (Y/N) : ");
						char yn = scanner.next().charAt(0);

						switch(yn) {
						case 'Y':
							while(yn == 'Y') {
								Medicament medicamentObj  = new Medicament();


								int id;
								System.out.println("entrez vous id ! :");
								id = scanner.nextInt();
								medicamentObj.setId(id);
								
								String nomP;
								System.out.println("entrez vous nom!:");
								nomP = scanner2.nextLine();
								medicamentObj.setNom(nomP);
								
								String description;
								System.out.println("entrez vous description! :");
								description = scanner2.nextLine();
								medicamentObj.setDescription(description);
								
								int prix;
								System.out.println("entrez vous prix! :");
								prix = scanner.nextInt();
								medicamentObj.setPrix(prix);
									
								
								arrayMedicament.add(medicamentObj);
								
								System.out.print("Add another Médicament? y/n : ");
						    	  yn = scanner.next().charAt(0);
							}
						break;
						case 'N':
						break;
						}
						break;
						
						case 2:
							
							for(Medicament medicament: arrayMedicament) {
								System.out.println(medicament.toString());
							}
						break;
						
						case 3:
							
							System.out.println("entrer identifiere du médicament pour modifier");

							int medicamentId = scanner.nextInt() -1;
							
							Medicament medicamentObj  = new Medicament();
							
							int id;
							System.out.println("entrez vous id ! :");
							id = scanner.nextInt();
							medicamentObj.setId(id);
							
							String nomP;
							System.out.println("entrez vous nom! :");
							nomP = scanner2.nextLine();
							medicamentObj.setNom(nomP);
							
							String description;
							System.out.println("entrez vous description! :");
							description = scanner2.nextLine();
							medicamentObj.setDescription(description);
							
							int prix;
							System.out.println("entrez vous prix! :");
							prix = scanner.nextInt();
							medicamentObj.setPrix(prix);
							
							arrayMedicament.set(medicamentId, medicamentObj);
						break;
						
						case 4:
							System.out.println("tapez le id du médicament pour suprimez");
							
							
							id = scanner.nextInt() -1;
							
							arrayMedicament.remove(id);
						break;
		    }
			    break;
			    
			    case 3:
					System.out.println("1- add pharmacien");
					System.out.println("2- show pharmacien");
					System.out.println("3- modifier pharmacien");
					System.out.println("4- delete pharmacien");
					
					int inputP = scanner.nextInt();

					switch(inputP) {
						case 1:

						System.out.print("Add new pharmacien ? (Y/N) : ");
						char yn = scanner.next().charAt(0);

						switch(yn) {
						case 'Y':
							while(yn == 'Y') {
								
								Pharmacien pharmacienObj  = new Pharmacien();
								
								int id;
								System.out.println("entrez vous id ! :");
								id = scanner.nextInt();
								pharmacienObj.setId(id);
								
								String nomP;
								System.out.println("entrez vous nom et prenom! :");
								nomP = scanner2.nextLine();
								pharmacienObj.setNom(nomP);
								
								String email;
								System.out.println("entrez vous email! :");
								email = scanner2.nextLine();
								pharmacienObj.setEmail(email);
								
								int tele;
								System.out.println("entrez vous telephone! :");
								tele = scanner.nextInt();
								pharmacienObj.setTele(tele);
								
								
								arrayPharmacien.add(pharmacienObj);
								
								System.out.print("Add another pharmacien? y/n : ");
						    	  yn = scanner.next().charAt(0);
							}
						break;
						case 'N':
						break;
						}
						break;
						
						case 2:
							for(Pharmacien pharmacien: arrayPharmacien) {
								System.out.println(pharmacien.toString());
							}
						break;
						
						case 3:
							System.out.println("entrer identifiere du pharmacien pour modifier");
							
							int pharmacienId = scanner.nextInt() -1;
							
							Pharmacien pharmacienObj  = new Pharmacien();
							
							int id;
							System.out.println("entrez vous id ! :");
							id = scanner.nextInt();
							pharmacienObj.setId(id);
							
							String nomP;
							System.out.println("entrez vous nom et prenom! :");
							nomP = scanner2.nextLine();
							pharmacienObj.setNom(nomP);
							
							String email;
							System.out.println("entrez vous email! :");
							email = scanner2.nextLine();
							pharmacienObj.setEmail(email);
							
							int tele;
							System.out.println("entrez vous telephone! :");
							tele = scanner.nextInt();
							pharmacienObj.setTele(tele);
						
							arrayPharmacien.set(pharmacienId, pharmacienObj);
						break;
						
						case 4:
							System.out.println("tapez le id du pharmacien pour suprimez");
							
							id = scanner.nextInt() -1;
							
							arrayPharmacien.remove(id);
						break;
					}
					
			    break;
			    
			    case 4:
			    	System.out.println("Merci pour votre visite");
			    	Quit = true;
			    break;
		    }
		    
		}
	
	 }
	
 }
