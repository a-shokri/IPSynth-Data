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
public class IPSynthTest3 {
    boolean globalVarBool;

    public LoginContext initLC( String name ){
        //TODO: To be synthesized
        return null;
    }

    public void loginAndInspectSubject( LoginContext loginContext ){
        //TODO: To be synthesized
    }

    private boolean testMethod(){
        int testVar = 1;
        return false;
    }

    public static void main(String[] args)  throws LoginException{
        String moduleName = args[0];
        IPSynthTest3 jaasImplementor = new IPSynthTest3();
        LoginContext loginContext = jaasImplementor.initLC( moduleName );
        jaasImplementor.loginAndInspectSubject( loginContext );
    }


}

class InnerClass{
    static int innerClassStaticField;
    public int innerClassPublicField;
    private int innerClassPrivateField;
  
}
