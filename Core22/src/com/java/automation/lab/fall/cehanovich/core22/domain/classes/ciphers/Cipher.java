package com.java.automation.lab.fall.cehanovich.core22.domain.classes.ciphers;

public abstract class Cipher {
    protected String text;
    protected String ciphertext;

    public Cipher() {

    }

    public Cipher(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCiphertext() {
        return ciphertext;
    }

    public void setCiphertext(String ciphertext) {
        this.ciphertext = ciphertext;
    }


    @Override
    public String toString() {
        return "Cipher {\nText: " + text + "\nCipher text: " + ciphertext + "\n";
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
        Cipher other = (Cipher) that;
        return text.equals(other.text) && ciphertext.equals(other.ciphertext);
    }

    @Override
    public int hashCode() {
        return (text.hashCode() + ciphertext.hashCode());
    }
}
