package com.ajay.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.ajay.entity.Artist;
import com.ajay.repository.ArtistRepository;

@Service("artistServ")
public class ArtistManagementServiceImpl implements ArtistManagementService {

	@Autowired
	private ArtistRepository artistRepo;

	@Override
	public String removeArtistsByIdsInBatch(List<Integer> ids) {
		//Load objects by id
		List<Artist> list = artistRepo.findAllById(ids);
		//delete objs by ids in batch processing
		artistRepo.deleteAllByIdInBatch(ids);
		return list.size()+" records deleted";
	}

	@Override
	public List<Artist> searchArtistsByGivenData(String name, double income) {
		//prepare Example obj
		Artist artist = new Artist();
		artist.setAname(name);
		artist.setFee(income);
		Example<Artist> example = Example.of(artist);
		// execute logic
		List<Artist> list = artistRepo.findAll(example);
		return list;
	}

	@Override
	public Optional<Artist> fetchArtistById(int id) {
		Optional<Artist> byId = artistRepo.findById(id);
		Artist referenceById = artistRepo.getReferenceById(id);
		System.out.println("referenceById.getAname() "+referenceById.getAname());
		return byId;
	}

	@Override
	public Artist loadArtistById(int id) {
		Artist id2 = artistRepo.getReferenceById(id);
		return id2;
	}

	
}
	
