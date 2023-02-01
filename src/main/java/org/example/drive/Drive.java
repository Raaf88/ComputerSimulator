package org.example.drive;

import org.example.file.File;

public interface Drive {

    void addFile(File file);

    void listFile();

    File findFile(String name);

}
