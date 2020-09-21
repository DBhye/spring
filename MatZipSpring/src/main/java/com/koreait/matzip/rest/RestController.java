package com.koreait.matzip.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.koreait.matzip.Const;
import com.koreait.matzip.ViewRef;
import com.koreait.matzip.rest.model.RestPARAM;

@Controller
@RequestMapping("/rest")
public class RestController {
//HandlerMapping 역할
//("/rest") 는 	handlermapper에서 case문으로 두번째 주소를 넣어준것과 같다.
	@Autowired
	private RestService service;
	
	@RequestMapping("/map")
	public String restMap(Model model) {
		model.addAttribute(Const.TITLE, "지도보기");
		model.addAttribute(Const.VIEW,"rest/restMap");
		
		return ViewRef.TEMP_MENU_TEMP;
	}
	
	@RequestMapping("/ajaxGetList")
	@ResponseBody public String ajaxGetList(RestPARAM param) {
		System.out.println("sw_lat : " + param.getSw_lat());
		System.out.println("sw_lng : " + param.getSw_lng());
		System.out.println("ne_lat : " + param.getNe_lat());
		System.out.println("ne_lng : " + param.getNe_lng());
		return service.selRestList(param);
	}
}
