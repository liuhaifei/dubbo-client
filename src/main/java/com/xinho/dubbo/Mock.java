package com.xinho.dubbo;

/**
 * @author lhf
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/6/2211:11
 */
public class Mock implements IHello {
    @Override
    public String sayHello(String msg) {
        return "服务故障，请稍后访问";
    }
}
