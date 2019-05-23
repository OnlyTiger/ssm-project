package com.ay.controller;

import com.ay.model.AyUser;
import com.ay.service.AyUserService;
import com.ay.validation.AyUserValidation;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import sun.misc.Request;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Ay
 * @create 2018/05/16
 **/
@Controller
@RequestMapping("/test")
@SessionAttributes("ayUser")
public class AyTestController {

    @Resource
    private AyUserService ayUserService;

    @Resource
    private AyUserValidation ayUserValidation;

    @GetMapping("/saveUser")
    public String saveUser(){
        return "saveUser";
    }

    @PostMapping("/save")
    public String save(@Valid AyUser user,Model model, BindingResult result){
        if(result.hasErrors()){
            model.addAttribute("errors", result);
            return "error";
        }
        return "success";
    }

//    @PostMapping("/save")
//    public String save(AyUser user, Errors errors){
//        ayUserValidation.validate(user, errors);
//
//        if(errors.hasErrors()){
//            return "error";
//        }
//        return "success";
//    }


//    @GetMapping("/hello")
//    @ResponseBody
//    public List<String> hello(Model model){
//        List<String> strings = new ArrayList<>();
//        strings.add("ay");
//        strings.add("al");
//        return strings;
//    }

//    @GetMapping("/save")
//    public String saveUser(@RequestBody AyUser ayUser){
//        return "hello";
//    }

//    @RequestMapping("/redirect")
//    public String redirectTest(Model model){
//        AyUser ayUser = new AyUser();
//        ayUser.setName("ay");
//        model.addAttribute("ayUser",ayUser);
//        return "redirect:hello";
//    }
//
//    @GetMapping("/hello")
//    public String hello(Model model){
//        return "hello";
//    }


//    @ModelAttribute("name")
//    public String init(@RequestParam("name") String name){
//        System.out.println("init....");
//        //model.set("name", name);
//        return name;
//    }
//
//    @GetMapping("/findById")
//    public String findById(Model model){
//        return "hello";
//    }

//    @ModelAttribute
//    public void init2(){
//        System.out.println("init 2....");
//    }
//
//    @ModelAttribute
//    public void init3(){
//        System.out.println("init 3....");
//    }



//    @GetMapping("/findById")
//    public String findById(@RequestHeader("Accept-Encoding") String[] encoding,
//                           @RequestHeader("Accept") String[] accept){
//        return "hello";
//    }

//    @GetMapping("/getMapping")
//    public String hello(@RequestParam(value = "name",required = true) String name,
//                        @RequestParam(value = "age",required = false,defaultValue = "20") Integer age){
//        return "hello";
//    }

//    @GetMapping("/modelTest")
//    public ModelAndView modelTest(){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("name", "al");
//        modelAndView.setViewName("modelTest");
//        return modelAndView;
//    }

//    @GetMapping("/modelTest")
//    public String modelTest(Model model, ModelMap map , Map map2){
//        return "hello";
//    }




//    @RequestMapping(value = {
//            "/hello",
//            "/xxx"
//    }, method = RequestMethod.GET
//    )
//    public String hello(){
//        List<AyUser> ayUserList = ayUserService.findAll();
//        System.out.println("hello ay ~~~");
//        return "hello";
//    }
//
//    @GetMapping("/getMapping")
//    //@RequestMapping(method = HttpMethod.GET)
//    public String getMapping(){
//
//        return "hello";
//    }

}
