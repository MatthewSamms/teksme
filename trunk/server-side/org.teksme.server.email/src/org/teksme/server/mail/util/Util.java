/*
 * Copyright 2010 Creative Works, Inc.
 * Creative Works licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.teksme.server.mail.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public final class Util {

	private static Log logger = LogFactory.getLog(Util.class);

	private Util() {
	}

	public static String generateChecksum(StringBuffer content) {
		String strSurveyContent = content.toString().trim();
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		md.update(strSurveyContent.getBytes(), 0, strSurveyContent.length());
		return new BigInteger(1, md.digest()).toString(16);
	}

	/**
	 * @param filePath
	 *            the name of the file to open. Not sure if it can accept URLs
	 *            or just filenames. Path handling could be better, and buffer
	 *            sizes are hardcoded
	 */
	public static String readFileAsString(String filePath)
			throws java.io.IOException {
		StringBuffer fileData = new StringBuffer(1000);
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		char[] buf = new char[1024];
		int numRead = 0;
		while ((numRead = reader.read(buf)) != -1) {
			fileData.append(buf, 0, numRead);
		}
		reader.close();
		return fileData.toString();
	}

	public static File getMailFolder() {

		boolean success = false;

		final String userHome = System.getProperty("user.home");

		final String fileName = userHome + File.separator
				+ MessagesBundle.getString("MAIL_STORE_FOLDER");

		File mailFile = new File(fileName);

		if (!mailFile.exists()) {
			success = (mailFile.mkdirs());
			if (success) {
				logger.info("Directories: " + fileName + " created");
			}
		}
		return mailFile;
	}

	public static File getSentFolder() {

		boolean success = false;

		final String userHome = System.getProperty("user.home");

		final String fileName = userHome + File.separator
				+ MessagesBundle.getString("SENT_STORE_FOLDER");

		File deployedFolder = new File(fileName);

		if (!deployedFolder.exists()) {
			success = (deployedFolder.mkdirs());
			if (success) {
				logger.info("Directories: " + fileName + " created");
			}
		}
		return deployedFolder;
	}

	public static File getLogFolder() {

		final String userHome = System.getProperty("user.home");

		boolean success = false;

		final String fileName = userHome + File.separator
				+ MessagesBundle.getString("LOG_STORE_FOLDER");

		File logFile = new File(fileName);

		if (!logFile.exists()) {
			success = (logFile.mkdirs());
			if (success) {
				logger.info("Directories: " + fileName + " created");
			}
		}
		return logFile;
	}

	public static File createTmpCopySurveyFile(File inFile) throws IOException {

		String property = "java.io.tmpdir";

		// Get the temporary directory and print it.
		String tempDir = System.getProperty(property);

		// File tmpFile = new File(tempDir + File.separator + "survey.xml");
		File tmpFile = new File(tempDir + File.separator + inFile.getName());

		InputStream in = new FileInputStream(inFile);

		// OutputStream out = new FileOutputStream(tmpFile,true);
		// For Overwrite the file.
		OutputStream out = new FileOutputStream(tmpFile);

		byte[] buf = new byte[1024];

		int len;

		while ((len = in.read(buf)) > 0) {

			out.write(buf, 0, len);

		}

		in.close();

		out.close();

		logger.info("Temporary file created from original survey file.");

		return tmpFile;
	}

	public static String getSurveyTitle(File surveyFile) throws IOException {
		BufferedReader buff = null;
		try {
			buff = new BufferedReader(new FileReader(surveyFile));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String str = null;
		String line = null;
		while ((line = buff.readLine()) != null) {
			if (line.contains("title=")) {
				str = line.substring(line.indexOf("title="),
						line.lastIndexOf("\""));
				str = str.replace("title=\"", "");
			}
		}

		return str;
	}

	public static void copyFile(File sourceFile, File destFile)
			throws IOException {
		if (!destFile.exists()) {
			destFile.createNewFile();
		}

		FileChannel source = null;
		FileChannel destination = null;
		try {
			source = new FileInputStream(sourceFile).getChannel();
			destination = new FileOutputStream(destFile).getChannel();
			destination.transferFrom(source, 0, source.size());
		} finally {
			if (source != null) {
				source.close();
			}
			if (destination != null) {
				destination.close();
			}
		}
	}

}// Util class
