package controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import bo.Dashboard;
import handler.DashboardHandler;
import utilities.Constants;
import utilities.FormatDate;

@Controller
public class DashboardController {

	DashboardHandler hdl = new DashboardHandler();
	List<Dashboard> radio = null;
	List<Dashboard> patho = null;
	List<Dashboard> nilgid = null;
	List<Dashboard> cardio = null;
	List<Dashboard> opd = null;
	List<Dashboard> performed = null;
	List<Dashboard> dialysis = null;
	String trnDate = "";
	String fromDate = "";
	String toDate = "";
	
	
	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public ModelAndView dashboard() {
		
		ModelAndView mv = new ModelAndView("dashboard");
		this.FetchLists(mv, "01-DEC-17", "15-DEC-17");
		return mv;
	}	
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public ModelAndView Search(@ModelAttribute("dashboard") Dashboard dashboard) throws ParseException {
		
		fromDate = FormatDate.convert(dashboard.getFromDate()) ;
		toDate = FormatDate.convert(dashboard.getToDate());
		ModelAndView mv = new ModelAndView("dashboard");
		this.FetchLists(mv,fromDate,toDate);
		return mv;
	}	
	
	public void FetchLists(ModelAndView mv,String fromDate,String toDate) {
		
		radio = hdl.ListSections(Constants.radiology, fromDate, toDate);
		patho = hdl.ListSections(Constants.pathology, fromDate, toDate);
		nilgid = hdl.GastroCount(fromDate, toDate);
		cardio = hdl.ListSections(Constants.cardiology, fromDate, toDate);
		performed = hdl.RetrievePerformed(fromDate, toDate);
		opd = hdl.OpdSection(fromDate, toDate);
		dialysis = hdl.TotalDialysis(fromDate, toDate);
		
		mv.addObject("radio", radio);
		mv.addObject("patho", patho);
		mv.addObject("nilgid", nilgid);
		mv.addObject("cardio", cardio);
		mv.addObject("opd", opd);
		mv.addObject("performed", performed);
		mv.addObject("dialysis", dialysis);
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(
		@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		model.setViewName("index");

		return model;

	}
}
