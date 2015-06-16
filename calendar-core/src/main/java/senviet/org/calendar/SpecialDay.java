package senviet.org.calendar;

/**
 * DES
 *
 * @author hung.vu
 * @since 6/16/2015.
 */
public class SpecialDay {
    private int dayEvent;
    private int monthEvent;
    private boolean isSolar;
    private String descriptionDay;
    private boolean isOffDay = true;
    private String[] backgroundImageUrls;

    public SpecialDay(int dayEvent, int monthEvent, boolean isSolar, String descriptionDay, boolean isOffDay, String[] backgroundImageUrls) {
        this.dayEvent = dayEvent;
        this.monthEvent = monthEvent;
        this.isSolar = isSolar;
        this.descriptionDay = descriptionDay;
        this.isOffDay = isOffDay;
        this.backgroundImageUrls = backgroundImageUrls;
    }

    public int getDayEvent() {
        return dayEvent;
    }

    public void setDayEvent(int dayEvent) {
        this.dayEvent = dayEvent;
    }

    public int getMonthEvent() {
        return monthEvent;
    }

    public void setMonthEvent(int monthEvent) {
        this.monthEvent = monthEvent;
    }

    public boolean isSolar() {
        return isSolar;
    }

    public void setIsSolar(boolean isSolar) {
        this.isSolar = isSolar;
    }

    public String getDescriptionDay() {
        return descriptionDay;
    }

    public void setDescriptionDay(String descriptionDay) {
        this.descriptionDay = descriptionDay;
    }

    public boolean isOffDay() {
        return isOffDay;
    }

    public void setIsOffDay(boolean isOffDay) {
        this.isOffDay = isOffDay;
    }

    public String[] getBackgroundImageUrls() {
        return backgroundImageUrls;
    }

    public void setBackgroundImageUrls(String[] backgroundImageUrls) {
        this.backgroundImageUrls = backgroundImageUrls;
    }
}
