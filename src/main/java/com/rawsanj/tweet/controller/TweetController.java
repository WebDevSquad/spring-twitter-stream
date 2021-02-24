package com.rawsanj.tweet.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.social.config.annotation.EnableSocial;
import org.springframework.social.twitter.api.SearchResults;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class TweetController {
    @RequestMapping("/test3")
    public String hello(Model model){
        model.addAttribute("message", "hello from the controller !!!");
        return "resultPage";
    }

    private Twitter twitterImpl;

    @RequestMapping("/twitter")
    public String helloTwitter(@RequestParam(defaultValue = "ETF") String search, Model model){
        SearchResults searchResults = twitterImpl.searchOperations().search(search);
        System.out.println("searchResults = " + searchResults);
        //String text = searchResults.getTweets().get(0).getText();
        //System.out.println("text = " + text);
        return "resultPage";
    }
}
