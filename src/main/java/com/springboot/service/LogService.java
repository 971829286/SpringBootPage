package com.springboot.service;

import com.springboot.domian.Pager;
import com.springboot.domian.richan_log;
import com.springboot.mapper.LogMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class LogService {
    @Resource
    private LogMapper logMapper;


    public Optional<Pager<richan_log>> find(String application_number,String DataFrom,String richanlog,String entryid,String title,String createtime, Integer page, Integer size) {

        // 1.查询数据库
        // 1.1 查询总记录数
        Long total = logMapper.getTotal(application_number,DataFrom,richanlog,entryid,title,createtime);
        // 1.2 根据total判断查询结果
        Optional<Pager<richan_log>> optionalPager = Optional.empty();
        if (total > 0) {
            // 封装分页数据
            Pager<richan_log> pager = new Pager<>();
            List<richan_log> districts = logMapper.find(application_number,DataFrom,richanlog,entryid,title,createtime, (page - 1) * size, size); // 注意开始行的处理
            pager.setPage(page);
            pager.setSize(size);
            pager.setTotal(total);
            pager.setList(districts);

            optionalPager = Optional.of(pager);
        }
        return optionalPager;
    }
}
