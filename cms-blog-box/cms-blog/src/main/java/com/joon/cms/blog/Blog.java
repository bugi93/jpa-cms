package com.joon.cms.blog;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: bugi9300
 * Date: 13. 4. 24.
 * Time: 오후 8:03
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( nullable = false)
    private Long id;

    @Column
    private String name;

    @Column
    private String title;

}
