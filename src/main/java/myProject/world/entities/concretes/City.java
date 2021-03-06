package myProject.world.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="city")
@AllArgsConstructor
@NoArgsConstructor
public class City {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "id")
		private int id;
		
		@Column(name = "name")
	    private String name;
		
		@Column(name = "countryCode")
	    private String countryCode;
		
		@Column(name = "district")
	    private String district;
		
		@Column(name = "population")
	    private int population;
		
	

}
