package cn.wzzcd6.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.wzzcd6.blog.entity.Blog;
import cn.wzzcd6.blog.service.BlogService;
import cn.wzzcd6.common.utils.Result;

@RestController
@RequestMapping("blog")
public class BlogController {
	
	@Autowired
	BlogService blogService;
	
	
	@GetMapping("test")
	public Result test() {
		List<Blog> list = blogService.list();
		return new Result(list);
	}

}
