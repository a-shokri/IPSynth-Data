import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;
import java.io.IOException;

/**
 * @author anonym
 */
// A test case for architectural tactic synthesis using JAAS framework
public class IPSynthTest6 {
    String globalVarString;
    static String moduleName;

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
        moduleName = "test6";
        IPSynthTest6 jaasUser = new IPSynthTest6();
        jaasUser.performLoggingIn(moduleName);
    }

    public void performLoggingIn(String moduleName){
        LoginContext lc = initLC( moduleName );
        login( lc );
        inspectSubject( lc );
    }
}
