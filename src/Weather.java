public enum Weather {
    SUNNYDAY("Słońce pieknie świeci, opalisz sie", false, true),
    RAINYDAY("Pada deszcz, weź parasol", true, false),
    CLOUDYDAY("Słońce za chmurą, nie opalisz sie", false, false);

    private String longDesc;
    private boolean isRaining;
    private boolean isSunshining;

    Weather(String longDesc, boolean isRaining, boolean isSunshining) {
        this.longDesc = longDesc;
        this.isRaining = isRaining;
        this.isSunshining = isSunshining;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    public boolean isRaining() {
        return isRaining;
    }

    public void setRaining(boolean raining) {
        isRaining = raining;
    }

    public boolean isSunshining() {
        return isSunshining;
    }

    public void setSunshining(boolean sunshining) {
        isSunshining = sunshining;
    }
}