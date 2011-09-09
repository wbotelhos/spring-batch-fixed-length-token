package br.com.wbotelhos.spring.batch.listener;

import org.apache.log4j.Logger;
import org.springframework.batch.core.listener.ItemListenerSupport;
import org.springframework.stereotype.Component;

@Component("itemFailureLoggerListener")
public class ItemFailureLoggerListener extends ItemListenerSupport<Object, Object> {

	private final static Logger logger = Logger.getLogger(ItemFailureLoggerListener.class);

	@Override
	public void onReadError(Exception e) {
		logger.error("Error on read: ", e);
	}

	public void onWriteError(Exception e, Object item) {
		logger.error("Error on write: ", e);
	}

}
