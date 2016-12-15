import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by tcarnaru on 12/15/2016.
 */
public class KM {
    private SecretKey K1;
    private SecretKey K2;
    private SecretKey K3;
    private String encryptionMode = null;

    public KM(){
        KeyGenerator KeyGen = null;
        try {
            KeyGen = KeyGenerator.getInstance("AES");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        KeyGen.init(128);
        this.K1 = KeyGen.generateKey();
        this.K2 = KeyGen.generateKey();

    }

    public void setMode(String encryptionMode)
    {
        this.encryptionMode=encryptionMode;
    }

    public void setK3(SecretKey k3)
    {
        this.K3=k3;
    }

    public byte[] getKey(){
        if (encryptionMode.equals("ECB")) {
            return encryptAES(K1.getEncoded());
        }
        else {
            return encryptAES(K2.getEncoded());
        }
    }

    public  byte[] encryptAES(byte[] encodedKey){
        try {
            Cipher AesCipher = Cipher.getInstance("AES");
            AesCipher.init(Cipher.ENCRYPT_MODE, K3);
            return AesCipher.doFinal(encodedKey);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | BadPaddingException | InvalidKeyException | IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        return null;

    }
}
