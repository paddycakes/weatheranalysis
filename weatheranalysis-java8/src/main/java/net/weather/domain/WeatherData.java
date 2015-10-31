package net.weather.domain;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import static com.google.common.base.Objects.equal;

/**
 * Immutable domain class encapsulating weather data metrics.
 */
public class WeatherData {

    private final double tempHumidityIndex;
    private final double outsideTemperature;
    private final double windChill;
    private final double hiTemperature;
    private final double lowTemperature;
    private final int outsideHumidity;
    private final double dewPoint;
    private final int windSpeed;
    private final int hi;
    private final WindDirection windDirection;
    private final int rain;
    private final double barometer;
    private final double insideTemperature;
    private final int insideHumidity;
    private final int archivePeriod;

    private String asString;
    private Integer hashCode;

    public WeatherData(double tempHumidityIndex, double outsideTemperature, double windChill,
                       double hiTemperature, double lowTemperature, int outsideHumidity,
                       double dewPoint, int windSpeed, int hi, WindDirection windDirection,
                       int rain, double barometer, double insideTemperature, int insideHumidity,
                       int archivePeriod) {
        this.tempHumidityIndex = tempHumidityIndex;
        this.outsideTemperature = outsideTemperature;
        this.windChill = windChill;
        this.hiTemperature = hiTemperature;
        this.lowTemperature = lowTemperature;
        this.outsideHumidity = outsideHumidity;
        this.dewPoint = dewPoint;
        this.windSpeed = windSpeed;
        this.hi = hi;
        this.windDirection = windDirection;
        this.rain = rain;
        this.barometer = barometer;
        this.insideTemperature = insideTemperature;
        this.insideHumidity = insideHumidity;
        this.archivePeriod = archivePeriod;
    }


    public double getTempHumidityIndex() {
        return tempHumidityIndex;
    }

    public double getOutsideTemperature() {
        return outsideTemperature;
    }

    public double getWindChill() {
        return windChill;
    }

    public double getHiTemperature() {
        return hiTemperature;
    }

    public double getLowTemperature() {
        return lowTemperature;
    }

    public int getOutsideHumidity() {
        return outsideHumidity;
    }

    public double getDewPoint() {
        return dewPoint;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public int getHi() {
        return hi;
    }

    public WindDirection getWindDirection() {
        return windDirection;
    }

    public int getRain() {
        return rain;
    }

    public double getBarometer() {
        return barometer;
    }

    public double getInsideTemperature() {
        return insideTemperature;
    }

    public int getInsideHumidity() {
        return insideHumidity;
    }

    public int getArchivePeriod() {
        return archivePeriod;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof WeatherData)) return false;
        WeatherData that = (WeatherData) obj;
        return equal(this.getTempHumidityIndex(), that.getTempHumidityIndex())
                && equal(this.getOutsideTemperature(), that.getOutsideTemperature())
                && equal(this.getWindChill(), that.getWindChill())
                && equal(this.getHiTemperature(), that.getHiTemperature())
                && equal(this.getLowTemperature(), that.getLowTemperature())
                && equal(this.getOutsideHumidity(), that.getOutsideHumidity())
                && equal(this.getDewPoint(), that.getDewPoint())
                && equal(this.getWindSpeed(), that.getWindSpeed())
                && equal(this.getHi(), that.getHi())
                && equal(this.getWindDirection(), that.getWindDirection())
                && equal(this.getRain(), that.getRain())
                && equal(this.getBarometer(), that.getBarometer())
                && equal(this.getInsideTemperature(), that.getInsideTemperature())
                && equal(this.getInsideHumidity(), that.getInsideHumidity())
                && equal(this.getArchivePeriod(), that.getArchivePeriod()
        );
    }

    @Override
    public int hashCode() {
        if (hashCode == null) {
            hashCode = Objects.hashCode(getTempHumidityIndex(),
                    getOutsideTemperature(), getWindChill(), getHiTemperature(),
                    getLowTemperature(), getOutsideHumidity(), getDewPoint(),
                    getWindSpeed(), getHi(), getWindDirection(), getRain(),
                    getBarometer(), getInsideTemperature(), getInsideHumidity(),
                    getArchivePeriod());
        }
        return hashCode;
    }

    @Override
    public String toString() {
        if (asString == null) {
            asString = MoreObjects.toStringHelper(getClass())
                    .add("tempHumidityIndex", getTempHumidityIndex())
                    .add("outsideTemperature", getOutsideTemperature())
                    .add("windChill", getWindChill())
                    .add("hiTemperature", getHiTemperature())
                    .add("lowTemperature", getLowTemperature())
                    .add("outsideHumidity", getOutsideHumidity())
                    .add("dewPoint", getDewPoint())
                    .add("windSpeed", getWindSpeed())
                    .add("hi", getHi())
                    .add("windDirection", getWindDirection())
                    .add("rain", getRain())
                    .add("barometer", getBarometer())
                    .add("insideTemperature", getInsideTemperature())
                    .add("insideHumidity", getInsideHumidity())
                    .add("archivePeriod", getArchivePeriod())
                    .toString();
        }
        return asString;
    }


}
