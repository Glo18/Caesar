package models;

public class Cipher {
    private String mStatement;
    private int mKey;

    public Cipher(String Statement, int Key) {
        mStatement = Statement;
        mKey = Key;
    }
    public String getStatement() {
        return mStatement;
    }
    public int getKey() {
        return mKey;
    }
    public String toEncrypt() {
        mStatement = "b";
        return mStatement;
    }
}
