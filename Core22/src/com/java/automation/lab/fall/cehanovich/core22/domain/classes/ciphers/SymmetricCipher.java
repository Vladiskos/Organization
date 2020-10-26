package com.java.automation.lab.fall.cehanovich.core22.domain.classes.ciphers;

public abstract class SymmetricCipher extends Cipher {
    protected String key;

    public SymmetricCipher() {

    }

    public SymmetricCipher(String text, String key) {
        super(text);
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }


    @Override
    public String toString() {
        return "Symmetric cipher {\nText: " + text + "\nCipher text: " + ciphertext + "\nKey: " +
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
        SymmetricCipher other = (SymmetricCipher) that;
        return text.equals(other.text) && ciphertext.equals(other.ciphertext) && key == other.key;
    }

    @Override
    public int hashCode() {
        return (text.hashCode() + ciphertext.hashCode() * 13) / 2 + key.hashCode();
    }
}
