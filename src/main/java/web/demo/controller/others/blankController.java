package web.demo.controller.others;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/others")
public class blankController {
    Logger log = Logger.getLogger(this.getClass());

    @RequestMapping(value = "/blank")
    public String dealPlan(ModelMap modelMap, HttpServletRequest request) {
        return "/pages/others/blank";
    }
}
