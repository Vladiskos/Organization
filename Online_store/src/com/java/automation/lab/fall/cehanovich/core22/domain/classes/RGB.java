package com.java.automation.lab.fall.cehanovich.core22.domain.classes;

public class RGB {
    private int red;
    private int green;
    private int blue;

    public RGB(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }


    @Override
    public String toString() {
        return "RGB {\nRed: " + red + "Green: " + green + "Blue: " + blue + "%\n}";
    }

    @Override
    public boolean equals(Object that) {
        if (that == null) {
            return false;
        }
        if (this.getClass() != that.getClass()) {
            return false;
        }
        if (this == that) {
            return true;
        }
        RGB other = (RGB) that;
        return red == other.red && green == other.green && blue == other.blue;
    }

    @Override
    public int hashCode() {
        return blue * 13 + blue + 3 + red * 7;
    }
}
