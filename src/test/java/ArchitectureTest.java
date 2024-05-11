import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.jupiter.api.Test;
l
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

public class ArchitectureTest {
    @Test
    public void ControllerAccessModels() {
        JavaClasses importedClasses = new ClassFileImporter().importPackages("controllers");
        System.out.println(importedClasses.size());
        importedClasses.forEach((JavaClass c) -> {
            System.out.println(c.getFullName());
        });

        ArchRule rule = classes().that().haveNameMatching("Controller")
                        .should().resideInAPackage("controllers");

        rule.check(importedClasses);
    }
}
