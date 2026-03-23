---
title: "PluginBase"
kind: "class"
package: "com.hypixel.hytale.server.core.plugin"
fqcn: "com.hypixel.hytale.server.core.plugin.PluginBase"
api_surface: true
extends: ~
implements:
  - "CommandOwner"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "plugin"
  - "base"
  - "lifecycle"
---

**Package:** `com.hypixel.hytale.server.core.plugin`

```java
public abstract class PluginBase implements CommandOwner
```

Base class for all server plugins (both Java plugins and scripted addons). Provides the plugin lifecycle (`NONE` -> `SETUP` -> `START` -> `ENABLED` -> `SHUTDOWN` -> `DISABLED`), registry accessors for commands, events, entities, tasks, entity store components, chunk store components, asset codecs, and config files.

Plugins access per-plugin registries that are automatically cleaned up on shutdown. Config files registered via `withConfig()` are auto-loaded during `preLoad()` and auto-registered with the schema generator.

## Methods

| Method | Signature |
|---|---|
| `getName` | `@Nonnull String getName()` |
| `getLogger` | `@Nonnull HytaleLogger getLogger()` |
| `getIdentifier` | `@Nonnull PluginIdentifier getIdentifier()` |
| `getManifest` | `@Nonnull PluginManifest getManifest()` |
| `getDataDirectory` | `@Nonnull Path getDataDirectory()` |
| `getState` | `@Nonnull PluginState getState()` |
| `getClientFeatureRegistry` | `@Nonnull ClientFeatureRegistry getClientFeatureRegistry()` |
| `getCommandRegistry` | `@Nonnull CommandRegistry getCommandRegistry()` |
| `getEventRegistry` | `@Nonnull EventRegistry getEventRegistry()` |
| `getEntityRegistry` | `@Nonnull EntityRegistry getEntityRegistry()` |
| `getTaskRegistry` | `@Nonnull TaskRegistry getTaskRegistry()` |
| `getEntityStoreRegistry` | `@Nonnull ComponentRegistryProxy<EntityStore> getEntityStoreRegistry()` |
| `getChunkStoreRegistry` | `@Nonnull ComponentRegistryProxy<ChunkStore> getChunkStoreRegistry()` |
| `getAssetRegistry` | `@Nonnull AssetRegistry getAssetRegistry()` |
| `getCodecRegistry` | `@Nonnull <T, C extends Codec<? extends T>> CodecMapRegistry<T, C> getCodecRegistry(@Nonnull StringCodecMapCodec<T, C> mapCodec)` |
| `getBasePermission` | `@Nonnull String getBasePermission()` |
| `isDisabled` | `boolean isDisabled()` |
| `isEnabled` | `boolean isEnabled()` |
| `preLoad` | `@Nullable CompletableFuture<Void> preLoad()` |
| `getType` | `@Nonnull abstract PluginType getType()` |

## Lifecycle Methods (Protected)

| Method | Description |
|---|---|
| `setup()` | Called during plugin setup phase. Override to register components, commands, and event listeners. |
| `start()` | Called after setup completes. Override for post-setup initialization. |
| `shutdown()` | Called during plugin shutdown. Override for cleanup. |