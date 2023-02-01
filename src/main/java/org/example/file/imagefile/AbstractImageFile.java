package org.example.file.imagefile;

import org.example.file.AbstractFile;
import org.example.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {


    protected AbstractImageFile(String name, int size) {
        super(name, size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
