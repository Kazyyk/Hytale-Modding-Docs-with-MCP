---
title: "PluginBase"
kind: "class"
package: "com.hypixel.hytale.server.core.plugin"
fqcn: "com.hypixel.hytale.server.core.plugin.PluginBase"
api_surface: true
extends: null
implements: ["CommandOwner"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "plugin"
  - "core"
---

**Package:** `com.hypixel.hytale.server.core.plugin`

```java
public abstract class PluginBase implements CommandOwner
```

Abstract base class for all server plugins. Provides lifecycle management (setup, start, shutdown), and registries for commands, events, entities, ECS components/resources, assets, codecs, block states, and tasks. Each plugin has an identifier, manifest, logger, data directory, and state machine.

## Lifecycle

The plugin progresses through states: `NONE` -> `SETUP` -> `START` -> `ENABLED` -> `SHUTDOWN` -> `DISABLED`. On error, transitions to `FAILED`.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `String` | `getName()` |
| `@Nonnull public` | `HytaleLogger` | `getLogger()` |
| `@Nonnull public` | `PluginIdentifier` | `getIdentifier()` |
| `@Nonnull public` | `PluginManifest` | `getManifest()` |
| `@Nonnull public` | `Path` | `getDataDirectory()` |
| `@Nonnull public` | `PluginState` | `getState()` |
| `@Nonnull public` | `ClientFeatureRegistry` | `getClientFeatureRegistry()` |
| `@Nonnull public` | `CommandRegistry` | `getCommandRegistry()` |
| `@Nonnull public` | `EventRegistry` | `getEventRegistry()` |
| `@Nonnull public` | `BlockStateRegistry` | `getBlockStateRegistry()` |
| `@Nonnull public` | `EntityRegistry` | `getEntityRegistry()` |
| `@Nonnull public` | `TaskRegistry` | `getTaskRegistry()` |
| `@Nonnull public` | `ComponentRegistryProxy<EntityStore>` | `getEntityStoreRegistry()` |
| `@Nonnull public` | `ComponentRegistryProxy<ChunkStore>` | `getChunkStoreRegistry()` |
| `@Nonnull public` | `AssetRegistry` | `getAssetRegistry()` |
| `public` | `boolean` | `isDisabled()` |
| `public` | `boolean` | `isEnabled()` |
| `@Nonnull public abstract` | `PluginType` | `getType()` |
| `@Nullable public` | `CompletableFuture<Void>` | `preLoad()` |
| `@Nonnull protected final <T>` | `Config<T>` | `withConfig(@Nonnull BuilderCodec<T> configCodec)` |
| `@Nonnull protected final <T>` | `Config<T>` | `withConfig(@Nonnull String name, @Nonnull BuilderCodec<T> configCodec)` |
