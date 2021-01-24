package structural.facade.facadeExample1.medialibrary;

import structural.composite.compositeExample1.filesystem.File;

public class AudioMixer {
    public File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
