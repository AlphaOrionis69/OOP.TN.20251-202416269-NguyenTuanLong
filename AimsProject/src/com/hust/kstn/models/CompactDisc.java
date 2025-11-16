package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc {
	private static int nbCompactDiscs = 0;
	private int id;
	private String title;
	private String category;
	private double cost;
	private List<String> artists = new ArrayList<>();
	private List<String> directors = new ArrayList<>();
	private List<Track> tracks = new ArrayList<>();
	public CompactDisc(String title, String category, double cost, List<String> artists, List<String> directors, List<Track> tracks) {
		this.id = ++nbCompactDiscs;
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.artists.addAll(artists);
		this.directors.addAll(directors);
		this.tracks.addAll(tracks);
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public double getCost() {
		return cost;
	}
	public List<String> getArtists() {
		return new ArrayList<>(artists);
	}
	public List<String> getDirectors() {
		return new ArrayList<>(directors);
	}
	public List<Track> getTracks() {
		return new ArrayList<>(tracks);
	}
	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		output.append(String.format("CD[%d][%s][%.2f][%s][%d]", id, title, cost, category, totalLength()));
		output.append("\nArtists: "); output.append(artists);
		output.append("\nDirectors: "); output.append(directors);
		output.append("\nTracks: "); output.append(tracks);
		return output.toString();
	}
	public int totalLength() {
		int totalLength = 0;
		for (Track track : tracks) {
			totalLength += track.getLength();
		}
		return totalLength;
	}
	public void addTrack(Track track) {
		boolean canAdd = tracks.add(track);
		if (canAdd) {
			System.out.println("The track has been added successfully");
		}
		else System.out.println("Cannot add this track");
	}
	public void removeTrack(Track track) {
		boolean canRemove = tracks.remove(track);
		if (canRemove) {
			System.out.println("One of the tracks has been removed successfully");
		}
		else {
			System.out.println("Cannot find this track to remove");
		}
	}
}
