package com.yunsheng.mqtt.init;

import com.yunsheng.mqtt.service.IMqttSubscribe;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * <desc>
 *      启动MQTT订阅
 * </desc>
 * @author yunsheng
 * @createDate 2018/12/7
 */
@Slf4j
@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Autowired
    private IMqttSubscribe iMqttSubscribe;

    String TOPIC = "MQTT_PRODUCER_TOPIC";

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        log.info(" MQTT Subscribe Server 开始...");
        iMqttSubscribe.subscribe(TOPIC);
    }
}
