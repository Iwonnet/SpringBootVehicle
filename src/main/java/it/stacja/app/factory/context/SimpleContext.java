package it.stacja.app.factory.context;

import org.reflections.ReflectionUtils;
import org.reflections.Reflections;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SimpleContext {

  private final String prefix;

  public SimpleContext(String prefix) {
    this.prefix = prefix;
    init();
  }

  private void init() {
    Reflections reflections = new Reflections(this.prefix);

    Set<Class<?>> annotatedWith = reflections.getTypesAnnotatedWith(Component.class);
    annotatedWith.stream().forEach(aClass -> resolve(aClass));

  }

  private Object resolve(Class<?> classType) {

  Constructor<?>[] constructors = classType.getConstructors();

    return null;
  }


}
