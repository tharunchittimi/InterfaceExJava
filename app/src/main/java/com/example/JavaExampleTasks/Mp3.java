package com.example.JavaExampleTasks;

class MediaPlayer {
    void start() {
        System.out.println("Media Player Started");
    }

    void stop() {
        System.out.println("Media Player Stopped");
    }

    void pause() {
        System.out.println("Media Player Paused");
    }

    void resume() {
        System.out.println("Media Player Resumed");
    }

    public static void main(String args[]) {
        Mp3 mp3 = new Mp3("Laila O Laila");
        Mp4 mp4 = new Mp4("Rooba Rooba");
        mp3.start();
        mp3.pause();
        mp3.resume();
        mp3.stop();
        mp3.player();
        mp3.MxPlayer();
        mp3.display();
        mp4.disp();
        mp4.start();
        mp4.pause();
        mp4.resume();
        mp4.stop();
    }
}

class Mp3 extends MediaPlayer implements DvdPlayer {

    String songName;

     Mp3(String songName) {
        this.songName = songName;
    }

    void display() {
        System.out.println(songName);
    }

    @Override
    void start() {

        System.out.println("Mp3 Audio is Started");
    }

    @Override
    void pause() {
        System.out.println("Mp3 Audio is Paused");
    }

    @Override
    void resume() {
        System.out.println("Mp3 Audio is Resumed");
    }
    @Override
    void stop() {
        System.out.println("Mp3 Audio is Stopped");
    }

    @Override
    public void player() {
        System.out.println("Im a Dvd Player");
    }

    @Override
    public void MxPlayer() {
        System.out.println("Im a MXPlayer");
    }


}

class Mp4 extends MediaPlayer {

    String videoName;

    Mp4(String videoName) {
        this.videoName = videoName;
    }

    void disp() {
        System.out.println(videoName);
    }

    @Override
    void start() {
        System.out.println("Mp4 Video is Started");
    }

    @Override
    void stop() {
        System.out.println("Mp4 Video is Stopped");
    }

    @Override
    void pause() {
        System.out.println("Mp4 Video is Paused");
    }

    @Override
    void resume() {
        System.out.println("Mp4 Video is Resumed");
    }
}

interface DvdPlayer {
   void player();
   void MxPlayer();
}
