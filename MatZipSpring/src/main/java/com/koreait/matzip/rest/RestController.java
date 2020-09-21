package com.koreait.matzip.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.koreait.matzip.Const;
import com.koreait.matzip.ViewRef;

@Controller
@RequestMapping("/rest")
public class RestController {
//HandlerMapping 역할
//("/rest") 는 	handlermapper에서 case문으로 두번째 주소를 넣어준것과 같다.
	
	@RequestMapping("/map")
	public String restMap(Model model) {
		model.addAttribute(Const.TITLE, "지도보기");
		model.addAttribute(Const.VIEW,"rest/restMap");
		
		return ViewRef.TEMP_MENU_TEMP;
	}
}
