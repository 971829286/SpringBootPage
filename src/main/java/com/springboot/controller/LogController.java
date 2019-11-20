package com.springboot.controller;

import com.springboot.domian.CustomType;
import com.springboot.domian.Pager;
import com.springboot.domian.richan_log;
import com.springboot.service.LogService;
import org.apache.ibatis.annotations.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

@RestController
@RequestMapping("/apinew")
public class LogController {

    @Resource
    private LogService logService;

    @RequestMapping(value = "/findnew.do", method = RequestMethod.POST)
    public ResponseEntity<?> find(@Param("application_number") String application_number,
                                  @Param("DataFrom") String DataFrom,
                                  @Param("richanlog") String richanlog,
                                  @Param("entryid") String entryid,
                                  @Param("title") String title,
                                  @Param("createtime") String createtime,
                                  @RequestParam("page") Integer page,
                                  @RequestParam("size") Integer size) {
        // ---------------------- 调试数据 ----------------------
//        System.out.println("application_number：" + application_number);
//        System.out.println("DataFrom：" + DataFrom);
//        System.out.println("richanlog：" + richanlog);
//        System.out.println("entryid：" + entryid);
//        System.out.println("title：" + title);
//        System.out.println("createtime：" + createtime);
//        System.out.println("当前页：" + page);
//        System.out.println("每页条数：" + size);
        // ---------------------- 调试数据 ----------------------

        CustomType customType = new CustomType(400, "查无此数据！");
        Optional<Pager<richan_log>> optionalPager =
                logService.find(application_number,DataFrom,richanlog,entryid,title,createtime, page, size);
        if (optionalPager.isPresent()) {
            customType.setCode(200);
            customType.setResult(optionalPager.get());
        }
        return ResponseEntity.ok(customType);
    }
}
