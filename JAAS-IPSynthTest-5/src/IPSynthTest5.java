import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;
import java.io.IOException;

/**
 * @author Ali Shokri (as8308@rit.edu)
 */
// A test case for architectural tactic synthesis using JAAS framework
public class IPSynthTest5 {
    boolean globalVarBool;
    static String moduleName;

    public void authenticate(){
        LoginContext lc = initLC( moduleName );
        login( lc );
        inspectSubject( lc );
    }

    public LoginContext initLC( String name ){
        //TODO: To be synthesized
        return null;
    }
    public void login( LoginContext lc ){
        //TODO: To be synthesized
    }
    public void inspectSubject( LoginContext lc ){
        //TODO: To be synthesized
    }

    public static void main(String[] args) {
        moduleName = "test1";
        IPSynthTest5 jaasUser = new IPSynthTest5();
        jaasUser.authenticate();
    }

}
