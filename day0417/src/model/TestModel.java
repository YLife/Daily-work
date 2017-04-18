package model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestModel {
	
	@RequestMapping(value = "/test1")
	public Map<String, Object> update(Integer id , String name){
		Map<String, Object> resultMap = new HashMap<String, Object>() ;
		if (id == null || name == null) {
			resultMap.put("result", "参数不合法");
			return resultMap;
		}
		resultMap.put("result", "参数合法");
		return resultMap;
	}
}
