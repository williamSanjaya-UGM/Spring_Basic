package com.example.controller;

import com.example.service.AddService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AddController {
//    @RequestMapping("/add")
//    @ResponseBody
//    public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
//        int i = Integer.parseInt(request.getParameter("t1"));
//        int j = Integer.parseInt(request.getParameter("t2"));
//
//        AddService as = new AddService();
//        int k=as.add(i,j);
//
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("display");
//        mv.addObject("result",k);
//        return mv;
//    }

    @RequestMapping("/add")
    @ResponseBody
    public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j){

        AddService as = new AddService();
        int k=as.add(i,j);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("display1");
        mv.addObject("result",k);
        return mv;
    }
}
