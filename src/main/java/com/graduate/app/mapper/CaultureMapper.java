package com.graduate.app.mapper;

import com.graduate.app.DTO.CaultureDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author weipan
 * @date 2019/4/14 17:58
 */
@Mapper
@Repository
public interface CaultureMapper {

  /**
   * 获得DTO对象
   * @param frame
   * @return
   */
  CaultureDTO getCaultreDTOByFrame(@Param("frame") Integer frame);

}
