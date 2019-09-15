package serendipity.zsh.spring.resourceautowireddemo.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import serendipity.zsh.spring.resourceautowireddemo.service.FatherService;

/**
 * @author Serendipity-zsh
 * @Date 2019/9/14 21:56
 */
@Service
@Primary
public class SonOneServiceImpl implements FatherService {

    @Override
    public String accedeWealth() {
        return "SonOne：我要继承财产！";
    }
}
