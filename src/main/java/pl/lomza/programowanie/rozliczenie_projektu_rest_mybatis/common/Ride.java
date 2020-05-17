package pl.lomza.programowanie.rozliczenie_projektu_rest_mybatis.common;

import java.time.LocalDate;

public class Ride {
    private long id;
    private LocalDate rideDate;
    private int counterBefore;
    private int counterAfter;
    private int km;
    private String whence;
    private String where;
    private String rideKind;
    private double fuelCondition;
    private double fuelAdd;
    private double fuelAfter;
    private double fuel;
    private double price;
    private double currency;
    private double fuelNorm;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getRideDate() {
        return rideDate;
    }

    public void setRideDate(LocalDate rideDate) {
        this.rideDate = rideDate;
    }

    public int getCounterBefore() {
        return counterBefore;
    }

    public void setCounterBefore(int counterBefore) {
        this.counterBefore = counterBefore;
    }

    public int getCounterAfter() {
        return counterAfter;
    }

    public void setCounterAfter(int counterAfter) {
        this.counterAfter = counterAfter;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getWhence() {
        return whence;
    }

    public void setWhence(String whence) {
        this.whence = whence;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getRideKind() {
        return rideKind;
    }

    public void setRideKind(String rideKind) {
        this.rideKind = rideKind;
    }

    public double getFuelCondition() {
        return fuelCondition;
    }

    public void setFuelCondition(double fuelCondition) {
        this.fuelCondition = fuelCondition;
    }

    public double getFuelAdd() {
        return fuelAdd;
    }

    public void setFuelAdd(double fuelAdd) {
        this.fuelAdd = fuelAdd;
    }

    public double getFuelAfter() {
        return fuelAfter;
    }

    public void setFuelAfter(double fuelAfter) {
        this.fuelAfter = fuelAfter;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCurrency() {
        return currency;
    }

    public void setCurrency(double currency) {
        this.currency = currency;
    }

    public double getFuelNorm() {
        return fuelNorm;
    }

    public void setFuelNorm(double fuelNorm) {
        this.fuelNorm = fuelNorm;
    }
}
