

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: aleksandr.davidiuk
 * Date: 11/8/13
 * Time: 2:45 PM
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean(name = "hello")
@ViewScoped
public class HelloBean implements Serializable {

    private String message = "Hello SANYA";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message ;
    }

    public void test() {
        this.message = "durak";
    }
}
