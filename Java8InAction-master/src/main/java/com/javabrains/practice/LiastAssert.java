package com.javabrains.practice;

import java.io.*;
import java.util.*;
import javax.xml.*;
import org.xml.sax.InputSource;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
//import com.itko.lisa.vse.stateful.model.Request;
//import com.itko.util.ParameterList;
//import com.itko.tdm.framework.builder.query.*;
//import com.itko.tdm.framework.dto.*;
import org.junit.Assert.*;


public class LiastAssert {

	public static void main(String[] args){
		
		//Read the XML
		
		
		//Parse it and find the element
		//If that matches with reponse Code
		
		try {
			Node responseCodeNode = null;
			
			NamedNodeMap attributeMap = new NamedNodeMap() {
				
				@Override
				public Node setNamedItemNS(Node arg) throws DOMException {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Node setNamedItem(Node arg) throws DOMException {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Node removeNamedItemNS(String namespaceURI, String localName) throws DOMException {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Node removeNamedItem(String name) throws DOMException {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Node item(int index) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Node getNamedItemNS(String namespaceURI, String localName) throws DOMException {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Node getNamedItem(String name) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public int getLength() {
					// TODO Auto-generated method stub
					return 0;
				}
			};
			
			String filepath = "C:\\Users\\shavara1\\Documents\\DevTest_Java_Libs\\inputXml.xml";
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilderFactory.setNamespaceAware(true);
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.parse(filepath);
			
			NodeList list = document.getElementsByTagNameNS("*", "responseStatus");
			System.out.println(list.getLength());
			
			if(list.getLength()==0)
			{
				list.item(0).getAttributes();
				System.out.println("The Response Code = " + responseCodeNode);
			}
			attributeMap = list.item(0).getAttributes();
			Node resultNode = attributeMap.getNamedItem("code");
			System.out.println("The Response Code = " + resultNode.getNodeValue());
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("I dont care the error occured");
		}
	
	}
}

