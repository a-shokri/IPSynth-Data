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
public class IPSynthTest2 {

    public LoginContext initLC( String name ){
        {
        System.out.println("Test2");
        }
        //TODO: To be synthesized
        return null;
    }

    private boolean testMethod(){
        int testVar = 1;
        return false;
    }

    boolean globalVarBool;
    public static void main(String[] args)  throws LoginException{
        String moduleName = args[0];
        IPSynthTest2 jaasImplementor = new IPSynthTest2();
        LoginContext loginContext = jaasImplementor.initLC( moduleName );
        System.out.println("After creating LoginContext!");
        jaasImplementor.loginNSubject( loginContext );
    }











    public void loginNSubject(LoginContext loginContext){
        //TODO: To be synthesized
    }
  
}
