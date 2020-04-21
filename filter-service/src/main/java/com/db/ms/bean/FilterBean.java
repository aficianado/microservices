package com.db.ms.bean;

public class FilterBean {

    private int maximum;
    private int minimum;
    private String env;

    protected FilterBean() {
    }

    public FilterBean(int maximum, int minimum, String env) {
        this.maximum = maximum;
        this.minimum = minimum;
        this.env = env;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }
}
