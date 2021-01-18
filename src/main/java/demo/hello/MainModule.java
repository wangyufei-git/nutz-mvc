package demo.hello;

import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;

/**
 * @author wangyufei 93619242@qq.com
 * @date 2020/12/15 0015
 * @infos
 */
public class MainModule {
    @At("/hello")
    @Ok("jsp:jsp.hello")
    public String doHello() {
        return "Hello Nutz.mvc";
    }
}
