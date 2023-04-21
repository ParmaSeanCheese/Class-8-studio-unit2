package org.launchcode.skilltracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("")
public class SkillsController {

    @GetMapping
    public String loadPage(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the List!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String codeForm(){
        return "<html>" +
                "<body>" +
                "<h2>Please rank your preferred coding languages from those found below</h2>" +
                "<form action='/ranking' method='post'>" +
                "Name: " +
                "<input type='text' name='name'>" +
                "<br>" +
                "1st <select name=\"first\">\n" +
                "        <option value=\"\">First</option>\n" +
                "        <option value=\"java\">Java</option>\n" +
                "        <option value=\"javascript\">JavaScript</option>\n" +
                "        <option value=\"python\">Python</option>\n" +
                "    </select>\n" +
                "<br>" +
                "    2nd <select name=\"second\">\n" +
                "        <option value=\"\">Second</option>\n" +
                "        <option value=\"java\">Java</option>\n" +
                "        <option value=\"javascript\">JavaScript</option>\n" +
                "        <option value=\"python\">Python</option>\n" +
                "    </select>\n" +
                "<br>" +
                "    3rd <select name=\"third\">\n" +
                "        <option value=\"\">Third</option>\n" +
                "        <option value=\"java\">Java</option>\n" +
                "        <option value=\"javascript\">JavaScript</option>\n" +
                "        <option value=\"python\">Python</option>\n" +
                "    </select>\n" +
                "<br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "ranking")
    public String ranking(@RequestParam String first, @RequestParam String second, @RequestParam String third, @RequestParam String name){
        return "<html>\n" +
                "    <h1>"+ name +"</h1>\n" +
                "    <ol>\n" +
                "        <li>"+ first +"</li>\n" +
                "        <li>"+ second +"</li>\n" +
                "        <li>"+ third +"</li>\n" +
                "    </ol>\n" +
                "</html>";
    }

}
