package com.iu.spring_2.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/member/**")
public class MemberController {
	@RequestMapping(value = "memberJoin")
	public void memberJoin() {
		
	}
	@RequestMapping(value = "memberJoin" , method = RequestMethod.POST)
	public void memberJoin2() {
		System.out.println("Join Post");
	}
	
	
	
	@RequestMapping(value = "memberLogin" , method = RequestMethod.POST)
	public String memberLogin2() {
		System.out.println("Login Post");
		return "redirect:../";
	}
	@RequestMapping(value = "memberLogin" , method = RequestMethod.GET)
	public void memberLogin() {
		
	}
	
	
	
	@RequestMapping(value = "memberUpdate")
	public void memberUpdate() {
		
	}
	@RequestMapping(value = "memberUpdate",method = RequestMethod.POST)
	public void memberUpdate2() {
		System.out.println("Update Post");
	}
	
	
	
	@RequestMapping(value = "memberPage")
	public void memberPage() {
		
	}	
}
