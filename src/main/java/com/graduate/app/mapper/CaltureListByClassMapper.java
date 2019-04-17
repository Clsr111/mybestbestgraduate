package com.graduate.app.mapper;

import com.graduate.app.bean.CaltureList;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author weipan
 * @date 2019/4/16 14:07
 */
@Mapper
@Repository
public interface CaltureListByClassMapper {
  /**
   * 查询文物目录
   * @return
   */
  List<CaltureList> gCalture2(@Param("frame") Integer frame);
}
