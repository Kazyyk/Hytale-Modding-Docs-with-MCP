# WorldConfigProvider

Type: interface | Package: com.hypixel.hytale.server.core.universe.world

public interface WorldConfigProvider

Strategy interface for loading and saving `WorldConfig`. The default implementation reads from / writes to `config.json` within the world save directory, handling migration from the legacy `config.bson` format.

## Methods

- load(Path, String) | CompletableFuture<WorldConfig> | Loads a world config from the save path. Migrates `config.bson` to `config.json` if needed.
- save(Path, WorldConfig, World) | CompletableFuture<Void> | Saves a world config to `config.json` in the save path.

## Inner Types

### Default (class)

Empty default implementation that inherits the interface's default method behavior.

## See Also

- WorldConfig
- World
