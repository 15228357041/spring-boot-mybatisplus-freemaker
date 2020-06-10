package cn.chinau8.util;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;


/**
 * @Author:zxf
 * @Description
 * @Date: 2020/05/26 9:47
 */
public class MyDefaultHandler extends DefaultHandler {
    private String TAG="MyHandler";
    private String preTag ;//标志解析到哪一个节点
    private List<BooksBean> booksDatas;
    private BooksBean book;
    public List<BooksBean> getBooks()
    {
        return booksDatas;
    }


    @Override
    public void startDocument() throws SAXException {
        System.out.println("startDocument--开始解析");
        booksDatas = new ArrayList<BooksBean>();
    }
    /*
     uri: 命名空间
     localName: 不带命名空间的标签前缀名
     qName: 带命名空间的标签前缀名
     attributes: 属性集合
      */
    @Override
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {
        if("contact".equals(qName)){
            book = new BooksBean();
            book.setId(attributes.getValue("id"));
        }
        preTag=qName;
        System.out.println(TAG + "qName="+qName);
    }
    @Override
    public void characters(char[] ch, int start, int length)
            throws SAXException {
        if(book!=null){
            String data  = new String(ch, start, length);
            if("name".equals(preTag)){
                book.setName(data);
            }else if("age".equals(preTag)){
                book.setAge(data);
            }else if("email".equals(preTag)){
                book.setEmail(data);
            }
            else if("qq".equals(preTag)){
                book.setQq(data);
            }
            else if("phone".equals(preTag)){
                book.setPhone(data);
            }
        }
        System.out.println("DATA="+new String(ch, start, length));
    }
    @Override
    public void endElement(String uri, String localName, String qName)
            throws SAXException {
        if("contact".equals(qName)&&book!=null){
            booksDatas.add(book);
            book=null;
        }
        preTag=null;
        System.out.println(TAG + "qName="+qName);
    }
    @Override
    public void endDocument() throws SAXException {
        System.out.println(TAG +  "endDocument--结束解析");
    }

}