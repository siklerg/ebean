import com.avaje.ebean.Ebean;
import com.avaje.ebean.annotation.Sql;
import hu.zerotohero.ebean.dao.CountryDao;
import hu.zerotohero.ebean.dao.EmployeeDao;
import hu.zerotohero.ebean.entities.*;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void testEmployee() {
        EmployeeDao employeeDao = new EmployeeDao();
        CountryDao countryDao = new CountryDao();

        Region eu = new Region();
        eu.setRegionName("Európa");

        Country hun = new Country();
        hun.setName("Magyarország");

        countryDao.saveCountryWithRegion(hun, eu);

        Location loc_pecs = new Location();
        loc_pecs.setCountry(hun);
        loc_pecs.setCity("Pécs");
        loc_pecs.setPostalCode("7623");
        loc_pecs.setStreetAddress("Ungvár utca 1.");

        Job job_ig = new Job();
        job_ig.setJobTitle("Igazgató");

        Department dep_ig = new Department();
        dep_ig.setDepartmentName("Igazgatóság");
        dep_ig.setLocation(loc_pecs);

        Employee employee1 = new Employee("Jakab","Gipsz","j@g.hu","123-456",dep_ig, job_ig);



        System.out.println("employee1 = " + employee1);

    }
}
