package com.example.demo.framework.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ロガーのラッパークラス<br>
 * 各処理からはこのクラスを利用すること。
 * @author ky_yk_d
 *
 */
public class LoggerWrapper {
	private final Logger logger;
	private LoggerWrapper(Class<?> clazz) {
		this.logger = LoggerFactory.getLogger(clazz);
	}
	public static LoggerWrapper getLogger(Class<?> clazz) {
		return new LoggerWrapper(clazz);
	}
	public void debug(String format, Object... args) {
		logger.debug(format, args);
	}
    public void info(String format, Object... args) {
        logger.info(format, args);
    }
    public void warn(String format, Object... args) {
        logger.warn(format, args);
    }
    public void error(String format, Object... args) {
        logger.error(format, args);
    }
    public void error(String msg, Throwable t) {
        logger.error(msg, t);
    }
}
