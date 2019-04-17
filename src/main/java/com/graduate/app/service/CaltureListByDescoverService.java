package com.graduate.app.service;

import com.graduate.app.bean.CaltureList;
import com.graduate.app.mapper.CaltureListByDescoverMapper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author weipan
 * @date 2019/4/15 22:02
 */
@Service
@Slf4j
public class CaltureListByDescoverService {

  @Autowired
  private CaltureListByDescoverMapper caltureListByDescoverMapper;

  public List<CaltureList> calturedividebyplace1(Integer frame){
   return caltureListByDescoverMapper.gCalture1(frame) ;
  }
}
