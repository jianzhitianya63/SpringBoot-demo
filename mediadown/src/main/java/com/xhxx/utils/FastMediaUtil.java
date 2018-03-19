package com.xhxx.utils;

import org.csource.common.MyException;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * FastDFS媒体文件相关操作
 * 
 * @author zhang
 *
 */
@Component 
public class FastMediaUtil {
	
	@Value("${media.upload.server.path}")
	private String mediaServer;
	
	@Value("${server.mediaPath}")
	private String mediaPath;

	
	/**
	 * FastDF配置路径
	 */
	private static String conf_filename = "config/fdfs_client.conf";
	private static Logger logger = LoggerFactory.getLogger(FastMediaUtil.class);

	@Value("${media.upload.fastdfs.group}")
	private static String GROUP;

	/**
	 * 上传文件到FastDFS服务并返回路径
	 * 
	 * @param fileUrl
	 * @return
	 * @throws IOException
	 */
	public String uploadFileFastDFS(String fileUrl) throws IOException, NullPointerException{
		byte[] fileBytes = HttpClientUtil.imageDownload(fileUrl);
		if (fileBytes == null || fileBytes.length < 1) {
			throw new NullPointerException("download media from remote failed![media url:" + fileUrl + "]");
		}
		String[] fileInfo = getMetainfo(fileUrl);
		return mediaUplaod(fileBytes, fileInfo);
	}

	/**
	 * 上传媒体资源到FastDFS
	 * 
	 * @param fileBytes
	 */
	public String mediaUplaod (byte[] fileBytes, String[] fileInfo) {
		String mediaPath = null;
		try {
			FastDFSClient client = new FastDFSClient(conf_filename);
			NameValuePair[] metaList = new NameValuePair[3];
			metaList[0] = new NameValuePair("fileName", fileInfo[0]);
			metaList[1] = new NameValuePair("fileExtName", fileInfo[1]);
			metaList[2] = new NameValuePair("fileLength", String.valueOf(fileBytes.length));
			mediaPath = client.uploadFile(GROUP,fileBytes, fileInfo[1], metaList);
		} catch (IOException | MyException e) {
			logger.error("upload to FastFDS failed! failed reason:", e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mediaPath;
	}

	/**
	 * 重置文件信息
	 *
	 * @param url
	 * @return
	 */
	public static String[] getMetainfo(String url) {
		String fileName = RegexHelper.getFileNameFromUrl(url);
		String info[] = new String[2];
		info[0] = RegexHelper.getFileNameFromUrl(url);
		if (fileName == null || fileName.isEmpty()) {
			info[1] = "";
			return info;
		}
		int fileLen = fileName.length();
		info[1] = fileName.substring(fileName.lastIndexOf(".") < fileLen - 1 ? fileName.lastIndexOf(".") + 1 : fileLen - 1);
		return info;
	}
}
