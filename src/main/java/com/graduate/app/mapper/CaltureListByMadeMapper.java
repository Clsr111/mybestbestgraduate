package com.graduate.app.mapper;

import com.graduate.app.bean.CaltureList;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author weipan
 * @date 2019/4/16 15:20
 */
@Mapper
@Repository
public interface CaltureListByMadeMapper {
  /**
   * 查询文物目录
   * @return
   */
  List<CaltureList> gCalture4(@Param("frame") Integer frame);

}
