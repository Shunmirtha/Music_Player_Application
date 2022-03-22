package com.te.musicapplication;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		ArrayList<MusicAttributes> arrayList=new ArrayList<MusicAttributes>();
		arrayList.add(new MusicAttributes(01, "Thooriga", "Karthick", "GKM", "TamilNadu", "Pop"));
		arrayList.add(new MusicAttributes(02, "Vaanam", "Karthick", "GKM", "TamilNadu", "Melody"));
		arrayList.add(new MusicAttributes(03, "Hosona", "Krish", "VTV", "TamilNadu", "Peppy"));
		arrayList.add(new MusicAttributes(04, "Kzzzzz", "Sankar", "VTV", "TamilNadu", "Melody"));
		int n=arrayList.size();
		boolean exit = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("================= Music Player =================");
		do {
			System.out.println();
			System.out.println("1. Play a Song");
			System.out.println("2. Search a Song");
			System.out.println("3. Show all Song");
			System.out.println("4. Operate on Song database ");
			System.out.println("5. Exit");
			System.out.print("Enter the option : ");
			int option = scan.nextInt();
			System.out.println();
			switch(option)
			{
				case 1:{
					System.out.println("A. Play all songs");
					System.out.println("B. Play songs randomly");
					System.out.println("C. Play a particular song");
					System.out.print("Enter the option : ");
					System.out.println();
					scan.nextLine();
					String opt = scan.nextLine();
					try {
						Option1.playASong(opt,arrayList);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					break;
				}
				case 2:{
					System.out.print("Enter the song name :");
					System.out.println();
					scan.nextLine();
					int occured = -1;
					String s = scan.nextLine();					
					for (MusicAttributes musicAttributes : arrayList) {
						if(musicAttributes.getSongTitle().contains(s)) {
							System.out.println(musicAttributes);
							occured=1;
						}
					}
					if(occured==- 1) 
						System.out.println("No such Song exist");
					
					break;
				}
				case 3:{
					arrayList.sort((o1,o2) -> o1.getSongTitle().compareTo(o2.getSongTitle()));
					MusicAttributes.display(arrayList);
					break ;
				}
				case 4:{
					System.out.println("A. Add Song");
					System.out.println("B. Edit an existing song info");
					System.out.println("C. Delete an existing song");
					System.out.print("Enter the option : ");
					System.out.println();
					scan.nextLine();
					String opt = scan.nextLine();
					if(opt.equals("A"))
						n+=1;
						
					Option4.operateOnSongDatabase(opt, arrayList,n);
					break;
				}
				case 5:{
					System.out.println("***********************************");
					exit=false;
					break;
				}
				default:
				{
					System.out.println("Invalid option");
				}
			}
		}while(exit);
	}
	
}
