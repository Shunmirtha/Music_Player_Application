package com.te.musicapplication;

import java.util.ArrayList;


public class MusicAttributes {
	private int songId;
	private String songTitle;
	private String artistName;
	private String albumName;
	private String songLocation;
	private String songDescription;
	public MusicAttributes() {
		super();
	}
	
	public MusicAttributes(int songId, String songTitle, String artistName, String albumName, String songLocation,
			String songDescription) {
		super();
		this.songId = songId;
		this.songTitle = songTitle;
		this.artistName = artistName;
		this.albumName = albumName;
		this.songLocation = songLocation;
		this.songDescription = songDescription;
	}
	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
	}
	public String getSongTitle() {
		return songTitle;
	}
	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public String getSongLocation() {
		return songLocation;
	}
	public void setSongLocation(String songLocation) {
		this.songLocation = songLocation;
	}
	public String getSongDescription() {
		return songDescription;
	}
	public void setSongDescription(String songDescription) {
		this.songDescription = songDescription;
	}
	public static void display(ArrayList<MusicAttributes> arrayList) {
		
		System.out.printf("%14s %14s %14s %14s %14s %14s","Song_Id","Song_Title","Album_Name","Artist_Name","Song_Location","Song_Description");
		System.out.println();
		System.out.println();
		for (MusicAttributes musicAttributes : arrayList) {
			System.out.format("%14d %14s %14s %14s %14s %14s", musicAttributes.getSongId(),musicAttributes.getSongTitle(),musicAttributes.getAlbumName(),musicAttributes.artistName,musicAttributes.getSongLocation(),musicAttributes.songDescription);
			System.out.println();
		}
			
	}
	@Override
	public String toString() {
		
		return "[songId : " + songId + ", songTitle : " + songTitle + ", artistName : " + artistName
				+ ", albumName : " + albumName + ", songLocation : " + songLocation + ", songDescription : " + songDescription
				+ "]";
	}
	
	
	
}
