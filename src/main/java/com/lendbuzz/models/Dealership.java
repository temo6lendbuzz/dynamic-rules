package com.lendbuzz.models;

public class Dealership {
    private String type;
    private String tier;
    private boolean isRecourse;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public boolean isRecourse() {
        return isRecourse;
    }

    public void setRecourse(boolean isRecourse) {
        this.isRecourse = isRecourse;
    }
}
