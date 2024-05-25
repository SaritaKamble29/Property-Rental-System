package com.example.FinalProject1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.FinalProject1.model.House;
import com.example.FinalProject1.repository.proprepo;

@Controller
public class PropertyController {
	
	@Autowired
	proprepo pre;
	
	@RequestMapping("/adddet")
	public String addDetail(@ModelAttribute House h)
	{
		System.out.println(h);
		pre.save(h);
		return "SaveDetail.jsp";
		
	}
	
	@RequestMapping("/PropertyDetail")
	public String fetch(Model m)
	{
		List<House> h_data=pre.findAll();
		
		System.out.println(h_data);
		m.addAttribute("data",h_data);
		return "PropertyDetail.jsp";
		
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		pre.deleteById(id);
		return "redirect:/PropertyDetail";
		
	}
	
	@RequestMapping("/{id}")
	public String edit(@PathVariable int id, Model m)
	{
		House ob=pre.findById(id).orElse(null);
		m.addAttribute("edit_data", ob);
		return "EditDetail.jsp";
		
	}
	
	@RequestMapping("/edit/{id}")
	public String update(@PathVariable int id,@ModelAttribute House h)
	{
		House hh=pre.findById(id).orElse(null);
		
		if(hh!=null)
		{
			hh.setHname(h.getHname());
			hh.setCategory(h.getCategory());
			hh.setBedroom(h.getBedroom());
			hh.setEmail(h.getEmail());
			hh.setCity(h.getCity());
			hh.setMobile(h.getMobile());
			hh.setAddress(h.getAddress());
			hh.setDescription(h.getDescription());
			hh.setPrice(h.getPrice());
			
			pre.save(hh);
		}
		return "redirect:/PropertyDetail";
		
	}
	
	@RequestMapping("/home1")
	public String home1()
	{
		return "ShowDetail.jsp";
	}
	
	@RequestMapping("/add1")
	public String multidata(@RequestBody List<House> h)
	{
		pre.saveAll(h);
		return "redirect:/PropertyDetail";
		
	}
	@GetMapping("/showMap")
	public String index()
	{
		return "index";
	}
	
	

	
	
	

}
