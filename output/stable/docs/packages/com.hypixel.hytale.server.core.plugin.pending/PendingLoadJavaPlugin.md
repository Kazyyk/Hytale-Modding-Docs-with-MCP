---
title: "PendingLoadJavaPlugin"
kind: "class"
package: "com.hypixel.hytale.server.core.plugin.pending"
fqcn: "com.hypixel.hytale.server.core.plugin.pending.PendingLoadJavaPlugin"
api_surface: false
extends: "PendingLoadPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "plugin"
  - "pending"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.plugin.pending`

```java
public class PendingLoadJavaPlugin extends PendingLoadPlugin
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `HytaleLogger` | `LOGGER` |
| `@Nonnull private final` | `PluginClassLoader` | `urlClassLoader` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `PendingLoadJavaPlugin(@Nullable Path path, @Nonnull PluginManifest manifest, @Nonnull PluginClassLoader urlClassLoader)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `PendingLoadPlugin` | `createSubPendingLoadPlugin(@Nonnull PluginManifest manifest)` |
| `@Override public` | `boolean` | `isInServerClassPath()` |
| `@Nonnull public` | `JavaPlugin` | `load()` |
| `@Nonnull @Override public` | `String` | `toString()` |
