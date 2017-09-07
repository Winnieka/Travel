package com.six.controller;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.six.dto.Major;
import com.six.service.MajorService;
/**
 * 
 * @author 王朋飞
 *
 * 2017年9月7日上午7:23:41
 */
@Controller
@RequestMapping("major")
public class MajorController {
       @Resource(name="majorService")
       private MajorService majorService;
       //首页列表查询
       @ResponseBody
       @RequestMapping("toindex")
       public List<Major> toindex()
       {
    	  List<Major> majorList=majorService.getMajorList();   
    	  return majorList;
       }
}
