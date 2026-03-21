---
title: "WorldPathConfig"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.path"
fqcn: "com.hypixel.hytale.server.core.universe.world.path.WorldPathConfig"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "path"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.path`

```java
public class WorldPathConfig
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<WorldPathConfig>` | `CODEC` |
| `protected` | `Map<String,WorldPath>` | `paths` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `WorldPath` | `getPath(String name)` |
| `@Nonnull public` | `Map<String,WorldPath>` | `getPaths()` |
| `@Nullable public` | `WorldPath` | `putPath(WorldPath worldPath)` |
| `public` | `WorldPath` | `removePath(String path)` |
| `@Nonnull public` | `CompletableFuture<Void>` | `save(World world)` |
| `@Nonnull public static` | `CompletableFuture<WorldPathConfig>` | `load(World world)` |
| `@Nonnull @Override public` | `String` | `toString()` |
