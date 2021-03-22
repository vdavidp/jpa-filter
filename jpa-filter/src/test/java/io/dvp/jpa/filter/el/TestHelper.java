package io.dvp.jpa.filter.el;

import static io.dvp.jpa.filter.el.ContextItem.MULTIPLIER;

import java.util.EnumMap;
import java.util.Map;

public class TestHelper {
  public static final Map<ContextItem, Object> IDENTITY_CONTEXT;

  static {
    IDENTITY_CONTEXT = new EnumMap<>(ContextItem.class);
    IDENTITY_CONTEXT.put(MULTIPLIER, 1);
  }
}
