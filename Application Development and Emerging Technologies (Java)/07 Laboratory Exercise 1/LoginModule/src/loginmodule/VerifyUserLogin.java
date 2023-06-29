package loginmodule;

import java.util.*;

public class VerifyUserLogin {
    private ArrayList<String> credentialsList;
    
    public VerifyUserLogin() {
        ReadCredentialsFile reader = new ReadCredentialsFile();
        credentialsList = new ArrayList<String>(reader.getCredentialsList());
    }
    
    public boolean verifyUserLoginCredentials(String inputUserName, String inputPassword){
        for(int i = 0; i < credentialsList.size(); i++) {
            String[] credentials = credentialsList.get(i).split(",");
            if(inputUserName.equals(credentials[0]) && inputPassword.equals(credentials[1])) {
                return true;
            }
        }
        return false;
    }
}
