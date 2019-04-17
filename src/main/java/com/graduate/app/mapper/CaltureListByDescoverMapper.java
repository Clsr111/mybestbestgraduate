package com.graduate.app.mapper;

import com.graduate.app.DTO.CaultureDTO;
import com.graduate.app.bean.CaltureList;
import com.graduate.app.bean.DiscoverPlace;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author weipan
 * @date 2019/4/15 15:44
 */
@Mapper
@Repository
public interface CaltureListByDescoverMapper {

  /**
   * 查询文物目录
   * @return
   */
  List<CaltureList> gCalture1(@Param("frame") Integer frame);


}


