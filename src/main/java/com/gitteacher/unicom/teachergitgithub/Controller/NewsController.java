package com.gitteacher.unicom.teachergitgithub.Controller;

import com.gitteacher.unicom.teachergitgithub.entity.News;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:NewsController
 * @Author:songyan
 * @DATE:2019-05-31 09:04
 * @Description: TODO
 */
@RestController
@RequestMapping(value="name")
public class NewsController {

@RequestMapping(value="getAll")
    public List<News> getAll(){
        //List返回的是泛型


    News news1=new News(1,"aaa","aaaaaa");
    News news2=new News(1,"bbb","bbbbbb");
    News news3=new News(1,"ccc","cccccccc");
    News news4=new News(1,"ddd","dddddd");
    List<News>   list =new ArrayList<>();
    list.add(news1);
    list.add(news2);
    list.add(news3);
    list.add(news4);
   return  list;
    }

}
