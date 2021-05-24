package pl.sda.web;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.sda.domain.User;
import pl.sda.services.UserService;

@Controller
@RequestMapping("/register")
public class RegisterController {

    private final BCryptPasswordEncoder encoder;
    private final UserService userService;

    public RegisterController(BCryptPasswordEncoder encoder, UserService userService) {
        this.encoder = encoder;
        this.userService = userService;
    }

    @GetMapping
    ModelAndView showRegisterPage() {
        ModelAndView modelAndView = new ModelAndView("register");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @PostMapping
    String registerUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        userService.addUser(user);
        return "login";
    }

}