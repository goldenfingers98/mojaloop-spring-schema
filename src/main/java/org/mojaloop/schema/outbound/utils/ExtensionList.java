package org.mojaloop.schema.outbound.utils;

import java.util.List;

import org.mojaloop.schema.common.utils.ExtensionItem;

/**
 * Data model for the complex type ExtensionList. An optional list of extensions, specific to deployment.
 */
public class ExtensionList {

    private List<ExtensionItem> extension;

    public ExtensionList() {
    }

    public List<ExtensionItem> getExtension() {
        return extension;
    }

    public void setExtension(List<ExtensionItem> extension) {
        this.extension = extension;
    }
    
}
