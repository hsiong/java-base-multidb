package tech.ynfy.frame.config.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import tech.ynfy.frame.module.Result;

/**
 * 全局异常处理器
 *
 * @author yyx
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
	private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	/**
	 * 基础异常
	 */
	@ExceptionHandler(Exception.class)
	public Result baseException(Exception e) {
		log.error(e.getMessage(), e);
		return Result.error(String.format("系统异常-请联系管理员：%s", e.getMessage()));
	}
}
