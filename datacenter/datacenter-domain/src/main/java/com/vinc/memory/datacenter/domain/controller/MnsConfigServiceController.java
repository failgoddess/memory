package com.vinc.memory.datacenter.domain.controller;

import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Api(description = "MNS")
@RestController
@RequestMapping("ms")
@Slf4j
public class MnsConfigServiceController {

    @ApiOperation(value = "123", notes = "123")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "OK", response = Object.class)})
    @ApiImplicitParams({
            @ApiImplicitParam(name = "my_queue", value = "123", required = true, paramType = "query", dataType = "String")
    })
    @RequestMapping(value = "/getMessageByMns", method = RequestMethod.GET)
    public Object getMessageByMns(@RequestParam("my_queue") String myQueue) {
        //step4 获取消息
        return "123";
    }

}
