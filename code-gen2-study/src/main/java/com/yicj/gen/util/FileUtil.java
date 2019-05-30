package com.yicj.gen.util;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class FileUtil {
	//
	//private final static String PATH_RELEASE = "C:\\Users\\yicj\\Desktop\\";
	private final static String PATH_RELEASE = "E:\\code2\\java8\\company\\step3\\java-collection\\code-gen2-study\\src\\main\\java\\" ;
	/**
	 * @param type     使用模板类型
	 * @param data     填充数据
	 * @param fileName 输出文件名
	 * @throws IOException
	 * @throws TemplateException
	 */
	public static void generateToJava(int type, Object data, String fileName) throws IOException, TemplateException {
		Template tpl = getTemplate(type); // 获取模板文件
		// 填充数据
		StringWriter writer = new StringWriter();
		tpl.process(data, writer);
		writer.flush();
		// 写入文件
		FileOutputStream fos = new FileOutputStream(PATH_RELEASE + fileName);
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw, 1024);
		
		tpl.process(data, bw);
		fos.close();
	}

	/**
	 * 获取模板
	 * 
	 * @param type 模板类型
	 * @return
	 * @throws IOException
	 */
	private static Template getTemplate(int type) throws IOException {
		switch (type) {
		case FreemarketConfigUtils.TYPE_ENTITY:
			return FreemarketConfigUtils.getInstance().getTemplate("Entity.ftl");
		case FreemarketConfigUtils.TYPE_DAO:
			return FreemarketConfigUtils.getInstance().getTemplate("Dao.ftl");
		case FreemarketConfigUtils.TYPE_SERVICE:
			return FreemarketConfigUtils.getInstance().getTemplate("Service.ftl");
		case FreemarketConfigUtils.TYPE_CONTROLLER:
			return FreemarketConfigUtils.getInstance().getTemplate("Controller.ftl");
		case FreemarketConfigUtils.TYPE_MAPPER:
			return FreemarketConfigUtils.getInstance().getTemplate("Mapper.ftl");
		default:
			return null;
		}
	}

}