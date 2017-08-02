package curso;

import java.io.File;

/**
 * Created by x001 on 12/12/16.
 */
public class Directories {

        public static void main(String args[]) {
            String dirname = "/tmp/user/java/bin";
            File d = new File(dirname);

            // Cria directorio agora.
            d.mkdirs();

        }
    }

