# WorldConfigSaveSystem

Type: class | Package: com.hypixel.hytale.server.core.universe.system | Extends: DelayedSystem<EntityStore>

public class WorldConfigSaveSystem extends DelayedSystem<EntityStore>

ECS system extending `DelayedSystem<EntityStore>`. Processes entities each tick.

## Constructors

- WorldConfigSaveSystem() | Creates a new WorldConfigSaveSystem instance.

## Methods

- delayedTick(float dt, int systemIndex, @Nonnull Store<EntityStore> store) | void | public method.
- saveWorldConfigAndResources(@Nonnull World world) | CompletableFuture<Void> | static public method.
