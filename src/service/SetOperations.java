package service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import model.TouristPlace;

public class SetOperations{

	Set s=new HashSet<TouristPlace>();


	public Set add(TouristPlace places){
		s.add(places);
		return s;
	}


	public Set remove(TouristPlace places){
		s.remove(places);
		return s;
	}


	public Object sortByDestination(Set<TouristPlace> places) {

		ArrayList<TouristPlace> list=new ArrayList<TouristPlace>();

		list.sort((TouristPlace place1,TouristPlace place2)->place1.getDestination().compareTo(place2.getDestination()));

		return new LinkedHashSet<TouristPlace>(list);

		}


	public Object sortByRank(HashSet <TouristPlace>places) {

		ArrayList<TouristPlace> list=new ArrayList<TouristPlace>();

		list.sort((TouristPlace place1,TouristPlace place2)->place1.getRank().compareTo(place2.getRank()));

		return new LinkedHashSet<TouristPlace>(list);
	}



	public Object reset(HashSet <TouristPlace>places) {
		places.clear();
		return places;
	}
}