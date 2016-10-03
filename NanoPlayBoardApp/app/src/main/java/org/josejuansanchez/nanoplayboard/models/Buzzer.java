package org.josejuansanchez.nanoplayboard.models;

/**
 * Created by josejuansanchez on 29/06/16.
 */
public class Buzzer {
    private int id;
    private int frequency;
    private int duration;

    public Buzzer(int frequency, int duration) {
        this.frequency = frequency;
        this.duration = duration;
    }

    public Buzzer(int id, int frequency, int duration) {
        this.id = id;
        this.frequency = frequency;
        this.duration = duration;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
