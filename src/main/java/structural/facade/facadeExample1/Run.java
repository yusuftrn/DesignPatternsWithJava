package structural.facade.facadeExample1;

import structural.composite.compositeExample1.filesystem.File;
import structural.facade.facadeExample1.facade.VideoConversionFacade;

public class Run {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
/*
VideoConversionFacade: conversion started
CodecFactory: extracting ogg audio...
BitrateReader: reading file...
BitrateReader: writing file...
AudioMixer: fixing audio...
VideoConversionFacade: conversion completed.
 */