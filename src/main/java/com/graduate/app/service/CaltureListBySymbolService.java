package com.graduate.app.service;

import com.graduate.app.bean.CaltureList;
import com.graduate.app.mapper.CaltureListBySymbolMapper;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author weipan
 * @date 2019/4/16 15:06
 */
@Service
@Slf4j
public class CaltureListBySymbolService {
    @Autowired
    private CaltureListBySymbolMapper caltureListBySymbolMapper;

    public List<CaltureList> calturedividebysymbol(Integer frame){
      return caltureListBySymbolMapper.gCalture3(frame);
    }

}
