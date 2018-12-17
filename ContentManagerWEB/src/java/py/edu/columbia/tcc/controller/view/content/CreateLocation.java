package py.edu.columbia.tcc.controller.view.content;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.validation.ConstraintViolationException;
import org.primefaces.PrimeFaces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import py.edu.columbia.tcc.ejb.jpa.content.CityFacade;
import py.edu.columbia.tcc.ejb.jpa.content.CountryFacade;
import py.edu.columbia.tcc.ejb.jpa.content.LocationFacade;
import py.edu.columbia.tcc.exception.GDMEJBException;
import py.edu.columbia.tcc.model.contentHandler.City;
import py.edu.columbia.tcc.model.contentHandler.Country;
import py.edu.columbia.tcc.model.contentHandler.Location;

@ManagedBean
@ViewScoped
public class CreateLocation implements Serializable {
    private static final Logger log = LoggerFactory.getLogger(CreateLocation.class);
    @Inject
    private LocationFacade locationEJB;
    
    @Inject
    private CityFacade cityEJB;
    
    @Inject
    private CountryFacade countryEJB;
    
    private Location newLocation;
    private City selectedCity;
    private Country selectedCountry;
    private List<City> listCities;
    private List<Country> listcountries;

    public CreateLocation() {
    }

    @PostConstruct
    public void init() {
        loadCountry();
        loadCity();
        newLocation = new Location();
        selectedCountry = new Country();
        selectedCity = new City();
    }

    public Location getNewLocation() {
        return newLocation;
    }

    public void setNewLocation(Location newLocation) {
        this.newLocation = newLocation;
    }

    public City getSelectedCity() {
        return selectedCity;
    }

    public void setSelectedCity(City selectedCity) {
        this.selectedCity = selectedCity;
    }

    public Country getSelectedCountry() {
        return selectedCountry;
    }

    public void setSelectedCountry(Country selectedCountry) {
        this.selectedCountry = selectedCountry;
    }

    public List<City> getListCities() {
        return listCities;
    }

    public void setListCities(List<City> listCities) {
        this.listCities = listCities;
    }

    public List<Country> getListcountries() {
        return listcountries;
    }

    public void setListcountries(List<Country> listcountries) {
        this.listcountries = listcountries;
    }
    
    private void loadCity(){
        try {
            listCities = cityEJB.listCity(4);
        } catch (GDMEJBException ex) {
            java.util.logging.Logger.getLogger(CreateLocation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void loadCountry(){
        try {
            listcountries = countryEJB.listCountry();
        } catch (GDMEJBException ex) {
            java.util.logging.Logger.getLogger(CreateLocation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void createLocation(){
        try {
            newLocation.setIdCountry(selectedCountry);
            newLocation.setIdCity(selectedCity);
            System.out.println("location name: " +newLocation.getName());
            System.out.println("location country: " +newLocation.getIdCountry());
            System.out.println("location city: " +newLocation.getIdCity());
            locationEJB.create(newLocation);
            PrimeFaces.current().dialog().closeDynamic("createLocation");
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(CreateLocation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
