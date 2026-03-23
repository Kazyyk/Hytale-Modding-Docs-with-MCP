# IRegistry

Type: interface | Package: com.hypixel.hytale.server.core.plugin.registry

public interface IRegistry

Base interface for plugin registries. All registry types implement this to provide a common `shutdown` lifecycle hook that is called when the plugin is unloaded.

## Methods

- shutdown() | void | Called when the registry is shut down during plugin unloading.

Known implementors: CodecMapRegistry, MapKeyMapRegistry

Also in this package: AssetRegistry, Assets, CodecMapRegistry, MapKeyMapRegistry

Complete API:
  void shutdown()
