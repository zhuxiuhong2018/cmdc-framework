package com.cm.cmdc.framework.service.base.web;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomBooleanEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.cm.cmdc.framework.service.base.BaseController;

public class BaseWebController extends BaseController {

  @InitBinder
  protected void initBaseBinder(WebDataBinder binder) {
    binder.registerCustomEditor(Date.class, new DateEditor());
    binder.registerCustomEditor(Boolean.class, new CustomBooleanEditor("true", "false", true));
  }

  @Autowired
  protected HttpServletRequest request;


}
