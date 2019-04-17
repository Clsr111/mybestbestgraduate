package com.graduate.app.mapper;

import com.graduate.app.bean.CaltureList;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author weipan
 * @date 2019/4/16 15:02
 */
@Mapper
@Repository
public interface CaltureListBySymbolMapper {
  /**
   * 查询文物目录
   * @return
   */
  List<CaltureList> gCalture3(@Param("frame") Integer frame);
}
