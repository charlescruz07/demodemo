package com.cruz.sportify.model;

import java.util.ArrayList;

/**
 * Created by Basilan on 6/29/2017.
 */

public class SportsPreference {
    private ArrayList<String> sportsPref;

    public SportsPreference(ArrayList<String> sportsPref) {
        this.sportsPref = sportsPref;
    }

    public ArrayList<String> getSportsPref() {
        return sportsPref;
    }

    public void setSportsPref(ArrayList<String> sportsPref) {
        this.sportsPref = sportsPref;
    }
}
