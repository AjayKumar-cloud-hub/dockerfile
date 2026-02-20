package com.ajay.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ajay.entity.Artist;

public interface ArtistRepository extends JpaRepository<Artist,Integer>{

}
