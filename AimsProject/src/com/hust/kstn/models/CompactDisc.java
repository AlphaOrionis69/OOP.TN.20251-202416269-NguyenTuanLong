package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc{
	private List<String> artists = new ArrayList<>();
	private List<String> directors = new ArrayList<>();
	private List<Track> tracks = new ArrayList<>();
	public CompactDisc(String title, double cost, String category, List<String> artists, List<String> directors, List<Track> tracks) {
		super(title, cost, category);
		this.artists.addAll(artists);
		this.directors.addAll(directors);
		this.tracks.addAll(tracks);
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
		output.append(super.toString());
		output.append(String.format("[%d]", totalLength()));
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
