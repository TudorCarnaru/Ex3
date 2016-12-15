import javax.crypto.SecretKey;

/**
 * Created by tcarnaru on 12/15/2016.
 */
public class A {
    private SecretKey K3;
    private String iv="abcdefgh123456";
    private String encryptionMode = null;
    private String K=null;

    public A(String encryptionMode)
    {
        this.encryptionMode=encryptionMode;
    }

    public void setK3(SecretKey k3)
    {
        this.K3=k3;
    }

    public void sendMessage(B nodeB, String message, String mode)
    {
        nodeB.setMode(mode);
    }
}
