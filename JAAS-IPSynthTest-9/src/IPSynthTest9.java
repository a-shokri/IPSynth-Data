import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;
import java.io.IOException;


// A test case for architectural tactic synthesis using JAAS framework
public class IPSynthTest9 {

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

        IPSynthTest9 jaasUser = new IPSynthTest9();
        jaasUser.performLoggingIn();
    }
    public void performLoggingIn(){
        performInnerLoggingIn();
    }
    public void performInnerLoggingIn(){
        String moduleName = getModuleName();
        LoginContext lc = initLC( moduleName );
        login( lc );
        inspectSubject( lc );
    }

    public static String getModuleName(){
        return "test1";
    }
}
