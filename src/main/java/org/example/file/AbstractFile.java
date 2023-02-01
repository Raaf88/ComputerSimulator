package org.example.file;

public abstract class AbstractFile implements File {
    protected String name;
    protected int size;

    protected AbstractFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public FileType getType() {
        return null;
    }
}
