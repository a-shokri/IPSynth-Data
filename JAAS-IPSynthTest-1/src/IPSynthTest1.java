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
public class IPSynthTest1 {
    String notInitializedString;
    public LoginContext initLC(String name)  throws LoginException{
        //TODO: To be synthesized
        return null;
    }

    public void login(LoginContext loginContext) throws LoginException{
        //TODO: To be synthesized
    }

    public void inspectSubject( LoginContext loginContext ){
       //TODO: To be synthesized
    }

    public static void main(String[] args)  throws LoginException{
        String moduleName = args[0];
        IPSynthTest1 jaasImplementor = new IPSynthTest1();
        LoginContext loginContext = jaasImplementor.initLC( moduleName );
        jaasImplementor.login(loginContext );
        jaasImplementor.inspectSubject( loginContext );
    }

}

