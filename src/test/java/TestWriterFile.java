import org.junit.Test;
import writefile.WriteFile;

import java.io.IOException;

/**
 * Created by Artem on 02.06.2016.
 */
public class TestWriterFile {

    @Test
    public void testWriteFile() throws IOException {
        WriteFile writeFile = new WriteFile();
        String s = "sdsdsdsdwwwwwwwwwwwwwwwwwwiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiwwwwwwwwwwwwwwwwwwwwwqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqsdsd";
        writeFile.write("src/main/resources/", s, 11);
    }

}
