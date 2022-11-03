package model;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Login {
    private static final char[] HEXADECIMAL = "0123456789ABCDEF".toCharArray();

    public static String convertirBytes(byte[] bytes) {
        char[] hexadecimal = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexadecimal[j * 2] = HEXADECIMAL[v >>> 4];
            hexadecimal[j * 2 + 1] = HEXADECIMAL[v & 0x0F];
        }
        return new String(hexadecimal);
    }

    private static String generarHash(String datos, String algoritmo) throws NoSuchAlgorithmException {
        MessageDigest digest;
        digest = MessageDigest.getInstance(algoritmo);
        digest.reset();
        byte[] hash = digest.digest(datos.getBytes());
        return convertirBytes(hash);
    }
}
