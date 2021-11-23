package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Calculator {
//    @PostMapping("/home")
//    public String home(@RequestParam("num1") String num1, @RequestParam("num2") String num2,@RequestParam("calculator") String calculator, Model model){
//        double number1 = Double.parseDouble(num1);
//        double number2 = Double.parseDouble(num2);
//        double result = calculator(number1, number2, calculator);
//        model.addAttribute("result", result);
//        return "index";
//    }
    @GetMapping("/home")
    public String home2(){
        return "index";
    }

    public double calculator(double num1, double num2, String calculator){
        switch (calculator){
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/": return num1 / num2;
            default: return 0;
        }
    }
    @PostMapping("/home")
    public String home(@RequestParam double num1, double num2, String calculator, Model model){
//        double number1 = Double.parseDouble(num1);
//        double number2 = Double.parseDouble(num2);
        double result = calculator(num1, num2, calculator);
        model.addAttribute("result", result);
        return "index";
    }
}
