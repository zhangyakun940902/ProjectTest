package com.test;

import java.util.HashMap;
import java.util.Map;


public class splittest {

	public static void main(String[] args) {
		
		String dataFilePath="/home";
		String tabName = "usertab";
		String datatype = "add";

		String str = "dataFilePath=" + dataFilePath + "&##&tableName=" + tabName+"&##&datatype="+datatype;
		String[] paramArray = str.split("&##&");
		Map<String, String> paramMap = new HashMap<String, String>();
		for (String param : paramArray) {
			paramMap.put(param.split("=")[0].trim(),param.split("=")[1].trim());
		}
		System.out.println(paramMap.get("dataFilePath"));
		System.out.println(paramMap.get("tableName"));
		System.out.println(paramMap.get("datatype"));

	}

}
