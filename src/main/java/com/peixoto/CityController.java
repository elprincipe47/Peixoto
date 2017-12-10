package com.peixoto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by elhassane on 10/12/2017.
 */
@Controller
@RestController
public class CityController  {

    @Autowired
    private CityRestRepository cityrepo ;
   ///this method for adding a new city
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public  void addCity(@RequestParam String name ,@RequestParam Long population){
      City  city = new City();
      city.setCityName(name);
      city.setPopulation(population);
      cityrepo.save(city);

    }
    //this method return all the citites 
    @GetMapping(path = "/all")
    public List<City> allCities()
    {
        return cityrepo.findAll();
    }
   
    //this method return top three citites by popluation descending
    @GetMapping(path = "/top")
    public List<City> topThreCities()
    {
        return cityrepo.findTop3ByOrderByPopulationDesc();
    }



}
