package com.java.automation.lab.fall.cehanovich.core22.domain.classes.ciphers;

public class RSA extends AsymmetricCipher {
    private int p;
    private int q;

    public RSA() {
    }
    public RSA(String text, String publicKey, String privateKey, int p, int q) {
        super(text, publicKey, privateKey);
        int n = p * q ^ 13;
        this.publicKey += n;
        n = p * q;
        this.privateKey += n;
    }

    public String encrypt(String text) {
        return ciphertext;
    }

    public String decrypt() {
        return text;
    }


    @Override
    public String toString() {
        return "RSA {\nText: " + text + "\nCipher text: " + ciphertext + "\nPublic key: " + publicKey +
                "\nPrivate key: " + privateKey + "\nP: " + p + "\nQ: " + q + "\n}";
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
        RSA other = (RSA) that;
        return text.equals(other.text) && ciphertext.equals(other.ciphertext) && publicKey.equals(other.publicKey) &&
                privateKey.equals(other.privateKey) && p == other.p && q == other.q;
    }

    @Override
    public int hashCode() {
        return (text.hashCode() + ciphertext.hashCode() + publicKey.hashCode()) / 2 + privateKey.hashCode();
    }
}
