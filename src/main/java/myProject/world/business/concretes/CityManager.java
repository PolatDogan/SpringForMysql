package myProject.world.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myProject.world.business.abstracts.CityService;
import myProject.world.core.utilities.results.DataResult;
import myProject.world.core.utilities.results.Result;
import myProject.world.core.utilities.results.SuccessDataResult;
import myProject.world.core.utilities.results.SuccessResult;
import myProject.world.dataAccess.abstracts.CityDao;
import myProject.world.entities.concretes.City;

@Service
public class CityManager implements CityService {

	private CityDao cityDao;
	
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>(this.cityDao.findAll(),"Data has listed");
	}

	@Override
	public Result add(City city) {
		this.cityDao.save(city);
		return new SuccessResult("City added.");
	}

}
