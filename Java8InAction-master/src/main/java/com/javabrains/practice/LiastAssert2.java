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


public class LiastAssert2 {

	public static void main(String[] args){
		
		//Read the XML
		
		
		//Parse it and find the element
		//If that matches with reponse Code
		String actualValue = "";
		String expectedNode = "responseStatus";
		String expectedNodeAttr = "code";
		String expectedNodeAttrValue = "100";
		String actualAttValue = "";
		String actualAttName = "";
		try {
			
			//Read the Xml in to Document
			String filepath = "C:\\Users\\shavara1\\Documents\\DevTest_Java_Libs\\inputXml.xml";
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilderFactory.setNamespaceAware(true);
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.parse(filepath);
			document.normalize();
			
			//Check is the Expected node is present
			NodeList list = document.getElementsByTagNameNS("*", expectedNode);
			System.out.println("The Response Status found and size is = " + list.getLength());
			
			System.out.println("The Attritube at 2 = " + list.item(0).getAttributes().item(0).getNodeName());
			System.out.println("The Attritube at 2 = " + list.item(0).getAttributes().item(0).getNodeValue());

		        if(list.item(0).hasAttributes())
		    	{
		            //get the count for those attributes
		    		int attributeCount = list.item(0).getAttributes().getLength();
		            //iterate through all the attrbutes
		    		for (int attCount = 0; attCount < attributeCount; attCount++) {
		                // get the attribute name
			    		actualAttName = list.item(0).getAttributes().item(attCount).getNodeName();
			    		actualAttValue = list.item(0).getAttributes().item(attCount).getNodeValue();

			    		System.out.println("****The Attribute Names = " + actualAttName + "and Value = " + actualAttValue);
		                //get the values for those attribute
		                if (expectedNodeAttr.equals(actualAttName) && expectedNodeAttrValue.equals(actualAttValue))
		                    // testExec.setStateValue("ActRsp_"+attName, actualAttValue);
		                	System.out.println("ActRsp_"+actualAttName+ "" + actualAttValue);
		                
		    		}
		    	}
		
			
			
			   //Look for the particular element reponseStatus, ingnore the Namespace

		    
	
	
	 
	    
		    // Default value is Passed
		    //testExec.setStateValue("TC_Result", "Passed");
		    String getAllcomparisons = "";
		    // Will parametrise the ExpectedValue eventually
		    
		    System.out.println("ExpectedValue :"+expectedNodeAttrValue);
		    System.out.println("ActualValue :"+actualAttValue);
		    
//		    if (!expectedNodeAttrValue.equalsIgnoreCase(actualAttValue))
//		    {
//		        testExec.warn("Element:  Expected Value: "+expectedNodeAttrValue+ " Not Matching Actual Value: "+actualAttValue);
//		        testExec.setStateValue("TC_Result", "Failed");
//		      //  getAllcomparisons = getAllcomparisons + "Element: "+ pair.getKey()+" Expected Value: "+ExpectedValue+ " Not Matching Actual Value: "+ActualValue +"\n";
//		    }
//		    if (expectedNodeAttrValue.equalsIgnoreCase(actualAttValue))
//		    {
//		    	 testExec.warn("Element:  Expected Value: "+expectedNodeAttrValue+ " Matching Actual Value: "+actualAttValue);
//		      //  getAllcomparisons = getAllcomparisons + "Element: "+ pair.getKey()+" Expected Value: "+ExpectedValue+ " Not Matching Actual Value: "+ActualValue +"\n";
//		    }

		   // testExec.setStateValue("getAllcomparisons", getAllcomparisons);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("I dont care the error occured");
		}
	
	}
}

