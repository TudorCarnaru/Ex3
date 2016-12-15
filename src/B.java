import javax.crypto.SecretKey;

/**
 * Created by tcarnaru on 12/15/2016.
 */
public class B {
    private SecretKey K3;
    private String iv="abcdefgh123456";
    private String encryptionMode = null;
    private String mode = null;


    public void setK3(SecretKey k3)
    {
        this.K3=k3;
    }

    public void setMode(String encryptionMode)
    {
        this.encryptionMode=encryptionMode;
    }
}
