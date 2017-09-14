package com.spf.mapper.mybatis;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/** 单列模式获取 properties 配置文件
 * @Auther SPF
 * @Create 2017/7/21
 */
public class PropertiesUtils {
    private static PropertiesUtils pu;
    private static Properties properties = new Properties();

    /** 单列模式必须私有构造器
     * 三种获取配置文件的方法
     * 1. 通过获取文件路径再用 InputStream 读取配置文件
     *   String path = URLDecoder.decode(PropertiesUtils.class.getResource("/jdbc.properties").getFile(),"UTF-8");
     *   InputStream is = new FileInputStream(path);
     * 2. 直接通过 PropertiesUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
     *    获取 InputStream 流（此方法适用于单个模块的项目）
     * 3. 通过 file.getAbsolutePath(); 读取配置文件路径 再用 InputStream 流读取配置文件（此方法适用于多模块）
     */
    private PropertiesUtils(){
        InputStream is = null;
        try {
            File file = new File("dubbo-mapper/target/classes/jdbc.properties");
            String path = file.getAbsolutePath();
            is = new FileInputStream(path);
            properties.load(is);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static PropertiesUtils getInstance(){
        if (pu == null) {
            pu = new PropertiesUtils();
        }
        return pu;
    }

    public Object getString(String key) {
        return properties.get(key);
    }

    public static void main(String[] args) {
        PropertiesUtils propertiesUtils = PropertiesUtils.getInstance();
        Object obj = propertiesUtils.getString("jdbc.url");
        System.out.println(obj);
    }

}
