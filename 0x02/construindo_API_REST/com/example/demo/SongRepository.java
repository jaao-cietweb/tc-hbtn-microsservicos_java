package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongRepository {
    private List<Song> list = new ArrayList<Song>();

    public List<Song> getAllSongs() {
        return list;
    }

    public Song getSongById(Integer id) {
        return list.stream().filter(l -> l.getId() == id).findFirst().orElse(null);
    }

    public void addSong(Song s) {
        list.add(s);
    }

    public void updateSong(Song s) {
        list.stream().filter(l -> l.getId() == s.getId())
                .findAny()
                .ifPresent(song -> song = s);
    }

    public void removeSong(Song s) {
        list.remove(s);
    }
}
