package com.cruz.sportify.model;

import java.util.ArrayList;

/**
 * Created by Basilan on 6/29/2017.
 */

public class SportsPreference {
    private String prefSport;

    public SportsPreference(){

    }

    public SportsPreference(String prefSport) {
        this.prefSport = prefSport;
    }

    public String getPrefSport() {
        return prefSport;
    }

    public void setPrefSport(String prefSport) {
        this.prefSport = prefSport;
    }
}
