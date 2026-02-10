---
title: "API Reference"
kind: "overview"
api_surface: "public"
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - "api"
  - "overview"
---

> 811 plugin-facing types across the Hytale server API.

## Plugin Lifecycle

All plugins extend `PluginBase` and follow a three-phase lifecycle:

```java
public class MyPlugin extends PluginBase {

    public MyPlugin(JavaPluginInit init) {
        super(init);
        // withConfig() must be called here (before setup)
    }

    @Override
    protected void setup() {
        // Register commands, events, ECS components, codecs
        // Server is not yet fully started
    }

    @Override
    protected void start() {
        // Server is running — safe to query world state
    }

    @Override
    protected void shutdown() {
        // Clean up resources
        // All registrations are auto-unregistered
    }
}
```

## Plugin Registries

`PluginBase` exposes scoped registries for each subsystem. All registrations are automatically cleaned up when the plugin shuts down.

| Registry | Access Method | Domain |
|----------|--------------|--------|
| [EventRegistry](events/index.md) | `getEventRegistry()` | Event listeners |
| [CommandRegistry](commands/index.md) | `getCommandRegistry()` | Commands |
| [ComponentRegistryProxy](components/index.md) | `getEntityStoreRegistry()` | ECS components/systems for entities |
| ComponentRegistryProxy | `getChunkStoreRegistry()` | ECS components/systems for chunks |
| BlockStateRegistry | `getBlockStateRegistry()` | Custom block states |
| EntityRegistry | `getEntityRegistry()` | Entity type registration |
| TaskRegistry | `getTaskRegistry()` | Scheduled/recurring tasks |
| AssetRegistry | `getAssetRegistry()` | Custom asset stores |
| CodecMapRegistry | `getCodecRegistry(...)` | Codec registration (3 overloads) |
| ClientFeatureRegistry | `getClientFeatureRegistry()` | Client-side features |
| Config\<T\> | `withConfig(BuilderCodec<T>)` | Plugin JSON configuration |

## Major Packages

| Package | Contents |
|---------|----------|
| `com.hypixel.hytale.server.core.plugin` | Plugin base classes, lifecycle, plugin state |
| `com.hypixel.hytale.event` | Event system infrastructure (EventBus, EventRegistry, IEvent, IAsyncEvent) |
| `com.hypixel.hytale.server.core.event.events` | Concrete event types (player, ECS, entity, permissions, lifecycle) |
| `com.hypixel.hytale.server.core.command.system` | Command system (AbstractCommand, CommandContext, argument types) |
| `com.hypixel.hytale.component` | ECS core (ComponentType, Store, Ref, ComponentRegistry, systems) |
| `com.hypixel.hytale.registry` | Generic registry framework (Registry, Registration) |
| `com.hypixel.hytale.codec` | Serialization framework (Codec, BuilderCodec, KeyedCodec) |
| `com.hypixel.hytale.common.plugin` | Shared plugin types (PluginManifest, PluginIdentifier) |
| `com.hypixel.hytale.server.core.asset.type` | Asset type definitions (BlockType, Item, CraftingRecipe) |

## Subsystem Documentation

- **[Events](events/index.md)** — Dual event hierarchy, listener registration, event priority
- **[Commands](commands/index.md)** — Builder-pattern command definition, argument types, permissions
- **[ECS Components](components/index.md)** — Archetype-based ECS, component registration, system types
- **[ECS Systems](systems/index.md)** — Ticking systems, event systems, lifecycle systems
- **[Registries](registries/index.md)** — Registry architecture, plugin-scoped registration
- **[JSON Schemas](../schemas/index.md)** — Data-driven asset definitions via BuilderCodec
