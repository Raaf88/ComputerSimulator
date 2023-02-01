package org.example.file.musicfile;

import org.example.file.AbstractFile;
import org.example.file.FileType;

public abstract class AbstactMusicFile extends AbstractFile implements MusicFile {
    protected final String bandName;
    protected final String title;

    protected AbstactMusicFile(String name, int size, String bandName, String title) {
        super(name, size);
        this.bandName = bandName;
        this.title = title;
    }

    @Override
    public FileType getType() {
        return FileType.MUSIC;
    }

}
