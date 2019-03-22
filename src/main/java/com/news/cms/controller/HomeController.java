package com.news.cms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

import com.news.cms.model.News;

@Controller
public class HomeController {
	
	List<News> listNews = new ArrayList<News>();
	  
	  @PostConstruct
	    public void init() throws Exception {
		  listNews.add(new News(new Long(1), "News1", "Test"));
		  listNews.add(new News(new Long(2), "News2", "Test"));
		  listNews.add(new News(new Long(3), "News3", "Test"));
		  listNews.add(new News(new Long(4), "News4", "Test"));
		  listNews.add(new News(new Long(5), "News5", "Test"));
		  listNews.add(new News(new Long(6), "News6", "Test"));
	    }
	  
	
	@GetMapping("/news")
    public String index(Model model) {
		model.addAttribute("news",listNews);
		System.out.println(listNews);
		return "news";
    }
}
