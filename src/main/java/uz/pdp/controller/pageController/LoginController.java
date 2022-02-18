package uz.pdp.controller.pageController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.pdp.dto.ApiResponse;
import uz.pdp.dto.UserDTO;
import uz.pdp.service.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    UserService userService;

    @GetMapping
    public String getLoginPage() {
        return "warehouse/login";
    }

    @PostMapping
    public String login(@ModelAttribute UserDTO dto) {

        ApiResponse login = userService.login(dto);

        if (login.isSuccess()) {
            return "/warehouse/dashboard";
        }
        return "/warehouse/index";
    }

}
