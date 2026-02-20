package com.ajay.service;


import java.util.List;
import java.util.Optional;

import com.ajay.entity.Artist;


public interface ArtistManagementService {
	public String removeArtistsByIdsInBatch(List<Integer> ids);
	public List<Artist> searchArtistsByGivenData(String name, double income);

	public Optional<Artist> fetchArtistById(int id);
	public Artist loadArtistById(int id);
}
