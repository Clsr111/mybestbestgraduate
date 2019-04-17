package com.graduate.app.service;

import com.graduate.app.bean.CaltureList;
import com.graduate.app.mapper.CaltureListMapper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author weipan
 * @date 2019/4/11 16:03
 */
@Service
@Slf4j
public class CaltureListService {

  @Autowired
  private CaltureListMapper caltureListMapper;

  public List<CaltureList> getAllCaltureList(){
    return caltureListMapper.getAllCalture();
  }

  /**
   * 通过frame得到CaltureList
   * @param frame
   * @return
   */
  public CaltureList getCaltureByFrame(Integer frame){
    return caltureListMapper.getCaltureByFrame(frame);
  }

}
