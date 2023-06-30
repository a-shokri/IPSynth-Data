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
public class IPSynthTest10 {

    double d = 0.5;

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

        IPSynthTest10 jaasUser = new IPSynthTest10();
        jaasUser.performLoggingIn();
    }
    public void performLoggingIn(){
        performInnerLoggingIn();
    }
    public void performInner2LoggingIn(){
        String moduleName = getModuleName();
        LoginContext lc = initLC( moduleName );
        login( lc );
        inspectSubject( lc );
    }
    public void performInnerLoggingIn(){
        performInner2LoggingIn();
    }
    public static String getModuleName(){
        return "test10";
    }
}
