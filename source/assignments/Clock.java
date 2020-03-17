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
public class Clock extends AbstractTimeBasedComponent {

    public Clock() {
        super();
    }

    public void tickHour() {
        this.time.addHour(1);
    }

    public void tickMinute() {
        this.time.addMinute(1);
    }

    public void tickSecond() {
        this.time.addSecond(1);
    }
}
