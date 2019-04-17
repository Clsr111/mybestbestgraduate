package com.graduate.app.mapper;

import com.graduate.app.bean.CaltureList;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author weipan
 * @date 2019/4/11 15:54
 */
@Mapper
@Repository
public interface CaltureListMapper {

  /**
   * 查询文物目录
   * @return
   */
  List<CaltureList> getAllCalture();

  /**
   *
   * @param frame
   * @return
   */
  CaltureList getCaltureByFrame(@Param("frame") Integer frame);
}
