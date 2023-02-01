package org.example.drive;

import org.example.File;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SSDDrive implements Drive {
    Map<String, File> files = new HashMap<>();

    @Override
    public void addFile(File file) {
        files.put(file.toString(), file);
    }

    @Override
    public void listFile() {
        Collection<File> fileCollection = files.values();
        fileCollection.stream().map(File::getName).forEach(System.out::println);
    }

    @Override
    public File findFile(String name) {

        return files.get(name);
    }
}
