package com.stall.controller;
import com.stall.model.PersonEntity;
import com.stall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/listOfPersons")
    public ModelAndView home() {
        List<PersonEntity > personList  = userService.getAllPersons();
        PersonEntity personEntity = new PersonEntity();
        ModelAndView mav = new ModelAndView("personList");
        mav.addObject("person",personEntity);
        mav.addObject("personList", personList);
        return mav;
    }
    @RequestMapping("/new")
    public ModelAndView newCustomerForm() {
        ModelAndView modelAndView = new ModelAndView("newPerson");
        modelAndView.addObject("personEntity",new PersonEntity());
        return modelAndView;
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView savePerson(@ModelAttribute("personEntity") PersonEntity personEntity) {
        userService.updatePerson(personEntity);
        return new ModelAndView("success");
    }
    @RequestMapping("/edit/{id}")
    public ModelAndView editPersonForm(@PathVariable long id) {
        ModelAndView mav = new ModelAndView("edit_person");
        PersonEntity personEntity = userService.getPerson(id);
        mav.addObject("personEntity", personEntity);
        return mav;
    }
    @RequestMapping("/delete/{id}")
    public ModelAndView deletePersonForm(@PathVariable long id) {
        userService.deletePerson(id);
        return new ModelAndView("success");
    }
    @RequestMapping("/update")
    public ModelAndView update() {
        List<PersonEntity > personList  = userService.getAllPersons();
        PersonEntity personEntity = new PersonEntity();
        ModelAndView mav = new ModelAndView("updatePerson");
        mav.addObject("person",personEntity);
        mav.addObject("personList", personList);
        return mav;
    }
}


