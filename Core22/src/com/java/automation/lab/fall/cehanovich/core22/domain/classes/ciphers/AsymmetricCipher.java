package com.java.automation.lab.fall.cehanovich.core22.domain.classes.ciphers;

public abstract class AsymmetricCipher extends Cipher {
    protected String publicKey;
    protected String privateKey;

    public AsymmetricCipher() {

    }

    public AsymmetricCipher(String text, String publicKey, String privateKey) {
        super(text);
        this.publicKey = publicKey;
        this.privateKey = privateKey;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }


    @Override
    public String toString() {
        return "AsymmetricCipher {\nText: " + text + "\nCipher text: " + ciphertext + "\nPublic key: " +
                publicKey + "\nPrivate key: " + privateKey + "\n}";
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
        AsymmetricCipher other = (AsymmetricCipher) that;
        return text.equals(other.text) && ciphertext.equals(other.ciphertext) && publicKey.equals(other.publicKey) &&
                privateKey.equals(other.privateKey);
    }

    @Override
    public int hashCode() {
        return (ciphertext.hashCode() + text.hashCode() + publicKey.hashCode() + privateKey.hashCode()) / 2;
    }

}
