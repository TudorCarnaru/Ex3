import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

/**
 * Created by tcarnaru on 12/15/2016.
 */
public class Main {
    public static void main(String[] args)
    {
        KeyGenerator KeyGen = null;
        try {
            KeyGen = KeyGenerator.getInstance("AES");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        KeyGen.init(128);

        SecretKey SK3 = KeyGen.generateKey();
        KM keyManager = new KM();
        keyManager.setK3(SK3);
        String mode = "ECB";
        A nodeA = new A(mode);
        keyManager.setMode(mode);
    }
}
