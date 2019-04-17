package com.graduate.app.cotroller;

import com.google.common.base.Preconditions;
import com.graduate.app.DTO.CaultureDTO;
import com.graduate.app.bean.CaltureList;
import com.graduate.app.mapper.CaltureListByClassMapper;
import com.graduate.app.mapper.CaltureListByDescoverMapper;
import com.graduate.app.service.CaltureListByClassService;
import com.graduate.app.service.CaltureListByDescoverService;
import com.graduate.app.service.CaltureListByMadeService;
import com.graduate.app.service.CaltureListBySymbolService;
import com.graduate.app.service.CaltureListService;
import com.graduate.app.service.CaltureService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author weipan
 * @date 2019/4/11 15:23
 */
@Controller
@Slf4j
public class IndexController {

  @Autowired
  private CaltureListService caltureListService;

  @Autowired
  private CaltureService caltureService;

  @Autowired
  private CaltureListByDescoverService caltureListByDescoverService;

  @Autowired
  private CaltureListByClassService caltureListByClassService;

  @Autowired
  private CaltureListBySymbolService caltureListBySymbolService;

  @Autowired
  private CaltureListByMadeService caltureListByMadeService;

  @GetMapping("/")
  public String toIndex(Model model) {
    List<CaltureList> caltureLists = caltureListService.getAllCaltureList();
    model.addAttribute("caltures", caltureLists);
    return "index";
  }

  @GetMapping("/calture/{frame}")
  public String toCaltureDetial(Model model, @PathVariable("frame") Integer frame) {
    //判断frame 是否为空
    Preconditions.checkNotNull(frame, "frame为空 参数错误");
    log.info("frame的值为：{}", frame);
    CaltureList calture = caltureListService.getCaltureByFrame(frame);
    CaultureDTO caultureDTO = caltureService.getCaultureByFrame(frame);
    model.addAttribute("caultureDTO", caultureDTO);
    model.addAttribute("calture", calture);
    return "calture_detial";

  }

  @GetMapping("byplace")
  public String jumptoplace(Model model){
    return "calture_display";
  }

  @GetMapping("byclass")
  public String jumptoclass(Model model){
    return "calture_displaybyclass";
  }

  @GetMapping("bysymbol")
  public String jumptosymbol(Model model){
    return "calture_displaybysymbol";
  }

  @GetMapping("bymade")
  public String jumptomade(Model model){
    return "calture_displaybymade";
  }

  @GetMapping("/descoverplace/{frame}")
  public String toCaltureDisplay(Model model,@PathVariable("frame") Integer frame){
    List<CaltureList> lists = caltureListByDescoverService.calturedividebyplace1(frame);
    log.info(lists.toString());
    model.addAttribute("lists",lists);
    return "calture_display";
  }
  @GetMapping("/classby/{frame}")
  public String toCaltureDisplayByClass(Model model,@PathVariable("frame") Integer frame){
    List<CaltureList> listbyclass =caltureListByClassService.calturedividebyclass(frame);
    log.info(listbyclass.toString());
    model.addAttribute("listbyclass",listbyclass);
    return "calture_displaybyclass";
  }
  @GetMapping("/symbolby/{frame}")
  public String toCaltureDisplayBySymbol(Model model,@PathVariable("frame") Integer frame){
    List<CaltureList> listbysymbol=caltureListBySymbolService.calturedividebysymbol(frame);
    log.info(listbysymbol.toString());
    model.addAttribute("listbysymbol",listbysymbol);
    return "calture_displaybysymbol";
  }
  @GetMapping("/madeby/{frame}")
  public String toCaltureDisplayByMade(Model model,@PathVariable("frame") Integer frame){
    List<CaltureList> listbymade=caltureListByMadeService.calturedividebymade(frame);
    log.info(listbymade.toString());
    model.addAttribute("listbymade",listbymade);
    return "calture_displaybymade";
  }
}
