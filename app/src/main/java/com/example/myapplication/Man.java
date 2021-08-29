package com.example.myapplication;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Man{
    Color[] palette;

    public Color[] getPalette() {
        return palette;
    }

    public void setPalette(Color[] palette) {
        this.palette = palette;
    }
}
