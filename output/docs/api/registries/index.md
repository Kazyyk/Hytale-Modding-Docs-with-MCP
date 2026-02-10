---
title: "Registry System"
kind: "overview"
package: "com.hypixel.hytale.registry"
api_surface: "public"
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - "registries"
  - "overview"
  - "lifecycle"
---

> Package: `com.hypixel.hytale.registry` (base) + `com.hypixel.hytale.server.core.plugin.registry` (plugin registries)

Hytale uses a three-layer registry architecture for managing plugin registrations with automatic lifecycle cleanup.

## Architecture

### Layer 1: Generic Registry Base

`Registry<T extends Registration>` provides lifecycle-aware registration:

- **Precondition checking** — Registration only allowed when conditions are met (e.g., plugin not disabled)
- **Shutdown cleanup** — All registrations automatically unregistered in LIFO order on shutdown
- **Enable/disable** — Registries can be enabled and disabled independently
- **Registration wrapping** — Returned handles include lifecycle management

`Registration` is the base handle class with `isEnabled()` and `unregister()` methods.

### Layer 2: Plugin-Specific Registries

Each subsystem has a registry class that wraps domain-specific APIs:

| Registry | Extends | Delegates To |
|----------|---------|-------------|
| `EventRegistry` | `Registry<EventRegistration>` | `EventBus` |
| `CommandRegistry` | `Registry<CommandRegistration>` | `CommandManager` |
| `BlockStateRegistry` | `Registry<BlockStateRegistration>` | `BlockStateModule` |
| `ComponentRegistryProxy` | implements `IComponentRegistry` | `ComponentRegistry` |
| `CodecMapRegistry` | implements `IRegistry` | `StringCodecMapCodec` |
| `MapKeyMapRegistry` | implements `IRegistry` | `MapKeyMapCodec` |
| `AssetRegistry` | — | static `AssetRegistry` |

All follow the same pattern: delegate registration to a global backend while tracking cleanup callbacks for plugin shutdown.

### Layer 3: Global Backends

Static singleton registries that hold the actual data:

- `EventBus` — Global event dispatch
- `CommandManager` — Singleton command dispatcher
- `ComponentRegistry<EntityStore>` — Static shared ECS registry for entity components
- `ComponentRegistry<ChunkStore>` — Static shared ECS registry for chunk components
- `AssetRegistry` (at `com.hypixel.hytale.assetstore`) — Global asset store mapping

## Plugin Access

All registries are accessed through `PluginBase` methods:

| Method | Returns | Domain |
|--------|---------|--------|
| `getEventRegistry()` | `EventRegistry` | Event listeners |
| `getCommandRegistry()` | `CommandRegistry` | Commands |
| `getBlockStateRegistry()` | `BlockStateRegistry` | Custom block states |
| `getEntityRegistry()` | `EntityRegistry` | Entity types |
| `getTaskRegistry()` | `TaskRegistry` | Scheduled tasks |
| `getEntityStoreRegistry()` | `ComponentRegistryProxy<EntityStore>` | Entity ECS |
| `getChunkStoreRegistry()` | `ComponentRegistryProxy<ChunkStore>` | Chunk ECS |
| `getAssetRegistry()` | `AssetRegistry` | Asset stores |
| `getCodecRegistry(StringCodecMapCodec)` | `CodecMapRegistry` | String-keyed codecs |
| `getCodecRegistry(AssetCodecMapCodec)` | `CodecMapRegistry.Assets` | Asset codecs |
| `getCodecRegistry(MapKeyMapCodec)` | `MapKeyMapRegistry` | Class-keyed codecs |
| `getClientFeatureRegistry()` | `ClientFeatureRegistry` | Client features |
| `withConfig(BuilderCodec<T>)` | `Config<T>` | Plugin JSON config |

## Registration Flow Example

```java
// 1. Plugin calls registry method
CommandRegistration reg = getCommandRegistry().registerCommand(myCommand);

// 2. Registry checks precondition (plugin not disabled)
// 3. Registry delegates to global backend (CommandManager.get().register(command))
// 4. Registry wraps result with lifecycle tracking
// 5. On plugin shutdown, all tracked registrations are unregistered in LIFO order
```

## Asset System

Assets are game data loaded from JSON files in asset packs. Key types:

- `AssetMap<K, T>` — Storage and indexing layer for assets with key-based lookup, path tracking, and tag-based grouping
- `AssetStore` — Manages loading/unloading for one asset type
- `AssetRegistry` (static) — Maps asset classes to `AssetStore` instances

Plugin access: `PluginBase.getAssetRegistry().register(assetStore)`

## Related

- **[Registry](../classes/Registry.md)** — Generic base class
- **[Registration](../classes/Registration.md)** — Base registration handle
- **[EventRegistry](../classes/EventRegistry.md)** — Event registration
- **[CommandRegistry](../classes/CommandRegistry.md)** — Command registration
- **[ComponentRegistryProxy](../classes/ComponentRegistryProxy.md)** — ECS registration
