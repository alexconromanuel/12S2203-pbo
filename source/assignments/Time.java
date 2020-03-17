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
public class Time {

    // class attributes
    static private final int MAX_HOUR = 24;
    static private final int MAX_MINUTE = 60;
    static private final int MAX_SECOND = 60;

    // instance attributes
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    // getter-setter methods
    public int getHour() {
        return hour;
    }

    public void setHour(int _hour) {
        if (_hour >= 0 && _hour < MAX_HOUR) {
            hour = _hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int _minute) {
        if (_minute >= 0 && _minute < MAX_MINUTE) {
            minute = _minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int _second) {
        if (_second >= 0 && _second < MAX_SECOND) {
            second = _second;
        }
    }

    public void addHour(int _hour) {
        this.hour += _hour;
        this.hour %= MAX_HOUR;
    }

    public void addMinute(int _minute) {
        this.minute += _minute;
        if (this.minute >= MAX_MINUTE) {
            int extraHour = this.minute / MAX_MINUTE;
            this.addHour(extraHour);
        }
        this.minute %= MAX_MINUTE;
    }

    public void addSecond(int _second) {
        this.second += _second;
        if (this.second >= MAX_SECOND) {
            int extraMinute = this.second / MAX_SECOND;
            this.addMinute(extraMinute);
        }
        this.second %= MAX_SECOND;
    }

    public int toSecond() {
        int second = this.second;
        second += (this.minute * MAX_SECOND);
        second += (this.hour * MAX_MINUTE * MAX_SECOND);

        return (second);
    }

    @Override
    public String toString() {
        return (String.format("%02d", this.hour) + ":" + String.format("%02d",
                this.minute) + ":"
                + String.format("%02d", this.second));
    }
}
