package hu.zerotohero.ebean.dao;

import hu.zerotohero.ebean.entities.Country;
import hu.zerotohero.ebean.entities.Region;

import com.avaje.ebean.Ebean;

/**
 * 
 * @author Attila Budai <attila.budai@zerotohero.hu>
 * 
 */
public class CountryDao {

	public void saveCountryWithRegion(Country country, Region region) {
		Ebean.save(region);
		country.setRegion(region);
		Ebean.save(country);
	}

	public void saveCountry(Country country) {
		Ebean.save(country);
	}

	public void deleteCountry(Country country) {
		Ebean.delete(country);
	}

}
