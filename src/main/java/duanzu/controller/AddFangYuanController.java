package duanzu.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/pages/hotel/addfangyuan")
public class AddFangYuanController {
	@RequestMapping("/loadhostinfo.do")
	@ResponseBody
	private Map<String,Object> loadHostInfo(){
		
		return null;
	}
}
