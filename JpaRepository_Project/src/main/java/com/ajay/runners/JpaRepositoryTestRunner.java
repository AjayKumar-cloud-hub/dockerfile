package com.ajay.runners;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ajay.entity.Artist;
import com.ajay.service.ArtistManagementService;

@Component("runner")
public class JpaRepositoryTestRunner implements CommandLineRunner {

	@Autowired
	private ArtistManagementService artistService;

	@Override
	public void run(String... args) throws Exception {
//		String string = artistService.removeArtistsByIdsInBatch(List.of(1, 2, 3, 4, 5));
//		System.out.println(string);

//		List<Artist> list = artistService.searchArtistsByGivenData("Ajay",30000);
//		list.forEach(System.out::println);

		try {
			Optional<Artist> opt = artistService.fetchArtistById(12);
			if (opt.isPresent())
				System.out.println("Record is found");
			else
				System.out.println("Record is not found");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Artist proxy = artistService.loadArtistById(12);
			System.out.println(proxy.getAid()+" "+proxy.getAname()+" "+proxy.getCategory()+" "+proxy.getFee());
			System.out.println(proxy.getClass());
			System.out.println(proxy.getAid()+" "+proxy.getAname()+" "+proxy.getCategory()+" "+proxy.getFee());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
