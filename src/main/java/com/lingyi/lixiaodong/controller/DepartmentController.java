package com.lingyi.lixiaodong.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lixiaodong
 * @since 2019-06-22
 */
@RestController
@RequestMapping("/department")
@Api("这个是部门控制器")
public class DepartmentController {
    @RequestMapping("/list")
    @ApiOperation("获取所有部门")
    public String departmentList(){
        return "部门列表";
    }
}

