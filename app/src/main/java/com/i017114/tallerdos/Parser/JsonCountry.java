package com.i017114.tallerdos.Parser;

import com.i017114.tallerdos.Models.Country;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by reyes on 26/09/2017.
 */

public class JsonCountry {

    public static List<Country> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<Country> countryList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++){
            JSONObject itemdos = jsonArray.getJSONObject(i);
            Country country = new Country();
            country.setName(itemdos.getString("name"));
            country.setCapital(itemdos.getString("capital"));
            country.setAlphacode(itemdos.getString("alpha3Code"));
            country.setRegion(itemdos.getString("region"));
            country.setSubregion(itemdos.getString("subregion"));
            country.setPopulation(itemdos.getInt("population"));
            countryList.add(country);
        }
        return countryList;
    }

}
