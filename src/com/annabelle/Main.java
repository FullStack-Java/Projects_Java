package com.annabelle;

import java.util.ArrayList;

public class Main {
    /**
     * https://www.youtube.com/watch?v=49eeLxc6xE4&list=PLH4J8-mrXarEW2LuvRX_rOrVFnWdZA8NB&index=12
     * 23:45
     */
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Album_1", "Kirk Franklin");

        album.addSong("Jesus", 5.0);
        album.addSong("Run", 4.5);
        album.addSong("JJ", 4.0);
        album.addSong("Saviour", 5.0);
        album.addSong("You Know", 3.0);

        album = new Album("Album_2", "Joy");
        album.addSong("Work", 8.0);
        album.addSong("WWW", 5.5);
        album.addSong("Grill", 4.6);
        album.addSong("Heey Girl", 2.0);


    }
}
