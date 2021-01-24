package com.pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pack.dao.cancellationDao;
import com.pack.model.Cancellation;


@Controller
public class MainController {

	@Autowired
	private cancellationDao studDao;

	@RequestMapping("/")
	public ModelAndView home(ModelAndView model, @ModelAttribute Cancellation stud) {
		System.out.println("info: inside home method");
		model.addObject("stud", stud);
		List<Cancellation> studlist = studDao.showStud();
		System.out.println(studlist);

		model.addObject("studlist", studlist);
		model.setViewName("index");
		return model;
	}

	@RequestMapping("/addStud")
	public ModelAndView addStud(@ModelAttribute Cancellation stud, Model model, ModelAndView model1) {
		System.out.println("info: inside addStud method");
		model1.addObject("stud", new Cancellation());
		boolean isaddStude = studDao.addCancellation(stud);
		if (isaddStude == true) {
			model.addAttribute("sMsg", "Successfully Store");
		} else {
			model.addAttribute("eMsg", "Not Store");
		}
		List<Cancellation> studlist = studDao.showStud();
		model1.addObject("studlist", studlist);
		model1.setViewName("index");
		return model1/* "redirect:/" */;
	}

	@RequestMapping("/deleteStud")
	public ModelAndView deleteStud(@RequestParam Integer  passenger_id, ModelAndView model) {
		System.out.println("info: inside deleteStud method");
		Cancellation stud = new Cancellation();
		model.addObject("stud", stud);
		boolean isDelete = studDao.deleteCancellation(passenger_id);
		if (isDelete == true) {
			model.addObject("sMsg", "Successfully Delete");
		} else {
			model.addObject("sMsg", "Unable to Delete");
		}
		List<Cancellation> studlist = studDao.showStud();
		model.addObject("studlist", studlist);
		model.setViewName("index");
		return model;
	}

	@RequestMapping("/editStud")
	public ModelAndView editStud(@RequestParam Integer  passenger_id, ModelAndView model) {
		System.out.println("info: inside editStud method");
		Cancellation stud = studDao.editStud( passenger_id);
		model.addObject("stud", stud);
		model.setViewName("editForm");
		return model;
	}

	@RequestMapping("/updateStud")
	public ModelAndView updateStud(@ModelAttribute Cancellation passenger_id, ModelAndView model) {
		model.addObject("stud", new Cancellation());
		System.out.println("info: inside updateStud method");
		boolean isUpdate = studDao.updateStud(passenger_id);
		if (isUpdate == true) {
			model.addObject("sMsg", "Updated Successfully");
		} else {
			model.addObject("sMsg", "Unable to update");
		}
		List<Cancellation> studlist = studDao.showStud();
		model.addObject("studlist", studlist);
		model.setViewName("index");
		return model;
	}
}
