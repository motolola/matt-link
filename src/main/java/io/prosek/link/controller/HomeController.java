package io.prosek.link.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 */
@Controller
public class HomeController
{
    @RequestMapping(value = { "/", "/home"})
    @ResponseBody
    public String index()
    {
        return "This is home!";
    }
}
