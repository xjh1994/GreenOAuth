package com.zts1993.Bean;

/**
 * Created by TianShuo on 14-5-23.
 */
public class GreenOptions {
    private long optionId;
    private String optionName;
    private String optionValue;
    private String autoload;

    public long getOptionId() {
        return optionId;
    }

    public GreenOptions(long optionId, String optionName, String optionValue, String autoload) {
        this.optionId = optionId;
        this.optionName = optionName;
        this.optionValue = optionValue;
        this.autoload = autoload;
    }

    public GreenOptions() {

    }

    public void setOptionId(long optionId) {
        this.optionId = optionId;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    public String getAutoload() {
        return autoload;
    }

    public void setAutoload(String autoload) {
        this.autoload = autoload;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GreenOptions that = (GreenOptions) o;

        if (optionId != that.optionId) return false;
        if (autoload != null ? !autoload.equals(that.autoload) : that.autoload != null) return false;
        if (optionName != null ? !optionName.equals(that.optionName) : that.optionName != null) return false;
        if (optionValue != null ? !optionValue.equals(that.optionValue) : that.optionValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (optionId ^ (optionId >>> 32));
        result = 31 * result + (optionName != null ? optionName.hashCode() : 0);
        result = 31 * result + (optionValue != null ? optionValue.hashCode() : 0);
        result = 31 * result + (autoload != null ? autoload.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "optionId:" + optionId + " optionName:" + optionName + " optionValue:" + optionValue + " autoload:" + autoload;
    }
}
