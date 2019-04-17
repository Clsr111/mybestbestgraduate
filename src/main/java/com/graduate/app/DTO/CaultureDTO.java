package com.graduate.app.DTO;

import com.graduate.app.bean.Classify;
import com.graduate.app.bean.DiscoverPlace;
import com.graduate.app.bean.FunctionAndSymbol;
import com.graduate.app.bean.MadeArtifact;
import lombok.Data;

/**
 * @author weipan
 * @date 2019/4/14 17:55
 */
@Data
public class CaultureDTO {
  private Integer frame;
  private Integer caltureClassfy;
  private String caltureName;
  private String caltureSize;
  private String caltureDescribe;
  private Integer belong;
  private Integer descoverFrom;
  private Integer classBy;
  private Integer symbol;
  private Integer madeBy;
  private String calturePicture;
  private Classify classify;
  private DiscoverPlace discoverPlace;
  private FunctionAndSymbol functionAndSymbol;
  private MadeArtifact madeArtifact;

}
