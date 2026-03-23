---
title: "PendingLoadPlugin"
kind: "class"
package: "com.hypixel.hytale.server.core.plugin.pending"
fqcn: "com.hypixel.hytale.server.core.plugin.pending.PendingLoadPlugin"
api_surface: false
extends: ~
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
public abstract class PendingLoadPlugin
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `PluginIdentifier` | `identifier` |
| `@Nonnull private final` | `PluginManifest` | `manifest` |
| `@Nullable private final` | `Path` | `path` |

## Constructors

| Modifier | Signature |
|---|---|
| `` | `PendingLoadPlugin(@Nullable Path path, @Nonnull PluginManifest manifest)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `PluginIdentifier` | `getIdentifier()` |
| `@Nonnull public` | `PluginManifest` | `getManifest()` |
| `@Nullable public` | `Path` | `getPath()` |
| `public abstract` | `PendingLoadPlugin` | `createSubPendingLoadPlugin(PluginManifest var1)` |
| `@Nonnull public abstract` | `PluginBase` | `load()` |
| `@Nonnull public` | `List<PendingLoadPlugin>` | `createSubPendingLoadPlugins()` |
| `public` | `boolean` | `dependsOn(PluginIdentifier identifier)` |
| `public abstract` | `boolean` | `isInServerClassPath()` |
| `@Override public` | `boolean` | `equals(@Nullable Object o)` |
| `@Override public` | `int` | `hashCode()` |
| `@Nonnull @Override public` | `String` | `toString()` |
| `@Nonnull public static` | `List<PendingLoadPlugin>` | `calculateLoadOrder(@Nonnull Map<PluginIdentifier, PendingLoadPlugin> pending)` |

## Inner Types

- `PendingLoadPlugin.EntryNode`
