package com.yicj.gen;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.yicj.gen.util.FileUtil;
import com.yicj.gen.util.FreemarketConfigUtils;


public class MainGen {
	
	public static void main(String[] args) throws Exception {
		genService();
	}
	
	public static void genService() throws Exception {
		String mainClassName = "User" ;
		String packageName = "com.yicj.demo" ;
		// 生成Entity填充数据
        Map<String, String> data = new HashMap<>();
        data.put("BasePackageName", packageName);
        data.put("DaoPackageName", "dao") ;
        data.put("EntityPackageName", "entity") ;
        data.put("ServicePackageName", "service");
        data.put("ClassName", mainClassName) ;
        data.put("Author", "yicj") ;
        data.put("Date", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        data.put("EntityName", "user") ;
        // 生成Entity文件
        FileUtil.generateToJava(FreemarketConfigUtils.TYPE_SERVICE, data, mainClassName + "Service.java");
	}
}