package com.test;
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
public class IPSynthTest195 {

    private boolean m1(){
        int testVar = 1;
        return false;
    }

    private boolean m2(){
        int testVar = 1;
        return false;
    }

    private boolean m3(){
        int testVar = 1;
        return false;
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
}