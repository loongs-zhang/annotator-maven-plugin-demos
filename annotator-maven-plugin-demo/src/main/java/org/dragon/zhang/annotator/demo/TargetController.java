package org.dragon.zhang.annotator.demo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类上的描述2
 *
 * @author zhangzicheng
 * @version 1.0.0
 * @date 2021/03/01
 * @exception Exception
 * @throws Exception
 * @link Exception
 * @see Exception
 * @since 1.0.0
 */
@Api(tags = {"类上的描述2"}, protocols = "http,https")
@RestController
public class TargetController implements BeanNameAware {

    /**
     * beanName
     */
    private String name;

    /**
     * 方法上的描述2
     *
     * @param param2 参数2
     * @return 返回值2
     */
    @ApiOperation(value = "方法上的描述2", protocols = "http,https")
    @ApiResponse(code = 200, message = "返回值2")
    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public String test(@ApiParam(name = "param2", value = "参数2") @RequestParam String param2) {
        return name + " say hello, " + param2;
    }

    @Override
    public void setBeanName(String name) {
        this.name = name;
    }
}
