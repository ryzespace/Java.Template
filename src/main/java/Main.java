import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_33);
        cfg.setClassForTemplateLoading(Main.class, "/templates");
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

        // przykład - wybierz login.ftl lub register.ftl
        Template template = cfg.getTemplate("register.ftl");

        Map<String, Object> data = new HashMap<>();
        data.put("title", "Formularz rejestracji");

        StringWriter writer = new StringWriter();
        template.process(data, writer);

        System.out.println(writer.toString());
    }
}
