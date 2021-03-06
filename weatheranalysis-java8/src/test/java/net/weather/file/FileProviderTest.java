package net.weather.file;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class FileProviderTest {

    private static final String FILE_URL = "http://www.fifeweather.co.uk/cowdenbeath/200606.csv";
    private static final String FILE_PATH = "src/test/resources/weather.csv";

    private FileProvider fileProvider;

    @Before
    public void setUp() {
        fileProvider = new FileProvider();
    }

    @After
    public void removeFile() {
        new File(FILE_PATH).delete();
    }

    @Test
    public void can_download_file_and_store_to_disk() throws IOException {
        // Given
        assertThatFileDoesNotExist(FILE_PATH);

        // When
        File file = fileProvider.fromUrl(FILE_URL, FILE_PATH);

        // Then
        assertThatFileExists(FILE_PATH);
        assertThat(file, notNullValue());
        assertThat(file.getPath(), is(FILE_PATH));
    }


    // Test DSL

    private void assertThatFileExists(String path) {
        assertThat(fileExists(path), is(true));
    }

    private void assertThatFileDoesNotExist(String path) {
        assertThat(fileExists(path), is(false));
    }

    private boolean fileExists(String path) {
        return new File(path).exists();
    }

}
