# AssetRegistry

Type: class | Package: com.hypixel.hytale.server.core.plugin.registry

public class AssetRegistry

Registry for registering `AssetStore` instances with the global `AssetRegistry`. Tracks unregister callbacks for cleanup during plugin shutdown. Used by plugins to register custom asset types.

## Constructors

- AssetRegistry(List<BooleanConsumer> unregister) | Creates a registry backed by the given unregister callback list.

## Methods

- register(@Nonnull S assetStore) | AssetRegistry | Registers an asset store and records an unregister callback. Returns this for chaining.
- shutdown() | void | No-op shutdown hook.
