package src.main.java.model.app;

import src.main.java.interfaces.MusicPlayer;

public class AppleMusic implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void stop() {
        System.out.println("Stopping");
    }

    @Override
    public void selectMusic(String name) {
        System.out.println("Selecting "+name);
    }
}
