package serendipity.zsh.spring.resourceautowireddemo.service.impl;

import org.springframework.stereotype.Service;
import serendipity.zsh.spring.resourceautowireddemo.service.FatherService;

/**
 * @author Serendipity-zsh
 * @Date 2019/9/14 21:57
 */
@Service
public class SonTwoServiceImpl implements FatherService {

    @Override
    public String accedeWealth() {
        return "SonTwo：我也要继承财产！";
    }
}
