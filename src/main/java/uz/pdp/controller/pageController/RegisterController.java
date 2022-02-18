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
import uz.pdp.repositoy.UserRepository;
import uz.pdp.service.UserService;

@Controller
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    UserService userService;

    @GetMapping
    public String getRegisterPage() {
        return "warehouse/register";
    }

    @PostMapping
    public String register(@ModelAttribute UserDTO dto) {

        ApiResponse response = userService.register(dto);
        if (response.isSuccess()) {

            return "/warehouse/index";
        }
        return "warehouse/register";
    }

}
