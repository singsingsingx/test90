package cn.wzzcd6.blog.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import cn.wzzcd6.blog.entity.Blog;
import cn.wzzcd6.blog.mapper.BlogMapper;
import cn.wzzcd6.blog.service.BlogService;
import lombok.extern.java.Log;

@Service
@Primary
@Transactional
@Log
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> 	implements BlogService {

}
