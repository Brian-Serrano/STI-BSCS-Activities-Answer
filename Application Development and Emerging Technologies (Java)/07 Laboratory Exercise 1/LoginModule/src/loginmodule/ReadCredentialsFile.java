package loginmodule;

import java.util.*;
import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;

public class ReadCredentialsFile {
    private final Path filePath = Paths.get("credentials.txt"); // get file from relative path
    private FileInputStream input = null;
    private BufferedReader reader;
    private String credentials;
    private final ArrayList<String> credentialsList = new ArrayList<String>();
    
    public ArrayList<String> getCredentialsList() {
        try {
            input = new FileInputStream(filePath.toString());
            reader = new BufferedReader(new InputStreamReader(input));
            while((credentials = reader.readLine()) != null) {
                credentialsList.add(credentials); //insert the credentials from file to array list
            }
        } catch (IOException ex) {
            System.err.println("Exception message: " + ex);
        }
        return credentialsList;
    }
}
