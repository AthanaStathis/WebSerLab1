import x.serlab.plugin.ProductsHandler;
import x.serlab.spi.URLHandler;

module plugin {
    exports x.serlab.plugin;
    requires x.serlab.spi;
    requires x.serlab.jpa;
    requires x.serlab.fileutils;
    provides URLHandler with ProductsHandler;
}