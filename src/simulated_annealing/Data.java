/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulated_annealing;

import java.util.ArrayList;

/**
 *
 * @author bastomy
 */
public class Data {

    public double x1;
    public double x2;
    int temperature;
    double e0;
    double eCurrent;
    double eNew;
    double deltaE;
    double p;
    double random;

    public double getRandom() {
        return random;
    }

    public void setRandom(double random) {
        this.random = random;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getDeltaE() {
        return deltaE;
    }

    public void setDeltaE(double deltaE) {
        this.deltaE = deltaE;
    }

    public double geteNew() {
        return eNew;
    }

    public void seteNew(double eNew) {
        this.eNew = eNew;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public double getE0() {
        return e0;
    }

    public void setE0(double e0) {
        this.e0 = e0;
    }

    public double geteCurrent() {
        return eCurrent;
    }

    public void seteCurrent(double eCurrent) {
        this.eCurrent = eCurrent;
    }
}
