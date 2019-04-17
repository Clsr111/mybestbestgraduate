package com.graduate.app.service;

import com.graduate.app.bean.CaltureList;
import com.graduate.app.mapper.CaltureListByMadeMapper;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author weipan
 * @date 2019/4/16 15:22
 */
@Service
@Slf4j
public class CaltureListByMadeService {
  @Autowired
  private CaltureListByMadeMapper caltureListByMadeMapper;
  public List<CaltureList> calturedividebymade(Integer frame){
    return caltureListByMadeMapper.gCalture4(frame);
  }
}
