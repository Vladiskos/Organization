package com.java.automation.lab.fall.cehanovich.core22.domain.classes.ciphers;

public class DES extends SymmetricCipher {
    private String[][] sTables;

    public DES(String text, String key) {
        super(text, key);
    }

    public String encrypt() {
        return ciphertext;
    }

    public String decrypt() {
        return text;
    }

    @Override
    public String toString() {
        return "DES {\nText: " + text + "\nCipher text: " + ciphertext + "\nKey: " +
                key + "\n}";
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
        DES other = (DES) that;
        return text.equals(other.text) && ciphertext.equals((other).ciphertext) && key.equals(other.key);
    }

    @Override
    public int hashCode() {
        return (text.hashCode() + ciphertext.hashCode()) / 2 + key.hashCode();
    }
}
