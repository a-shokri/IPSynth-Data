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
public class IPSynthTest13 {
    boolean globalVarBool;


    public void a1( String name ){
        System.out.println("Going to perform logging in...");
        login( initLC( name ) );
    }

    protected void login( LoginContext loginContext ){
        //TODO: To be synthesized
    }
    protected LoginContext initLC( String name ){
        //TODO: To be synthesized
        return null;
    }

    public static void main(String[] args) {
        IPSynthTest13 jaasUser = new IPSynthTest13();
        jaasUser.a1( "authentication" );
    }

    private boolean testMethod(){
        int testVar = 1;
        return false;
    }

    protected void inspectSubject( LoginContext loginContext ){
        //TODO: To be synthesized
    }



    class InnerClass{
        static int innerClassStaticField;
        public int innerClassPublicField;
        private int innerClassPrivateField;

    }
}
