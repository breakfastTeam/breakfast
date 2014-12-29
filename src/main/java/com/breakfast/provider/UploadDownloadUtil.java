package com.breakfast.provider;

import org.apache.commons.codec.net.URLCodec;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * 上传下载实用类
 * 
 * @author LIU Fangran
 * 
 */
public class UploadDownloadUtil {

	public static final URLCodec URL_CODEC = new URLCodec();

	/**
	 * 转换文件名称，解决中文乱码问题。
	 * 
	 * @param fileName
	 *            输入文件名
	 * @param request
	 *            Http请求。
	 * @return 转换后的文件名称
	 * @throws Exception
	 */
	public static String toAttachmentFileName(String fileName,
			HttpServletRequest request) {
		String userAgent = request.getHeader("User-Agent");
		return toAttachmentFileName(fileName, userAgent);
	}

	/**
	 * 转换文件名称，解决中文乱码问题。
	 * 
	 * @param fileName
	 *            输入文件名
	 * @param userAgent
	 *            HTTP请求头中的 User-Agent
	 * @return 转换后的文件名称
	 * @throws Exception
	 */
	public static String toAttachmentFileName(String fileName, String userAgent) {
		try {

			if (StringUtils.isEmpty(userAgent)) {
				return URL_CODEC.encode(fileName);
			}

			if (userAgent.contains("Firefox")) {
				// return MimeUtility.encodeText(fileName, "ISO-8859-1", "B");
				String result = new String(fileName.getBytes("UTF-8"),
						"ISO8859-1");
				result = result.replaceAll(" ", "_");
				return result;
			}

			if (userAgent.contains("Chrome")) {
				String result = new String(fileName.getBytes("UTF-8"),
						"ISO8859-1");
				return result;
			}
			// IE
			String result = URL_CODEC.encode(fileName);
			result = result.replaceAll("[+]", " ");
			return result;

		} catch (Exception e) {
			return fileName;
		}

	}
}
