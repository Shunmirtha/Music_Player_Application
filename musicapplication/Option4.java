package com.te.musicapplication;

import java.util.ArrayList;
import java.util.Scanner;

public class Option4 {
	public static void operateOnSongDatabase(String opt,ArrayList<MusicAttributes> arrayList,int n)  {
		Scanner scanner=new Scanner(System.in);
		String songTitle;
		String artistName;
		String albumName;
		String songLocation;
		String songDescription;
		if(opt.equalsIgnoreCase("A")) {
			
			System.out.println("Enter the song name :");
			songTitle=scanner.nextLine();
			System.out.println("Enter the Artist name :");
			artistName=scanner.nextLine();
			System.out.println("Enter the Album name :");
			albumName=scanner.nextLine();
			System.out.println("Enter the Song Location :");
			songLocation=scanner.nextLine();
			System.out.println("Enter the Song Description :");
			songDescription=scanner.nextLine();
			arrayList.add(new MusicAttributes(n,songTitle, artistName, albumName, songLocation, songDescription));
			MusicAttributes.display(arrayList);
			System.out.println("Song added");
		}
		if(opt.equalsIgnoreCase("B")) {
			int index=-1;
			int occured = 0;
			System.out.println("Enter the ID of the song to edit the info :");
			int id=scanner.nextInt();
			
			for(int i=0;i<arrayList.size();i++) {
				if(arrayList.get(i).getSongId()==id) {
					index=arrayList.indexOf(arrayList.get(i));
					occured=1;
				}
			}
			if(occured==1) {
				System.out.println("Enter the song name :");
				scanner.nextLine();
				songTitle=scanner.nextLine();
				System.out.println("Enter the Artist name :");
				artistName=scanner.nextLine();
				System.out.println("Enter the Album name :");
				albumName=scanner.nextLine();
				System.out.println("Enter the Song Location :");
				songLocation=scanner.nextLine();
				System.out.println("Enter the Song Description :");
				songDescription=scanner.nextLine();
				arrayList.set(index,new MusicAttributes(id, songTitle, artistName, albumName, songLocation, songDescription));
				MusicAttributes.display(arrayList);	
			}
			else
				System.out.println("Invalid song ID");
		}
		if(opt.equalsIgnoreCase("C")) {
			int index=-1;
			int occured = 0;
			System.out.println("Enter the ID of the song to be deleted :");
			int id=scanner.nextInt();
			for(int i=0;i<arrayList.size();i++) {
				if(arrayList.get(i).getSongId()==id) {
					index=arrayList.indexOf(arrayList.get(i));
					occured = 1;
				}
			}
			if(occured == 1) {
				System.out.println(arrayList.remove(index));
				System.out.println("Deleted");
				MusicAttributes.display(arrayList);
			}
			else
				System.out.println("Invalid song ID");
			
		}
		
	}
}
