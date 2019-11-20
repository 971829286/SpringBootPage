package com.springboot.mapper;

import com.springboot.domian.richan_log;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogMapper {
    /**
     * 查询分页数据
     *
     * @param name 模糊查询关键字
     * @param page 页数
     * @param size 每页条数
     * @return 分页数据
     */
    List<richan_log> find(@Param("application_number") String application_number,
                          @Param("DataFrom") String DataFrom,
                          @Param("richanlog") String richanlog,
                          @Param("entryid") String entryid,
                          @Param("title") String title,
                          @Param("createtime") String createtime,
                          @Param("page") Integer page,
                          @Param("size") Integer size);

    /**
     * 查询符合条件的总记录数
     * @param name 模糊查询关键字
     * @return 总记录数
     */
    Long getTotal(@Param("application_number") String application_number,
                  @Param("DataFrom") String DataFrom,
                  @Param("richanlog") String richanlog,
                  @Param("entryid") String entryid,
                  @Param("title") String title,
                  @Param("createtime") String createtime);

}
