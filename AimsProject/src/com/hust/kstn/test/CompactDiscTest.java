package com.hust.kstn.test;

import java.util.List;

import com.hust.kstn.models.CompactDisc;
import com.hust.kstn.models.Track;

public class CompactDiscTest {
	public static void main (String[] args) {
		CompactDisc disc = TestUtils.generateRandomCompactDiscs(1)[0];
		List<Track> tracks = TestUtils.generateRandomTracks();
		System.out.println(disc);
		System.out.println();

		// modifies
		disc.addTrack(tracks.get(0)); // add successfully
		System.out.println(disc);
		System.out.println();
		disc.removeTrack(tracks.get(0)); // remove successfully
		System.out.println(disc);
		System.out.println();

		disc.removeTrack(tracks.get(0)); // failed
		System.out.println(disc);
		System.out.println();

	}
}
