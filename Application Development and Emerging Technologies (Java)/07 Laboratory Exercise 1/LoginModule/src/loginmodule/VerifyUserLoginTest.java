package loginmodule;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class VerifyUserLoginTest {
	
	@Test
	void testVerifyUserLoginCredentials() throws Exception {
		VerifyUserLogin verifyUser = new VerifyUserLogin();
		
		ArrayList<String> testCredentialsList = new ArrayList<String>();
        testCredentialsList.add("BrianSerrano,nairb");
        testCredentialsList.add("LeslieBarroga,eilsel");
        testCredentialsList.add("JoliArelSantos,lerailoj");
        testCredentialsList.add("CarloJaeAvila,eajolrac");        

        Field field = VerifyUserLogin.class.getDeclaredField("credentialsList");
        field.setAccessible(true);
        field.set(verifyUser, testCredentialsList);
        
        assertTrue(verifyUser.verifyUserLoginCredentials("BrianSerrano", "nairb"));
        assertTrue(verifyUser.verifyUserLoginCredentials("LeslieBarroga", "eilsel"));
        assertTrue(verifyUser.verifyUserLoginCredentials("JoliArelSantos", "lerailoj"));
        assertTrue(verifyUser.verifyUserLoginCredentials("CarloJaeAvila", "eajolrac"));
        assertFalse(verifyUser.verifyUserLoginCredentials("JohnMendi", "nhoj"));
        assertFalse(verifyUser.verifyUserLoginCredentials("NykoJonasZumel", "sanojokyn"));
        assertFalse(verifyUser.verifyUserLoginCredentials("JervisWayneBaltazar", "anyewsivrej"));
        assertFalse(verifyUser.verifyUserLoginCredentials("MarkLesterTagaca", "retselkram"));
        assertFalse(verifyUser.verifyUserLoginCredentials("PaoloCorpuz", "oloap"));
		
	}

}
