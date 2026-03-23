---
title: "WorldLocationProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.config.worldlocationproviders"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.config.worldlocationproviders.WorldLocationProvider"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "adventure"
  - "objectives"
  - "config"
  - "worldlocationproviders"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.config.worldlocationproviders`

```java
public abstract class WorldLocationProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static final` | `CodecMapCodec<WorldLocationProvider>` | `CODEC` |
| `@Nonnull public static final` | `BuilderCodec<WorldLocationProvider>` | `BASE_CODEC` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public abstract` | `Vector3i` | `runCondition(@Nonnull World var1, @Nonnull Vector3i var2)` |
| `@Override public abstract` | `boolean` | `equals(Object var1)` |
| `@Override public abstract` | `int` | `hashCode()` |
| `@Nonnull @Override public` | `String` | `toString()` |
