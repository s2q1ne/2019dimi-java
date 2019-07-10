package oop;

public class Player {
    public void play(){
        MediaPlayer mp = MediaPlayer.getInstance();
        mp.setVolume(mp.getVolume()+10);
    }
}
