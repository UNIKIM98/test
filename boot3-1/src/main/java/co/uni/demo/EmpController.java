package co.uni.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpController {

	@Autowired
	EmpMapper empMapper;

	@GetMapping("/empList")
	public String empList(Model model) {
		model.addAttribute("empList",empMapper.getEmpList());
		return "emplist";
	}
}
