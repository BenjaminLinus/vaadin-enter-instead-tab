package com.google.gwt.query.client.plugins.ajax;

import com.google.gwt.query.client.js.*;
import com.google.gwt.query.client.*;
import com.google.gwt.core.client.*;
import com.google.gwt.dom.client.*;
import java.util.*;

public class Ajax_Settings_JsonBuilder extends com.google.gwt.query.client.builders.JsonBuilderBase<com.google.gwt.query.client.plugins.ajax.Ajax_Settings_JsonBuilder> implements com.google.gwt.query.client.plugins.ajax.Ajax.Settings {
  public final java.lang.String getContentType() {
    return p.getStr("contentType");
  }
  public final com.google.gwt.dom.client.Element getContext() {
    return p.getJavaScriptObject("context");
  }
  public final com.google.gwt.query.client.Properties getData() {
    return getPropertiesBase("data");
  }
  public final java.lang.String getDataString() {
    return p.getStr("dataString");
  }
  public final java.lang.String getDataType() {
    return p.getStr("dataType");
  }
  public final com.google.gwt.query.client.Function getError() {
    return p.getFunction("error");
  }
  public final com.google.gwt.query.client.Properties getHeaders() {
    return getPropertiesBase("headers");
  }
  public final java.lang.String getPassword() {
    return p.getStr("password");
  }
  public final com.google.gwt.query.client.Function getSuccess() {
    return p.getFunction("success");
  }
  public final int getTimeout() {
    return (int)p.getFloat("timeout");
  }
  public final java.lang.String getType() {
    return p.getStr("type");
  }
  public final java.lang.String getUrl() {
    return p.getStr("url");
  }
  public final java.lang.String getUsername() {
    return p.getStr("username");
  }
  public final com.google.gwt.query.client.plugins.ajax.Ajax.Settings setContentType(java.lang.String a){
    p.set("contentType", a);
    return this;
  }
  public final com.google.gwt.query.client.plugins.ajax.Ajax.Settings setContext(com.google.gwt.dom.client.Element a){
    p.set("context", a);
    return this;
  }
  public final com.google.gwt.query.client.plugins.ajax.Ajax.Settings setData(com.google.gwt.query.client.Properties a){
    p.set("data", a);
    return this;
  }
  public final com.google.gwt.query.client.plugins.ajax.Ajax.Settings setDataString(java.lang.String a){
    p.set("dataString", a);
    return this;
  }
  public final com.google.gwt.query.client.plugins.ajax.Ajax.Settings setDataType(java.lang.String a){
    p.set("dataType", a);
    return this;
  }
  public final com.google.gwt.query.client.plugins.ajax.Ajax.Settings setError(com.google.gwt.query.client.Function a){
    p.setFunction("error", a);
    return this;
  }
  public final com.google.gwt.query.client.plugins.ajax.Ajax.Settings setHeaders(com.google.gwt.query.client.Properties a){
    p.set("headers", a);
    return this;
  }
  public final com.google.gwt.query.client.plugins.ajax.Ajax.Settings setPassword(java.lang.String a){
    p.set("password", a);
    return this;
  }
  public final com.google.gwt.query.client.plugins.ajax.Ajax.Settings setSuccess(com.google.gwt.query.client.Function a){
    p.setFunction("success", a);
    return this;
  }
  public final com.google.gwt.query.client.plugins.ajax.Ajax.Settings setTimeout(int a){
    p.setNumber("timeout", a);
    return this;
  }
  public final com.google.gwt.query.client.plugins.ajax.Ajax.Settings setType(java.lang.String a){
    p.set("type", a);
    return this;
  }
  public final com.google.gwt.query.client.plugins.ajax.Ajax.Settings setUrl(java.lang.String a){
    p.set("url", a);
    return this;
  }
  public final com.google.gwt.query.client.plugins.ajax.Ajax.Settings setUsername(java.lang.String a){
    p.set("username", a);
    return this;
  }
  public final String[] getFieldNames() {return new String[]{"headers","error","data","contentType","type","password","url","dataType","username","context","dataString","success","timeout"};}
  public final String getJsonName() {return "settings";}
  public final String toJson() {return "{\"" + getJsonName() + "\":" + toString() + "}";}
}
