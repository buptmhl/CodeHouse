package bupt.xmlProcessor;

import org.dom4j.DocumentException;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

public interface XmlProcessorMap {
    /**
     * 将传输的信息转成XML文件
     * @param information :参数信息，包括数据集，模型参数等
     * @return xml文件
     */
    boolean generateXmlFile(Map information) throws URISyntaxException, InterruptedException, IOException;

    /**
     * 将传输的XML文件解析成List或Map
     * @param xmlFile: xml文件
     * @return 由xml文件解析的List或Map
     */
    Map analyzeXmlFile(File xmlFile) throws DocumentException;

}
