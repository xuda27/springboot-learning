package cn.eden.springboot.producer;
/**
 * 消息生产者
 * @author Eden
 *
 */
public interface AMQPProducerService {
	/**
	 * 发送消息
	 * @param msg
	 */
	public void sendMessage(String msg);
}
