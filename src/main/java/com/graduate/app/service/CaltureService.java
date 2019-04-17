package com.graduate.app.service;

import com.graduate.app.DTO.CaultureDTO;
import com.graduate.app.mapper.CaultureMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author weipan
 * @date 2019/4/14 19:09
 */
@Slf4j
@Service
public class CaltureService {

  @Autowired
  private CaultureMapper caultureMapper;

  public CaultureDTO getCaultureByFrame(Integer frame){
    log.info("获取对象成功");
    return caultureMapper.getCaultreDTOByFrame(frame);
  }
}
