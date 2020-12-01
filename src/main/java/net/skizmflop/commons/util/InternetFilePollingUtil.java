//package net.skizmflop.commons.util;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.nio.channels.Channels;
//import java.nio.channels.FileChannel;
//import java.nio.channels.ReadableByteChannel;
//
//import net.skizmflop.commons.exception.SFBadUrlException;
//import net.skizmflop.commons.exception.SFIOException;
//
//public class InternetFilePollingUtil {
//	
//	public File downloadFile(String urlStr, String filename) {
//		
//		FileUtils.copy
//		
//		try { 
//			URL url = new URL(urlStr); 
//			ReadableByteChannel readableByteChannel = Channels.newChannel(url.openStream());
//			
//			FileOutputStream fileOutputStream = new FileOutputStream(filename);
//			FileChannel fileChannel = fileOutputStream.getChannel();
//			
//			fileChannel.transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
//			fileChannel.transferTo(0, Long.MAX_VALUE, fileOutputStream);
//		}catch(MalformedURLException ex1) {
//			throw new SFBadUrlException("Unable to form URL.  Check urlStr parameter.", ex1);
//		}catch (IOException ex2) {
//			throw new SFIOException("Unable to read file.", ex2);
//		}
//	}
//
//}
