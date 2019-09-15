package serendipity.zsh.spring.resourceautowireddemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import serendipity.zsh.spring.resourceautowireddemo.service.FatherService;

import javax.annotation.Resource;

/**
 * @author ZhangShihao
 * @Date 2019/9/14 21:56
 */
@RestController
@RequestMapping("/api")
public class FatherController {
    //初始
    //@Resource

    //第一次改动，无SonTwoServiceImpl
    //@Autowired

    //第二次改动，增加SonTwoServiceImpl
    //@Resource(name = "sonOneServiceImpl")
    //或者：@Qualifier("sonOneServiceImpl")

    //第三次改动，修改 SonOneServiceImpl
    @Autowired
    private FatherService fatherService;

    @RequestMapping("/accedeWealth")
    public String accedeWealth() {
        return fatherService.accedeWealth();
    }
}
