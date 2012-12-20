package com.happyfuncode.giantbomb.model.game;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.happyfuncode.giantbomb.model.CommonResource;
import com.happyfuncode.giantbomb.model.franchise.Franchise;
import com.happyfuncode.giantbomb.model.genre.Genre;

public class Game extends CommonResource {
	private List<String> aliases;
	private Set<Character> characters;
	private Set<Franchise> franchises;
	private Set<Genre> genres;
}
