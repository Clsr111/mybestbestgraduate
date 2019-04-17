package com.graduate.app.service;

import com.graduate.app.bean.CaltureList;
import com.graduate.app.mapper.CaltureListByClassMapper;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author weipan
 * @date 2019/4/16 14:17
 */
@Service
@Slf4j
public class CaltureListByClassService {
@Autowired
  private CaltureListByClassMapper caltureListByClassMapper;

  public List<CaltureList>calturedividebyclass(Integer frame){
    return caltureListByClassMapper.gCalture2(frame);
  }
}
