package com.google.gcloud.datastore;

import com.google.common.collect.ImmutableMap;

import java.io.Serializable;
import java.util.Map;

public abstract class BatchWriteOption implements Serializable {

  private static final long serialVersionUID = -3932758377282659839L;

  public static final class ForceWrites extends BatchWriteOption {

    private static final long serialVersionUID = 2555054296046232799L;

    private final boolean force;

    public ForceWrites(boolean force) {
      this.force = force;
    }

    public boolean force() {
      return force;
    }
  }

  BatchWriteOption() {
    // package protected
  }

  public static ForceWrites forceWrites() {
    return new ForceWrites(true);
  }

  static Map<Class<? extends BatchWriteOption>, BatchWriteOption> asImmutableMap(
      BatchWriteOption... options) {
    ImmutableMap.Builder<Class<? extends BatchWriteOption>, BatchWriteOption> builder =
        ImmutableMap.builder();
    for (BatchWriteOption option : options) {
      builder.put(option.getClass(), option);
    }
    return builder.build();
  }
}
