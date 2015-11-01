package net.weather;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class FileProvider {

    public void fromUrl(String fileUrl, String path) throws IOException {
        FileUtils.copyURLToFile(new URL(fileUrl), new File(path));
    }
}
