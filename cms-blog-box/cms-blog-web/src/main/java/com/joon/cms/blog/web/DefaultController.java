package com.joon.cms.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: bugi9300
 * Date: 13. 4. 11.
 * Time: 오후 6:59
 * To change this template use File | Settings | File Templates.
 */

@RequestMapping(value = "/test")
@Controller
public class DefaultController {

    @RequestMapping(method = RequestMethod.GET)
    public String prototype(ModelMap modelMap) {
        return "none:__prototype";
    }

}
