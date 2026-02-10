---
title: "PluginBase"
kind: "abstract class"
package: "com.hypixel.hytale.server.core.plugin"
api_surface: true
extends: ~
implements:
  - "CommandOwner"
generator_version: "1.0.0"
generated_at: "2026-02-09T23:30:00Z"
tags:
  - "plugin"
  - "lifecycle"
  - "entry-point"
  - "registry"
---

**Package:** `com.hypixel.hytale.server.core.plugin`

```java
public abstract class PluginBase implements CommandOwner
```

The base class for all Hytale server plugins. Every plugin extends `PluginBase` and uses it as the entry point for registering events, commands, tasks, block states, entities, codecs, assets, and other game systems. The server manages the plugin lifecycle by calling `setup()`, `start()`, and `shutdown()` in order.

## Lifecycle

Plugins progress through a defined state machine managed by `PluginState`:

| State | Description |
|---|---|
| `NONE` | Initial state before any lifecycle method has been called. |
| `SETUP` | Entered when `setup0()` is called. The plugin's `setup()` override runs in this state. |
| `START` | Entered when `start0()` is called, immediately before `start()` runs. |
| `ENABLED` | Set after `start()` completes successfully. The plugin is fully operational. |
| `SHUTDOWN` | Entered when `shutdown0()` is called. The plugin's `shutdown()` override runs in this state. |
| `DISABLED` | Set after shutdown completes or if `setup()`/`start()` throws an exception. |

### State Transitions

```
NONE --> SETUP --> START --> ENABLED --> SHUTDOWN --> DISABLED
  |               |
  +-- (exception) +-- (exception)
  |               |
  v               v
DISABLED        DISABLED
```

If `setup()` or `start()` throws an exception, the plugin transitions directly to `DISABLED`. The `SHUTDOWN` state is only reached during normal server-initiated shutdown of an enabled plugin.

### Lifecycle Methods

Override these methods to define your plugin's behavior. Do not call them directly.

```java
protected void setup()
```

Called during the setup phase. Use this to register events, commands, and other resources. All registry accessors are available. If this method throws, the plugin transitions to `DISABLED`.

```java
protected void start()
```

Called after setup completes. Use this for initialization that depends on the server being ready. If this method throws, the plugin transitions to `DISABLED`.

```java
protected void shutdown()
```

Called when the plugin is being unloaded. Use this for custom cleanup. After this method returns (or throws), all registrations are automatically cleaned up via the internal `cleanup()` mechanism.

### Pre-load

```java
@Nullable
public CompletableFuture<Void> preLoad()
```

Loads all configs registered with `withConfig()`. Returns `null` if no configs exist. Called by the server before `setup0()`.

## Constructor

```java
public PluginBase(@Nonnull PluginInit init)
```

Constructs the plugin base from a `PluginInit` provided by the server. Sets up the logger, data directory, identifier, manifest, and base permission string. Plugins do not call this directly -- the server framework instantiates plugins.

## Registry Accessors

These methods provide plugin-scoped registries. All registrations made through these registries are automatically cleaned up when the plugin shuts down. Each registry enforces a precondition: the plugin must be in an active state (`SETUP`, `START`, or `ENABLED`). Calling registration methods when the plugin is `NONE`, `DISABLED`, or `SHUTDOWN` throws `IllegalStateException`.

| Registry | Method | Returns |
|---|---|---|
| Events | `getEventRegistry()` | [EventRegistry](EventRegistry.md) |
| Commands | `getCommandRegistry()` | [CommandRegistry](CommandRegistry.md) |
| Block States | `getBlockStateRegistry()` | `BlockStateRegistry` |
| Entities | `getEntityRegistry()` | `EntityRegistry` |
| Tasks | `getTaskRegistry()` | `TaskRegistry` |
| Entity Store Components | `getEntityStoreRegistry()` | [ComponentRegistryProxy](ComponentRegistryProxy.md)`<EntityStore>` |
| Chunk Store Components | `getChunkStoreRegistry()` | [ComponentRegistryProxy](ComponentRegistryProxy.md)`<ChunkStore>` |
| Assets | `getAssetRegistry()` | `AssetRegistry` |
| Client Features | `getClientFeatureRegistry()` | `ClientFeatureRegistry` |

### Events

```java
@Nonnull
public EventRegistry getEventRegistry()
```

Returns the plugin-scoped [EventRegistry](EventRegistry.md) for subscribing to server events. Delegates to the server's `EventBus`.

**See also:** [EventRegistry](EventRegistry.md), [EventRegistration](EventRegistration.md)

### Commands

```java
@Nonnull
public CommandRegistry getCommandRegistry()
```

Returns the plugin-scoped [CommandRegistry](CommandRegistry.md) for registering slash commands.

**See also:** [CommandRegistry](CommandRegistry.md), [CommandRegistration](CommandRegistration.md)

### Block States

```java
@Nonnull
public BlockStateRegistry getBlockStateRegistry()
```

Returns the plugin-scoped `BlockStateRegistry` for registering custom block states.

### Entities

```java
@Nonnull
public EntityRegistry getEntityRegistry()
```

Returns the plugin-scoped `EntityRegistry` for registering custom entity types.

### Tasks

```java
@Nonnull
public TaskRegistry getTaskRegistry()
```

Returns the plugin-scoped `TaskRegistry` for scheduling recurring or delayed tasks.

### Entity Store Components

```java
@Nonnull
public ComponentRegistryProxy<EntityStore> getEntityStoreRegistry()
```

Returns the plugin-scoped `ComponentRegistryProxy` for registering ECS components on entity stores. Delegates to `EntityStore.REGISTRY`.

### Chunk Store Components

```java
@Nonnull
public ComponentRegistryProxy<ChunkStore> getChunkStoreRegistry()
```

Returns the plugin-scoped `ComponentRegistryProxy` for registering ECS components on chunk stores. Delegates to `ChunkStore.REGISTRY`.

### Assets

```java
@Nonnull
public AssetRegistry getAssetRegistry()
```

Returns the plugin-scoped `AssetRegistry` for registering custom asset types.

### Client Features

```java
@Nonnull
public ClientFeatureRegistry getClientFeatureRegistry()
```

Returns the plugin-scoped `ClientFeatureRegistry` for registering features that affect client behavior.

### Codec Registries

Three overloads are provided for registering codec mappings, each returning a plugin-scoped registry backed by the corresponding codec map type:

```java
@Nonnull
public <T, C extends Codec<? extends T>> CodecMapRegistry<T, C> getCodecRegistry(@Nonnull StringCodecMapCodec<T, C> mapCodec)
```

Returns (or creates) a `CodecMapRegistry` for a string-keyed codec map.

```java
@Nonnull
public <K, T extends JsonAsset<K>> CodecMapRegistry.Assets<T, ?> getCodecRegistry(@Nonnull AssetCodecMapCodec<K, T> mapCodec)
```

Returns (or creates) a `CodecMapRegistry.Assets` for an asset codec map.

```java
@Nonnull
public <V> MapKeyMapRegistry<V> getCodecRegistry(@Nonnull MapKeyMapCodec<V> mapCodec)
```

Returns (or creates) a `MapKeyMapRegistry` for a map-key codec map.

Codec registries are created lazily and cached in a `ConcurrentHashMap`. All are cleaned up on shutdown.

## Configuration

```java
@Nonnull
protected final <T> Config<T> withConfig(@Nonnull BuilderCodec<T> configCodec)
```

Registers a config file named `"config"` using the given codec. Must be called before `setup()` (i.e., while the plugin state is `NONE`). Throws `IllegalStateException` if called after setup begins.

```java
@Nonnull
protected final <T> Config<T> withConfig(@Nonnull String name, @Nonnull BuilderCodec<T> configCodec)
```

Registers a config file with the specified name. Same timing constraint as the single-argument overload.

The returned `Config<T>` object is loaded asynchronously during `preLoad()` from the plugin's data directory.

## Identity and Metadata

```java
@Nonnull
public PluginIdentifier getIdentifier()
```

Returns the plugin's unique identifier, constructed from the `PluginManifest`.

```java
@Nonnull
public PluginManifest getManifest()
```

Returns the plugin's manifest metadata.

```java
@Nonnull
@Override
public String getName()
```

Returns the string representation of the plugin identifier. Implements `CommandOwner.getName()`.

```java
@Nonnull
public Path getDataDirectory()
```

Returns the file-system path to the plugin's private data directory. Used for config files and persistent storage.

```java
@Nonnull
public final String getBasePermission()
```

Returns the base permission node for this plugin, computed as `(group + "." + name).toLowerCase()` from the manifest. Used as a prefix for permission checks.

```java
@Nonnull
public HytaleLogger getLogger()
```

Returns the plugin's logger instance. The logger tag includes the plugin name and a suffix indicating whether it is a plugin (`|P`) or addon (`|A`).

## State Queries

```java
public boolean isEnabled()
```

Returns `true` if the plugin is in an active state (not `NONE`, `DISABLED`, or `SHUTDOWN`).

```java
public boolean isDisabled()
```

Returns `true` if the plugin is in `NONE`, `DISABLED`, or `SHUTDOWN` state.

```java
@Nonnull
public PluginState getState()
```

Returns the current `PluginState`.

## Abstract Methods

```java
@Nonnull
public abstract PluginType getType()
```

Returns whether this is a `PLUGIN` or `ADDON`. Implemented by concrete subclasses.

## Cleanup

When a plugin shuts down, the internal `cleanup()` method runs in this order:

1. `commandRegistry.shutdown()`
2. `eventRegistry.shutdown()`
3. `clientFeatureRegistry.shutdown()`
4. `blockStateRegistry.shutdown()`
5. `taskRegistry.shutdown()`
6. `entityStoreRegistry.shutdown()`
7. `chunkStoreRegistry.shutdown()`
8. All codec map registries are shut down.
9. `assetRegistry.shutdown()`
10. All shutdown tasks are executed in reverse order (LIFO).

This ensures all registrations are removed and resources released, even if the plugin's `shutdown()` override does not explicitly unregister them.

## Example

```java
public class MyPlugin extends PluginBase {

    private final Config<MyConfig> config;

    public MyPlugin(PluginInit init) {
        super(init);
        // Config must be registered before setup()
        this.config = withConfig(MyConfig.CODEC);
    }

    @Override
    public PluginType getType() {
        return PluginType.PLUGIN;
    }

    @Override
    protected void setup() {
        // Register an event listener
        getEventRegistry().register(BootEvent.class, event -> {
            getLogger().info("Server booted!");
        });

        // Register a command
        getCommandRegistry().registerCommand(new MyCommand());

        // Register an entity store component
        getEntityStoreRegistry().register(MyComponent.class, MyComponent::new);
    }

    @Override
    protected void start() {
        getLogger().info("Plugin started: " + getIdentifier());
        getLogger().info("Config value: " + config.get().someValue());
    }

    @Override
    protected void shutdown() {
        getLogger().info("Plugin shutting down.");
        // Explicit cleanup is optional -- all registrations are
        // automatically removed by the framework.
    }
}
```

## Related Types

- [EventRegistry](EventRegistry.md) -- plugin-scoped event registration
- [CommandRegistry](CommandRegistry.md) -- plugin-scoped command registration
- [Registry](Registry.md) -- generic base class for plugin-scoped registries
- [Registration](Registration.md) -- base handle for individual registrations
- [Registry System Overview](../registries/index.md) -- how registries work
- `PluginState` -- lifecycle state enum
- `PluginManifest` -- plugin metadata from the manifest file
- `PluginIdentifier` -- unique plugin identity
- `ComponentRegistryProxy` -- ECS component registration proxy
- `BlockStateRegistry` -- block state registration
- `EntityRegistry` -- entity type registration
- `TaskRegistry` -- task scheduling registration
- `AssetRegistry` -- asset registration
- `ClientFeatureRegistry` -- client feature registration
- `CodecMapRegistry` -- codec mapping registration
- `Config` -- typed configuration file loading
