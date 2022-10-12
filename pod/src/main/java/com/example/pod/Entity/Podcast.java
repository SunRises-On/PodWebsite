package com.example.pod.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "podcast")
public class Podcast implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "p_id")
    private int id;

    //<channel>
    //  <title> tittle </title>
    @Column(name = "title")
    private String title;

    //<channel>
    //  <description> description </description>
    @Column(name = "description")
    private String description;

    //<channel>
    //  <atom:link href= rss_news_feed rel="self"
    //             type="application/atom+xml" />
    @Column(name = "rss_news_feed")
    private String rss;


}
