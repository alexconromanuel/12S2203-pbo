package oop.cases.clock;

/**
 *
 * @author Alex Conro Manuel
 */
public class Alarm extends AbstractTimeBasedComponent {

    public static final int RING_SHORT = 2;
    public static final int RING_LONG = 5;
    public static final int SNOOZE_SHORT = 5;
    public static final int SNOOZE_LONG = 10;
    public static final int MAX_SNOOZED = 2;
    private Time endTime;
    private int ringPeriod;
    private int snoozePeriod;
    private int snoozed;
    private boolean active;
    private boolean vibrating;

    public Alarm() {
        super();
        this.endTime = new Time();
        this.ringPeriod = RING_SHORT;
        this.snoozePeriod = SNOOZE_SHORT;
        this.snoozed = 0;
        this.active = false;
        this.vibrating = false;
    }

    protected void setEndTime(Time _initialTime, int _additionalMinute) {
        this.endTime = new Time();
        this.endTime.setSecond(_initialTime.getSecond());
        this.endTime.setMinute(_initialTime.getMinute());
        this.endTime.setHour(_initialTime.getHour());
        this.endTime.addMinute(_additionalMinute);
    }

    protected void setEndTime(Time _initialTime) {
        this.setEndTime(_initialTime, this.ringPeriod);
    }

    protected void setEndTime() {
        this.setEndTime(this.time);
    }

    public void setRingingPeriod(int _ringingPeriod) {
        switch (_ringingPeriod) {
            case RING_SHORT:
                this.ringPeriod = RING_SHORT;
                break;
            case RING_LONG:
                this.ringPeriod = RING_LONG;
                break;
        }
    }

    public void setSnoozePeriod(int _snoozePeriod) {
        switch (_snoozePeriod) {
            case SNOOZE_SHORT:
                this.snoozePeriod = SNOOZE_SHORT;
                break;
            case SNOOZE_LONG:
                this.snoozePeriod = SNOOZE_LONG;
                break;
        }
    }

    public boolean isActive() {
        return this.active;
    }

    public boolean snooze() {
        if (this.snoozed >= MAX_SNOOZED) {
            this.snoozed++;
            this.setEndTime(this.time, this.snoozePeriod);
            return true;
        }
        return false;
    }

    public void activate() {
        this.active = true;
        this.setEndTime();
    }

    public void deactivate() {
        this.active = false;
    }

    public void turnOnVibration() {
        this.vibrating = true;
    }

    public void turnOffVibration() {
        this.vibrating = false;
    }

    protected void ring() {
        if (this.active) {
            System.out.println("ringing!");
        }
        this.vibrate();
    }

    protected void vibrate() {
        if (this.active && this.vibrating) {
            System.out.println("vibrating!");
        }
    }

    public boolean attempt(Time _time) {
        if (this.time.toSecond() <= _time.toSecond()
                && _time.toSecond() <= this.endTime.toSecond()) {
            this.ring();
            return true;
        }
        return false;
    }

    protected void stopRinging() {
        this.deactivate();
    }
}
