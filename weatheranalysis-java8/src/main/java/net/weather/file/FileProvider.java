package net.weather.file;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class FileProvider {

    public File fromUrl(String fileUrl, String path) throws IOException {
        File file = new File(path);
        FileUtils.copyURLToFile(new URL(fileUrl), file);
        return file;
    }
}
