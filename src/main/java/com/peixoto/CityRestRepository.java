package com.peixoto;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

/**
 * Created by elhassane on 10/12/2017.
 */
public interface CityRestRepository  extends JpaRepository<City,String>{
   
    public ArrayList<City> findTop3ByOrderByPopulationDesc();

}
