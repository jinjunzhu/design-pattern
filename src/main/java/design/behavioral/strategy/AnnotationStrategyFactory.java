package design.behavioral.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class AnnotationStrategyFactory {

    private static Logger logger = LoggerFactory.getLogger(AnnotationStrategyFactory.class);

    static Map<String, AnnotationStrategy> map = new HashMap<>(3);

    static {
        File classPath = new File("./target/classes/design/behavioral/strategy");
        String clsspath = "design.behavioral.strategy";
        if (classPath.exists()) {
            for (File file : classPath.listFiles()){
                String fileName = file.getName();
                if (fileName.endsWith(".class")) {
                    fileName = fileName.replace(".class", "");
                    try {
                        Class<?> classZ = Class.forName(clsspath + "." + fileName);
                        if (classZ.isAnnotationPresent(Strategic.class)){
                            map.put(classZ.getAnnotation(Strategic.class).value(), (AnnotationStrategy)classZ.newInstance());
                        }
                    } catch (Exception e) {
                        logger.error("exception：", e);
                    }
                }
            }
        }
    }

    public static AnnotationStrategy getAnnotationStrategy(String type) {
        return map.get(type);
    }
}
