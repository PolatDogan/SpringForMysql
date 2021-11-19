package myProject.world.business.abstracts;

import java.util.List;

import myProject.world.core.utilities.results.DataResult;
import myProject.world.core.utilities.results.Result;
import myProject.world.entities.concretes.City;


public interface CityService {
	
	DataResult<List<City>> getAll();
	
	Result add(City city);

}
