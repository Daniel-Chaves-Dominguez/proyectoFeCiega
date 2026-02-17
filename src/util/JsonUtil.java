package util;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class JsonUtil {
    public static void escribirJson(String path, String contenido) throws IOException {
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(contenido);
        }
    }

    public static String leerJson(String path) throws IOException {
        try (FileReader reader = new FileReader(path)) {
            StringBuilder sb = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) sb.append((char) c);
            return sb.toString();
        }
    }
}
