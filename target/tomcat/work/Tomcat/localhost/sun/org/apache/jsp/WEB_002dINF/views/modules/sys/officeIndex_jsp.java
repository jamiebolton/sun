/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-05-27 08:19:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.modules.sys;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class officeIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fns:getAdminPath", club.crazypenguin.common.config.Global.class, "getAdminPath", new Class[] {});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/tlds/shiros.tld", Long.valueOf(1464327332252L));
    _jspx_dependants.put("/WEB-INF/tlds/fns.tld", Long.valueOf(1464328151081L));
    _jspx_dependants.put("/WEB-INF/views/include/treeview.jsp", Long.valueOf(1425457846608L));
    _jspx_dependants.put("/WEB-INF/views/include/taglib.jsp", Long.valueOf(1427858590163L));
    _jspx_dependants.put("/WEB-INF/tags/sys/message.tag", Long.valueOf(1425457846597L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>机构管理</title>\r\n");
      out.write("\t<meta name=\"decorator\" content=\"default\"/>\r\n");
      out.write("\t");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxStatic}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jquery-ztree/3.5.12/css/zTreeStyle/zTreeStyle.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxStatic}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jquery-ztree/3.5.12/js/jquery.ztree.all-3.5.min.js\" type=\"text/javascript\"></script>");
      out.write("\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t.ztree {overflow:auto;margin:0;_margin-top:10px;padding:10px 0 0 10px;}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      if (_jspx_meth_sys_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<div id=\"content\" class=\"row-fluid\">\r\n");
      out.write("\t\t<div id=\"left\" class=\"accordion-group\">\r\n");
      out.write("\t\t\t<div class=\"accordion-heading\">\r\n");
      out.write("\t\t    \t<a class=\"accordion-toggle\">组织机构<i class=\"icon-refresh pull-right\" onclick=\"refreshTree();\"></i></a>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t\t<div id=\"ztree\" class=\"ztree\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"openClose\" class=\"close\">&nbsp;</div>\r\n");
      out.write("\t\t<div id=\"right\">\r\n");
      out.write("\t\t\t<iframe id=\"officeContent\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/sys/office/list?id=&parentIds=\" width=\"100%\" height=\"91%\" frameborder=\"0\"></iframe>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tvar setting = {data:{simpleData:{enable:true,idKey:\"id\",pIdKey:\"pId\",rootPId:'0'}},\r\n");
      out.write("\t\t\tcallback:{onClick:function(event, treeId, treeNode){\r\n");
      out.write("\t\t\t\t\tvar id = treeNode.pId == '0' ? '' :treeNode.pId;\r\n");
      out.write("\t\t\t\t\t$('#officeContent').attr(\"src\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/sys/office/list?id=\"+id+\"&parentIds=\"+treeNode.pIds);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction refreshTree(){\r\n");
      out.write("\t\t\t$.getJSON(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/sys/office/treeData\",function(data){\r\n");
      out.write("\t\t\t\t$.fn.zTree.init($(\"#ztree\"), setting, data).expandAll(true);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\trefreshTree();\r\n");
      out.write("\t\t \r\n");
      out.write("\t\tvar leftWidth = 180; // 左侧窗口大小\r\n");
      out.write("\t\tvar htmlObj = $(\"html\"), mainObj = $(\"#main\");\r\n");
      out.write("\t\tvar frameObj = $(\"#left, #openClose, #right, #right iframe\");\r\n");
      out.write("\t\tfunction wSize(){\r\n");
      out.write("\t\t\tvar strs = getWindowSize().toString().split(\",\");\r\n");
      out.write("\t\t\thtmlObj.css({\"overflow-x\":\"hidden\", \"overflow-y\":\"hidden\"});\r\n");
      out.write("\t\t\tmainObj.css(\"width\",\"auto\");\r\n");
      out.write("\t\t\tframeObj.height(strs[0] - 5);\r\n");
      out.write("\t\t\tvar leftWidth = ($(\"#left\").width() < 0 ? 0 : $(\"#left\").width());\r\n");
      out.write("\t\t\t$(\"#right\").width($(\"#content\").width()- leftWidth - $(\"#openClose\").width() -5);\r\n");
      out.write("\t\t\t$(\".ztree\").width(leftWidth - 10).height(frameObj.height() - 46);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxStatic}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/common/wsize.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/views/include/taglib.jsp(8,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    // /WEB-INF/views/include/taglib.jsp(8,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}${fns:getAdminPath()}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0, false));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f1.setParent(null);
    // /WEB-INF/views/include/taglib.jsp(9,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setVar("ctxStatic");
    // /WEB-INF/views/include/taglib.jsp(9,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/static", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
    if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
    return false;
  }

  private boolean _jspx_meth_sys_005fmessage_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sys:message
    org.apache.jsp.tag.websys.message_tag _jspx_th_sys_005fmessage_005f0 = (new org.apache.jsp.tag.websys.message_tag());
    _jsp_instancemanager.newInstance(_jspx_th_sys_005fmessage_005f0);
    _jspx_th_sys_005fmessage_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/views/modules/sys/officeIndex.jsp(13,1) name = content type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_sys_005fmessage_005f0.setContent((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    _jspx_th_sys_005fmessage_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_sys_005fmessage_005f0);
    return false;
  }
}
