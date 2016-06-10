package writefile;

import exception.WrongDestinationException;

import java.io.*;

public class WriteFile {
    public void write(String path, String text, int size) throws IOException {
        int nameFile = 1;
        File file = new File(path + nameFile);
        if(file.isDirectory()){
            throw new WrongDestinationException("Can't write to "+ path);
        }

        while (file.length() >= size) {
            int nameLast = Integer.parseInt(file.getName())+1;
            file = new File(path + nameLast);
        }

        try (
                FileWriter fw = new FileWriter((file), true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
        ) {
            pw.append(text);
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
