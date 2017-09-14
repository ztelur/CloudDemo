package starter;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by homer on 17-9-8.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(StorageAutoConfigure.class)
@Documented
public @interface EnableStorage {
}
