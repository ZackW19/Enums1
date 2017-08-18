public enum Gender {
    MEN(false, true, false), WOMEN(true, false, true);

    private boolean hasLongHair;
    private boolean hasMustache;
    private boolean hasMakeup;

    Gender(boolean hasLongHair, boolean hasMustache, boolean hasMakeup) {
        this.hasLongHair = hasLongHair;
        this.hasMustache = hasMustache;
        this.hasMakeup = hasMakeup;
    }

    public boolean isHasLongHair() {
        return hasLongHair;
    }

    public void setHasLongHair(boolean hasLongHair) {
        this.hasLongHair = hasLongHair;
    }

    public boolean isHasMustache() {
        return hasMustache;
    }

    public void setHasMustache (boolean hasMustache) {
        this.hasMustache = hasMustache;
    }

    public boolean isHasMakeup() {
        return hasMakeup;
    }

    public void setHasMakeup(boolean hasMakeup) {
        this.hasMakeup = hasMakeup;
    }
}