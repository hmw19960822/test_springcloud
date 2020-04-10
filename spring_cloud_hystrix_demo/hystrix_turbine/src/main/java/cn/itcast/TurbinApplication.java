package cn.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author 林俊杰
 * @create 2020-04-02 13:59
 */
@SpringBootApplication
//trubin配置
@EnableTurbine
@EnableHystrixDashboard
public class TurbinApplication {
    public static void main(String[] args) {
        SpringApplication.run(TurbinApplication.class,args);
    }
}
