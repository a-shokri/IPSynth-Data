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
public class IPSynthTest16 {
    boolean globalVarBool;


    public void auth1( String name ){
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
        IPSynthTest16 jaasUser = new IPSynthTest16();
        jaasUser.auth1( "auth" );
    }

    private boolean testMethod(){
        int testVar = 1;
        return false;
    }

    protected void inspectSubject( LoginContext loginContext ){
        //TODO: To be synthesized
    }



    class InnerClass1{
        static int innerClassStaticField;
        public int innerClassPublicField;
        private int innerClassPrivateField;

        private boolean innerClass1TestMethod(){
            int testVar = 1;
            return false;
        }
    }

    class InnerClass2{
        static int innerClassStaticField;
        public int innerClassPublicField;
        private int innerClassPrivateField;

        private boolean innerClass1TestMethod(){
            int testVar = 1;
            return false;
        }
    }
}