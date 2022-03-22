package com.te.musicapplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Option1 {
	
	
	public static void playASong(String a,ArrayList<MusicAttributes> arrayList) throws InterruptedException {
		Scanner scan= new Scanner(System.in);
		if(a.equals("A")) {
			
			for (MusicAttributes musicAttributes : arrayList) {
				System.out.println(musicAttributes);
				System.out.println(musicAttributes.getSongTitle()+" playing  :-) " );
				Thread.sleep(1000);
			}			
		}
		if(a.equals("B")) {
			ArrayList<MusicAttributes> arrayList1= new ArrayList<>(arrayList);
			Collections.shuffle(arrayList1);
			
			for (MusicAttributes musicAttributes : arrayList1) {
				System.out.println(musicAttributes);
				System.out.println(musicAttributes.getSongTitle()+" playing  :-) " );
				Thread.sleep(1000);
			}
		}
		if(a.equals("C")) {
			System.out.println("Enter the Song_ID : ");
			int id= scan.nextInt();
			if(id<=arrayList.size()) {
				for (MusicAttributes musicAttributes : arrayList) {
					if(musicAttributes.getSongId()==id) {
						System.out.println(musicAttributes);
						System.out.println(musicAttributes.getSongTitle()+" playing  :-) " );
						Thread.sleep(1000);
					}
				}
			}
			else 
				System.out.println("Ivalid Song ID");
		}
	}
}
