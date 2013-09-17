package com.google.gwt.query.client;

import com.google.gwt.core.client.*;
import com.google.gwt.query.client.*;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.Event;
import com.google.gwt.query.client.Function;
import com.google.gwt.query.client.js.JsClosure;

public class LazyGQueryImpl implements com.google.gwt.query.client.LazyGQuery {
    private JsArray<JsClosure> closures = JsArray.createArray().cast();
    private com.google.gwt.query.client.GQuery  ctx;
    public final native com.google.gwt.query.client.LazyGQuery add(com.google.gwt.query.client.GQuery arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::add(Lcom/google/gwt/query/client/GQuery;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery add(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::add(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery addClass(java.lang.String[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::addClass([Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery after(com.google.gwt.query.client.GQuery arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::after(Lcom/google/gwt/query/client/GQuery;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery after(com.google.gwt.dom.client.Node arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::after(Lcom/google/gwt/dom/client/Node;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery after(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::after(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery andSelf() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::andSelf()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery animate(java.lang.Object arg0, com.google.gwt.query.client.Function[] arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::animate(Ljava/lang/Object;[Lcom/google/gwt/query/client/Function;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery animate(java.lang.Object arg0, int arg1, com.google.gwt.query.client.plugins.effects.PropertiesAnimation.Easing arg2, com.google.gwt.query.client.Function[] arg3) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::animate(Ljava/lang/Object;ILcom/google/gwt/query/client/plugins/effects/PropertiesAnimation$Easing;[Lcom/google/gwt/query/client/Function;)(arg0,arg1,arg2,arg3);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery animate(java.lang.Object arg0, int arg1, com.google.gwt.query.client.Function[] arg2) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::animate(Ljava/lang/Object;I[Lcom/google/gwt/query/client/Function;)(arg0,arg1,arg2);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery append(com.google.gwt.query.client.GQuery arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::append(Lcom/google/gwt/query/client/GQuery;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery append(com.google.gwt.dom.client.Node arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::append(Lcom/google/gwt/dom/client/Node;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery append(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::append(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery appendTo(com.google.gwt.query.client.GQuery arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::appendTo(Lcom/google/gwt/query/client/GQuery;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery appendTo(com.google.gwt.dom.client.Node arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::appendTo(Lcom/google/gwt/dom/client/Node;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery appendTo(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::appendTo(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.GQuery as(java.lang.Class arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::as(Ljava/lang/Class;)(arg0).createLazy();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery attr(com.google.gwt.query.client.Properties arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::attr(Lcom/google/gwt/query/client/Properties;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native java.lang.String attr(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::attr(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery attr(java.lang.String arg0, com.google.gwt.query.client.Function arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::attr(Ljava/lang/String;Lcom/google/gwt/query/client/Function;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery attr(java.lang.String arg0, java.lang.Object arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::attr(Ljava/lang/String;Ljava/lang/Object;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery before(com.google.gwt.query.client.GQuery arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::before(Lcom/google/gwt/query/client/GQuery;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery before(com.google.gwt.dom.client.Node arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::before(Lcom/google/gwt/dom/client/Node;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery before(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::before(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery bind(int arg0, java.lang.Object arg1, com.google.gwt.query.client.Function[] arg2) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::bind(ILjava/lang/Object;[Lcom/google/gwt/query/client/Function;)(arg0,arg1,arg2);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery bind(int arg0, com.google.gwt.query.client.Function[] arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::bind(I[Lcom/google/gwt/query/client/Function;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery bind(java.lang.String arg0, java.lang.Object arg1, com.google.gwt.query.client.Function[] arg2) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::bind(Ljava/lang/String;Ljava/lang/Object;[Lcom/google/gwt/query/client/Function;)(arg0,arg1,arg2);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery bind(java.lang.String arg0, com.google.gwt.query.client.Function[] arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::bind(Ljava/lang/String;[Lcom/google/gwt/query/client/Function;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery blur(com.google.gwt.query.client.Function[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::blur([Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery change(com.google.gwt.query.client.Function[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::change([Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery children() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::children()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery children(java.lang.String[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::children([Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery clearQueue() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::clearQueue()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery clearQueue(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::clearQueue(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery click(com.google.gwt.query.client.Function[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::click([Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery clone() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::clone()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery closest(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::closest(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery closest(java.lang.String arg0, com.google.gwt.dom.client.Node arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::closest(Ljava/lang/String;Lcom/google/gwt/dom/client/Node;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.js.JsNamedArray closest(java.lang.String[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::closest([Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.js.JsNamedArray closest(java.lang.String[] arg0, com.google.gwt.dom.client.Node arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::closest([Ljava/lang/String;Lcom/google/gwt/dom/client/Node;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery contains(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::contains(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery contents() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::contents()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery css(com.google.gwt.query.client.css.TakesCssValue.CssSetter[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::css([Lcom/google/gwt/query/client/css/TakesCssValue$CssSetter;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native java.lang.String css(com.google.gwt.query.client.css.HasCssValue arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::css(Lcom/google/gwt/query/client/css/HasCssValue;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native java.lang.String css(com.google.gwt.query.client.css.HasCssValue arg0, boolean arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::css(Lcom/google/gwt/query/client/css/HasCssValue;Z)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery css(com.google.gwt.query.client.Properties arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::css(Lcom/google/gwt/query/client/Properties;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native java.lang.String css(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::css(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native java.lang.String css(java.lang.String arg0, boolean arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::css(Ljava/lang/String;Z)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery css(java.lang.String arg0, java.lang.String arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::css(Ljava/lang/String;Ljava/lang/String;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery css(com.google.gwt.query.client.css.TakesCssValue arg0, java.lang.String arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::css(Lcom/google/gwt/query/client/css/TakesCssValue;Ljava/lang/String;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native double cur(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::cur(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native double cur(java.lang.String arg0, boolean arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::cur(Ljava/lang/String;Z)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native java.lang.Object data(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::data(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native java.lang.Object data(java.lang.String arg0, java.lang.Class arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::data(Ljava/lang/String;Ljava/lang/Class;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery data(java.lang.String arg0, java.lang.Object arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::data(Ljava/lang/String;Ljava/lang/Object;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery dblclick(com.google.gwt.query.client.Function[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::dblclick([Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery delay(int arg0, com.google.gwt.query.client.Function[] arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::delay(I[Lcom/google/gwt/query/client/Function;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery delay(int arg0, java.lang.String arg1, com.google.gwt.query.client.Function[] arg2) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::delay(ILjava/lang/String;[Lcom/google/gwt/query/client/Function;)(arg0,arg1,arg2);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery delegate(java.lang.String arg0, int arg1, com.google.gwt.query.client.Function[] arg2) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::delegate(Ljava/lang/String;I[Lcom/google/gwt/query/client/Function;)(arg0,arg1,arg2);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery delegate(java.lang.String arg0, int arg1, java.lang.Object arg2, com.google.gwt.query.client.Function[] arg3) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::delegate(Ljava/lang/String;ILjava/lang/Object;[Lcom/google/gwt/query/client/Function;)(arg0,arg1,arg2,arg3);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery delegate(java.lang.String arg0, java.lang.String arg1, com.google.gwt.query.client.Function[] arg2) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::delegate(Ljava/lang/String;Ljava/lang/String;[Lcom/google/gwt/query/client/Function;)(arg0,arg1,arg2);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery delegate(java.lang.String arg0, java.lang.String arg1, java.lang.Object arg2, com.google.gwt.query.client.Function[] arg3) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::delegate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Lcom/google/gwt/query/client/Function;)(arg0,arg1,arg2,arg3);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery dequeue() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::dequeue()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery dequeue(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::dequeue(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery detach() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::detach()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery detach(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::detach(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery die() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::die()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery die(int arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::die(I)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery die(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::die(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery each(com.google.gwt.query.client.Function[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::each([Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.dom.client.Element[] elements() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::elements()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery empty() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::empty()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery end() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::end()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery eq(int arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::eq(I)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery error(com.google.gwt.query.client.Function[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::error([Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery fadeIn(com.google.gwt.query.client.Function[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::fadeIn([Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery fadeIn(int arg0, com.google.gwt.query.client.Function[] arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::fadeIn(I[Lcom/google/gwt/query/client/Function;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery fadeTo(int arg0, double arg1, com.google.gwt.query.client.Function[] arg2) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::fadeTo(ID[Lcom/google/gwt/query/client/Function;)(arg0,arg1,arg2);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery fadeTo(double arg0, com.google.gwt.query.client.Function[] arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::fadeTo(D[Lcom/google/gwt/query/client/Function;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery fadeOut(com.google.gwt.query.client.Function[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::fadeOut([Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery fadeOut(int arg0, com.google.gwt.query.client.Function[] arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::fadeOut(I[Lcom/google/gwt/query/client/Function;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.plugins.Effects fadeToggle(int arg0, com.google.gwt.query.client.Function[] arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::fadeToggle(I[Lcom/google/gwt/query/client/Function;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery filter(com.google.gwt.query.client.Predicate arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::filter(Lcom/google/gwt/query/client/Predicate;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery filter(java.lang.String[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::filter([Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery find(java.lang.String[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::find([Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery first() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::first()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery focus(com.google.gwt.query.client.Function[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::focus([Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.dom.client.NodeList get() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::get()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.dom.client.Element get(int arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::get(I)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.dom.client.Node getContext() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::getContext()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery getPreviousObject() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::getPreviousObject()();
        }
      );
      return this;
    }-*/;
    public final native java.lang.String getSelector() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::getSelector()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery gt(int arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::gt(I)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery has(com.google.gwt.dom.client.Element arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::has(Lcom/google/gwt/dom/client/Element;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery has(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::has(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native boolean hasClass(java.lang.String[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::hasClass([Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native int height() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::height()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery height(int arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::height(I)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery height(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::height(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery hide() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::hide()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery hover(com.google.gwt.query.client.Function arg0, com.google.gwt.query.client.Function arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::hover(Lcom/google/gwt/query/client/Function;Lcom/google/gwt/query/client/Function;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native java.lang.String html() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::html()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery html(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::html(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native java.lang.String id() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::id()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery id(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::id(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native int index(com.google.gwt.dom.client.Element arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::index(Lcom/google/gwt/dom/client/Element;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native int innerHeight() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::innerHeight()();
        }
      );
      return this;
    }-*/;
    public final native int innerWidth() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::innerWidth()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery insertAfter(com.google.gwt.dom.client.Element arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::insertAfter(Lcom/google/gwt/dom/client/Element;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery insertAfter(com.google.gwt.query.client.GQuery arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::insertAfter(Lcom/google/gwt/query/client/GQuery;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery insertAfter(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::insertAfter(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery insertBefore(com.google.gwt.dom.client.Element arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::insertBefore(Lcom/google/gwt/dom/client/Element;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery insertBefore(com.google.gwt.query.client.GQuery arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::insertBefore(Lcom/google/gwt/query/client/GQuery;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery insertBefore(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::insertBefore(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native boolean is(java.lang.String[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::is([Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native boolean isEmpty() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::isEmpty()();
        }
      );
      return this;
    }-*/;
    public final native boolean isVisible() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::isVisible()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery keydown(com.google.gwt.query.client.Function[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::keydown([Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery keydown(int arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::keydown(I)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery keypress(com.google.gwt.query.client.Function[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::keypress([Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery keypress(int arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::keypress(I)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery keyup(com.google.gwt.query.client.Function[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::keyup([Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery keyup(int arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::keyup(I)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery last() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::last()();
        }
      );
      return this;
    }-*/;
    public final native int left() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::left()();
        }
      );
      return this;
    }-*/;
    public final native int length() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::length()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery live(int arg0, com.google.gwt.query.client.Function[] arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::live(I[Lcom/google/gwt/query/client/Function;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery live(int arg0, java.lang.Object arg1, com.google.gwt.query.client.Function[] arg2) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::live(ILjava/lang/Object;[Lcom/google/gwt/query/client/Function;)(arg0,arg1,arg2);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery live(java.lang.String arg0, com.google.gwt.query.client.Function[] arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::live(Ljava/lang/String;[Lcom/google/gwt/query/client/Function;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery live(java.lang.String arg0, java.lang.Object arg1, com.google.gwt.query.client.Function[] arg2) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::live(Ljava/lang/String;Ljava/lang/Object;[Lcom/google/gwt/query/client/Function;)(arg0,arg1,arg2);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery load(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::load(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery load(java.lang.String arg0, com.google.gwt.query.client.Properties arg1, com.google.gwt.query.client.Function arg2) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::load(Ljava/lang/String;Lcom/google/gwt/query/client/Properties;Lcom/google/gwt/query/client/Function;)(arg0,arg1,arg2);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery lt(int arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::lt(I)(arg0);
        }
      );
      return this;
    }-*/;
    public final native java.util.List map(com.google.gwt.query.client.Function arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::map(Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery mousedown(com.google.gwt.query.client.Function[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::mousedown([Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery mouseenter(com.google.gwt.query.client.Function[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::mouseenter([Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery mouseleave(com.google.gwt.query.client.Function[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::mouseleave([Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery mousemove(com.google.gwt.query.client.Function[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::mousemove([Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery mouseout(com.google.gwt.query.client.Function[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::mouseout([Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery mouseover(com.google.gwt.query.client.Function[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::mouseover([Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery mouseup(com.google.gwt.query.client.Function[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::mouseup([Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery next() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::next()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery next(java.lang.String[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::next([Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery nextAll() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::nextAll()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery nextAll(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::nextAll(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery nextUntil(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::nextUntil(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery nextUntil(java.lang.String arg0, java.lang.String arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::nextUntil(Ljava/lang/String;Ljava/lang/String;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery nextUntil(com.google.gwt.dom.client.Element arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::nextUntil(Lcom/google/gwt/dom/client/Element;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery nextUntil(com.google.gwt.dom.client.Element arg0, java.lang.String arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::nextUntil(Lcom/google/gwt/dom/client/Element;Ljava/lang/String;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery nextUntil(com.google.gwt.query.client.GQuery arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::nextUntil(Lcom/google/gwt/query/client/GQuery;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery nextUntil(com.google.gwt.query.client.GQuery arg0, java.lang.String arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::nextUntil(Lcom/google/gwt/query/client/GQuery;Ljava/lang/String;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery not(com.google.gwt.dom.client.Element arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::not(Lcom/google/gwt/dom/client/Element;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery not(com.google.gwt.query.client.GQuery arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::not(Lcom/google/gwt/query/client/GQuery;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery not(java.lang.String[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::not([Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.GQuery.Offset offset() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::offset()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery offset(com.google.gwt.query.client.GQuery.Offset arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::offset(Lcom/google/gwt/query/client/GQuery$Offset;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery offset(int arg0, int arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::offset(II)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery offsetParent() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::offsetParent()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery one(int arg0, java.lang.Object arg1, com.google.gwt.query.client.Function arg2) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::one(ILjava/lang/Object;Lcom/google/gwt/query/client/Function;)(arg0,arg1,arg2);
        }
      );
      return this;
    }-*/;
    public final native int outerHeight() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::outerHeight()();
        }
      );
      return this;
    }-*/;
    public final native int outerHeight(boolean arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::outerHeight(Z)(arg0);
        }
      );
      return this;
    }-*/;
    public final native int outerWidth() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::outerWidth()();
        }
      );
      return this;
    }-*/;
    public final native int outerWidth(boolean arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::outerWidth(Z)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery parent() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::parent()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery parent(java.lang.String[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::parent([Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery parents() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::parents()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery parents(java.lang.String[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::parents([Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery parentsUntil(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::parentsUntil(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.GQuery.Offset position() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::position()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery prepend(com.google.gwt.query.client.GQuery arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::prepend(Lcom/google/gwt/query/client/GQuery;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery prepend(com.google.gwt.dom.client.Node arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::prepend(Lcom/google/gwt/dom/client/Node;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery prepend(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::prepend(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery prependTo(com.google.gwt.query.client.GQuery arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::prependTo(Lcom/google/gwt/query/client/GQuery;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery prependTo(com.google.gwt.dom.client.Node arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::prependTo(Lcom/google/gwt/dom/client/Node;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery prependTo(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::prependTo(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery prev() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::prev()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery prev(java.lang.String[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::prev([Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery prevAll() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::prevAll()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery prevAll(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::prevAll(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery prevUntil(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::prevUntil(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery prevUntil(com.google.gwt.dom.client.Element arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::prevUntil(Lcom/google/gwt/dom/client/Element;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery prevUntil(com.google.gwt.query.client.GQuery arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::prevUntil(Lcom/google/gwt/query/client/GQuery;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery prevUntil(java.lang.String arg0, java.lang.String arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::prevUntil(Ljava/lang/String;Ljava/lang/String;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery prevUntil(com.google.gwt.dom.client.Element arg0, java.lang.String arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::prevUntil(Lcom/google/gwt/dom/client/Element;Ljava/lang/String;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery prevUntil(com.google.gwt.query.client.GQuery arg0, java.lang.String arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::prevUntil(Lcom/google/gwt/query/client/GQuery;Ljava/lang/String;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native java.lang.Object prop(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::prop(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native java.lang.Object prop(java.lang.String arg0, java.lang.Class arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::prop(Ljava/lang/String;Ljava/lang/Class;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery prop(java.lang.String arg0, java.lang.Object arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::prop(Ljava/lang/String;Ljava/lang/Object;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery prop(java.lang.String arg0, com.google.gwt.query.client.Function arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::prop(Ljava/lang/String;Lcom/google/gwt/query/client/Function;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native int queue() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::queue()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery queue(com.google.gwt.query.client.Function[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::queue([Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native int queue(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::queue(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery queue(java.lang.String arg0, com.google.gwt.query.client.Function[] arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::queue(Ljava/lang/String;[Lcom/google/gwt/query/client/Function;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery remove() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::remove()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery remove(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::remove(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery removeAttr(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::removeAttr(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery removeClass(java.lang.String[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::removeClass([Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery removeData(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::removeData(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery removeProp(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::removeProp(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery replaceAll(com.google.gwt.dom.client.Element arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::replaceAll(Lcom/google/gwt/dom/client/Element;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery replaceAll(com.google.gwt.query.client.GQuery arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::replaceAll(Lcom/google/gwt/query/client/GQuery;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery replaceAll(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::replaceAll(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery replaceWith(com.google.gwt.dom.client.Element arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::replaceWith(Lcom/google/gwt/dom/client/Element;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery replaceWith(com.google.gwt.query.client.GQuery arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::replaceWith(Lcom/google/gwt/query/client/GQuery;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery replaceWith(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::replaceWith(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery resize(com.google.gwt.query.client.Function[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::resize([Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery resize(com.google.gwt.query.client.Function arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::resize(Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native void restoreCssAttrs(java.lang.String[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::restoreCssAttrs([Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native void saveCssAttrs(java.lang.String[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::saveCssAttrs([Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery scroll(com.google.gwt.query.client.Function[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::scroll([Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery scrollIntoView() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::scrollIntoView()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery scrollIntoView(boolean arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::scrollIntoView(Z)(arg0);
        }
      );
      return this;
    }-*/;
    public final native int scrollLeft() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::scrollLeft()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery scrollLeft(int arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::scrollLeft(I)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery scrollTo(int arg0, int arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::scrollTo(II)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native int scrollTop() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::scrollTop()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery scrollTop(int arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::scrollTop(I)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery select() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::select()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery setArray(com.google.gwt.dom.client.NodeList arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::setArray(Lcom/google/gwt/dom/client/NodeList;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native void setPreviousObject(com.google.gwt.query.client.GQuery arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::setPreviousObject(Lcom/google/gwt/query/client/GQuery;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery setSelector(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::setSelector(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery show() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::show()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery siblings() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::siblings()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery siblings(java.lang.String[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::siblings([Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native int size() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::size()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery slice(int arg0, int arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::slice(II)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.plugins.Effects slideDown(com.google.gwt.query.client.Function[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::slideDown([Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.plugins.Effects slideDown(int arg0, com.google.gwt.query.client.Function[] arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::slideDown(I[Lcom/google/gwt/query/client/Function;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.plugins.Effects slideToggle(int arg0, com.google.gwt.query.client.Function[] arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::slideToggle(I[Lcom/google/gwt/query/client/Function;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.plugins.Effects slideUp(com.google.gwt.query.client.Function[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::slideUp([Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.plugins.Effects slideUp(int arg0, com.google.gwt.query.client.Function[] arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::slideUp(I[Lcom/google/gwt/query/client/Function;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery stop() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::stop()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery stop(boolean arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::stop(Z)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery stop(boolean arg0, boolean arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::stop(ZZ)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery submit(com.google.gwt.query.client.Function[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::submit([Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native java.lang.String text() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::text()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery text(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::text(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery toggle() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::toggle()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery toggle(com.google.gwt.query.client.Function[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::toggle([Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery toggleClass(java.lang.String[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::toggleClass([Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery toggleClass(java.lang.String arg0, boolean arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::toggleClass(Ljava/lang/String;Z)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native int top() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::top()();
        }
      );
      return this;
    }-*/;
    public final native java.lang.String toString() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::toString()();
        }
      );
      return this;
    }-*/;
    public final native java.lang.String toString(boolean arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::toString(Z)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery trigger(int arg0, int[] arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::trigger(I[I)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery unbind(int arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::unbind(I)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery unbind(int arg0, com.google.gwt.query.client.Function arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::unbind(ILcom/google/gwt/query/client/Function;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery unbind(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::unbind(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery unbind(java.lang.String arg0, com.google.gwt.query.client.Function arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::unbind(Ljava/lang/String;Lcom/google/gwt/query/client/Function;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery undelegate() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::undelegate()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery undelegate(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::undelegate(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery undelegate(java.lang.String arg0, int arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::undelegate(Ljava/lang/String;I)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery undelegate(java.lang.String arg0, java.lang.String arg1) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::undelegate(Ljava/lang/String;Ljava/lang/String;)(arg0,arg1);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.js.JsNodeArray unique(com.google.gwt.dom.client.NodeList arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::unique(Lcom/google/gwt/dom/client/NodeList;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery unwrap() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::unwrap()();
        }
      );
      return this;
    }-*/;
    public final native java.lang.String val() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::val()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery val(com.google.gwt.query.client.Function arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::val(Lcom/google/gwt/query/client/Function;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery val(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::val(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery val(java.lang.String[] arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::val([Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native java.lang.String[] vals() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::vals()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.user.client.ui.Widget widget() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::widget()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.user.client.ui.Widget widget(int arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::widget(I)(arg0);
        }
      );
      return this;
    }-*/;
    public final native java.util.List widgets() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::widgets()();
        }
      );
      return this;
    }-*/;
    public final native java.util.List widgets(java.lang.Class arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::widgets(Ljava/lang/Class;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native int width() /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::width()();
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery width(int arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::width(I)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery wrap(com.google.gwt.dom.client.Element arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::wrap(Lcom/google/gwt/dom/client/Element;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery wrap(com.google.gwt.query.client.GQuery arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::wrap(Lcom/google/gwt/query/client/GQuery;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery wrap(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::wrap(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery wrapAll(com.google.gwt.dom.client.Element arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::wrapAll(Lcom/google/gwt/dom/client/Element;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery wrapAll(com.google.gwt.query.client.GQuery arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::wrapAll(Lcom/google/gwt/query/client/GQuery;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery wrapAll(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::wrapAll(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery wrapInner(com.google.gwt.dom.client.Element arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::wrapInner(Lcom/google/gwt/dom/client/Element;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery wrapInner(com.google.gwt.query.client.GQuery arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::wrapInner(Lcom/google/gwt/query/client/GQuery;)(arg0);
        }
      );
      return this;
    }-*/;
    public final native com.google.gwt.query.client.LazyGQuery wrapInner(java.lang.String arg0) /*-{
      var self=this;
      this.@com.google.gwt.query.client.LazyGQueryImpl::closures.push(
        function() {
          self.@com.google.gwt.query.client.LazyGQueryImpl::ctx=self.@com.google.gwt.query.client.LazyGQueryImpl::ctx.@com.google.gwt.query.client.GQuery::wrapInner(Ljava/lang/String;)(arg0);
        }
      );
      return this;
    }-*/;
    public Function done() {
    return new Function() {
      public void f(Element e) {
        ctx = GQuery.$(e).as(com.google.gwt.query.client.GQuery.GQUERY);
        for (int i = 0; i < closures.length(); i++) {
          closures.get(i).invoke();
        }
      }
      public boolean f(Event e, Object data) {
        ctx = GQuery.$(e.getCurrentTarget());
        for (int i = 0; i < closures.length(); i++) {
          closures.get(i).invoke();
        }
      return false;
      }
    };
  }
}
