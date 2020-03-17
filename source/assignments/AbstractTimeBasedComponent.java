/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.cases.clock;

/**
 *
 * @author Alex Conro Manuel
 */
public abstract class AbstractTimeBasedComponent {

    protected Time time;

    public AbstractTimeBasedComponent() {
        this.time = new Time();
    }
//getter-setter methods

    public int getHour() {
        return this.time.getHour();
    }

    public void setHour(int _hour) {
        this.time.setHour(_hour);
    }

    public int getMinute() {
        return this.time.getMinute();
    }

    public void setMinute(int _minute) {
        this.time.setMinute(_minute);
    }

    public int getSecond() {
        return this.time.getSecond();
    }

    public void setSecond(int _second) {
        this.time.setSecond(_second);
    }

    @Override
    public String toString() {
        return (this.time.toString());
    }
}
