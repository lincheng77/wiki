# 十下知识库
## 一、项目tips
### 1. 设置本项目阿里云maven仓库项

    <repositories>
        <repository>
            <id>aliyun</id>
            <name>aliyun central Repository</name>
            <url>https://maven.aliyun.com/repository/central</url>
        </repository>
    </repositories>
### 2. mybatis插件
#### 2.1 插件pom配置

#### 2.2 插件启动配置

### 3. 好用工具类
#### 3.1 CopyUtil.java
    import org.springframework.beans.BeanUtils;
    import org.springframework.util.CollectionUtils;
    
    import java.util.ArrayList;
    import java.util.List;
    
    public class CopyUtil {

        /**
         * 单体复制
         */
        public static <T> T copy(Object source, Class<T> clazz) {
            if (source == null) {
                return null;
            }
            T obj = null;
            try {
                obj = clazz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
            BeanUtils.copyProperties(source, obj);
            return obj;
        }

        /**
         * 列表复制
         */
        public static <T> List<T> copyList(List source, Class<T> clazz) {
            List<T> target = new ArrayList<>();
            if (!CollectionUtils.isEmpty(source)){
                for (Object c: source) {
                    T obj = copy(c, clazz);
                    target.add(obj);
                }
            }
            return target;
        }
    }



