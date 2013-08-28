package com.joon.cms.blog.comment;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: bugi9300
 * Date: 13. 4. 24.
 * Time: 오후 8:02
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( nullable = false)
    private Long id;

    @Column
    private String contents;

    @Column
    private String author;
}
