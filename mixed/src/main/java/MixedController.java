import com.example.springbootgradlepluginissue.BarController;
import com.example.springbootgradlepluginissue.FooController;
import org.springframework.stereotype.Controller;

@Controller
public class MixedController {

    public void someStuff() {
        System.out.println(FooController.FOO + BarController.BAR);
    }
}
