package com.example.pod.Entity;

import javax.persistence.*;

@Entity
@Table( name = "episode")
public class Episode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "e_id")
    private int id;

    //<item>
    //  <enclosure  url = <url> />
    @Column (name = "url")
    private String url;

    //<item>
    //  <title> title </title>
    @Column (name = "title")
    private String title;

    //<item>
    //  <pubDate> pubDate </pubDate>
    @Column (name = "pubDate")
    private String pubDate;
}
