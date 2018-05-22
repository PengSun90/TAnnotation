package example.tb.com.tannotation;

import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.view.View;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @auther tb
 * @time 2018/3/20 下午2:09
 * @desc 绑定view的id或者layout的id，包含findViewById和setContentView两个功能
 */
@Retention(RUNTIME)
@Target({FIELD, TYPE})
public @interface BindId {
    /**
     * 需要绑定的view或者layout的id
     * @return
     */
    int value() default View.NO_ID;
}
