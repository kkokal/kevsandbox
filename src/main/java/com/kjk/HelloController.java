package com.kjk;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}

    @ResponseBody
    @RequestMapping(value="/api/data/{name}", method = RequestMethod.GET)
    public Map<String, String> getData(@PathVariable String name) {
        Map<String, String> m = new HashMap<String, String>();
        m.put("id", "12345");
        m.put("name", name);
        return m;
    }
}