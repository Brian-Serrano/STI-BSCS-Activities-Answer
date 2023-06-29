package loginmodule;

import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.*;

public class SaveNewCredentialsToFile {
    private Path filePath = Paths.get("credentials.txt"); // get file from relative path
    private String delimiter = ",";
    private String userName, password;
    
    public boolean saveCredentials(String username, String password) {
        String credential = username + delimiter + password;
        try {
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(filePath, CREATE, APPEND));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            writer.write(credential);
            writer.newLine();
            writer.flush();
            writer.close();
            return true;
        } catch (IOException ex) {
            System.err.println("Exception message: " + ex);
            return false;
        }
    }
}
