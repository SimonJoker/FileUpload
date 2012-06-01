package jscon.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: shuyue@cn.ibm.com
 * Date: 12-6-1
 * Time: 上午11:22
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/operation")
public class FileUploadController {
    @RequestMapping(value="/upload/{message}",method= RequestMethod.GET)
    public ModelAndView upload(@PathVariable String message)
    {
        return new ModelAndView("upload","message",message);
    }

}
