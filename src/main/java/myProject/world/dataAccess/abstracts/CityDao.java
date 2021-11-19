package myProject.world.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import myProject.world.entities.concretes.City;

public interface CityDao  extends JpaRepository<City, Integer>{

}
