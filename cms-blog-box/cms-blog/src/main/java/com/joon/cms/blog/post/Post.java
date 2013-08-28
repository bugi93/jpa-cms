package com.joon.cms.blog.post;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: bugi9300
 * Date: 13. 4. 19.
 * Time: 오후 5:07
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( nullable = false)
    private Long id;

    @Column
    private String title;

    @Column
    private String contents;

    @Column
    private String author;
}
