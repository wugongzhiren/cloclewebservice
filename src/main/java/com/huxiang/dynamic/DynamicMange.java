package com.huxiang.dynamic;


import com.huxiang.bean.Dynamic;
import com.huxiang.bean.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/7/11.
 */
@RestController
public class DynamicMange {
    @Autowired
    private DynamicRepository repository;
    @RequestMapping(value = "/getDynamic", method = RequestMethod.GET)
    public List<Dynamic> getDynamic(@RequestParam("page") int page) {
        PageRequest pageRequest=new PageRequest(page,15);
        Page dynamicInfo =  repository.findAll(pageRequest);
        if(dynamicInfo.getContent().size()>0) {
            ((Dynamic)dynamicInfo.getContent().get(0)).setTotalPages(dynamicInfo.getTotalPages());
        }
        return dynamicInfo.getContent();
        //return (List<Dynamic>) repository.findAll();
    }
}
