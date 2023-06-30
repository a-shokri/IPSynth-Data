import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;
import java.io.IOException;


// A test case for architectural tactic synthesis using JAAS framework
public class IPSynthTest4 {
    boolean globalVarBool;


    public void auth( String name ){
        System.out.println("authenticating...");
        loginAndSubject( initLC( name ) );
    }

    protected void loginAndSubject( LoginContext loginContext ){
        //TODO: To be synthesized
    }
    protected LoginContext initLC( String name ){
        //TODO: To be synthesized
        return null;
    }

    public static void main(String[] args) {
        IPSynthTest4 jaasUser = new IPSynthTest4();
        jaasUser.auth( "test1" );
    }

    private boolean testMethod(){
        int testVar = 1;
        return false;
    }



    class InnerClass{
        static int innerClassStaticField;
        public int innerClassPublicField;
        private int innerClassPrivateField;

    }
}