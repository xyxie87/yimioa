package cn.js.fan.module.cms.plugin.wiki;

import javax.servlet.http.HttpServletRequest;

import com.redmoon.oa.fileark.DocContent;
import com.redmoon.oa.fileark.plugin.base.IPluginRender;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2005</p>
 *
 * <p>Company: </p>
 *
 * @author not attributable
 * @version 1.0
 */
public class WikiRender implements IPluginRender {
    public WikiRender() {
    }

    /**
     * RenderContent
     *
     * @param request HttpServletRequest
     * @param dc DocContent
     * @return String
     * @todo Implement this cn.js.fan.module.cms.plugin.base.IPluginRender
     *   method
     */
    public String RenderContent(HttpServletRequest request, DocContent dc) {
        String content = dc.getContent();
        return content;
    }
}
