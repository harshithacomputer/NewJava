package cap.com;
@Controller
//@RequestMapping("/api")
public class SpringController {
@GetMapping("/Viewpage")
	public String welcome() {
		return "Viewpage";
	}
@GetMapping("/final")
public String disply() {
	return "final";
}
}
