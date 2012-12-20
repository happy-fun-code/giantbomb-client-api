package com.happyfuncode.giantbomb.model.game;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.happyfuncode.giantbomb.model.CommonResource;
import com.happyfuncode.giantbomb.model.company.Company;
import com.happyfuncode.giantbomb.model.franchise.Franchise;
import com.happyfuncode.giantbomb.model.genre.Genre;
import com.happyfuncode.giantbomb.model.platform.Platform;

public class Game extends CommonResource {
	private List<String> aliases;
	private Set<Character> characters;
	private String deck;
	private String description;
	private Set<Company> developers;
	private Integer expectedReleaseMonth;
	private Integer expectedReleaseQuarter;
	private Integer expectedReleaseYear;
	private Set<Character> firstAppearanceCharacters;
	private Set<Franchise> franchises;	
	private Set<Genre> genres;
	private Set<Character> killedCharacters;
	private String name;
	private Long numberOfUserReviews;
	private Date originalReleaseDate;
	private Set<Platform> platforms;
	private Set<Company> publishers;
	private Set<Game> similarGames;
}
