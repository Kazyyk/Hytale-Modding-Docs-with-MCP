# PlayerRefAddedSystem

Type: class | Package: com.hypixel.hytale.server.core.universe.system | Extends: RefSystem<EntityStore>

public class PlayerRefAddedSystem extends RefSystem<EntityStore>

ECS system extending `RefSystem<EntityStore>`. Processes entities each tick.

## Fields

- playerRefComponentType | ComponentType<EntityStore, PlayerRef> | final ComponentType<EntityStore, PlayerRef> field.

## Constructors

- PlayerRefAddedSystem(@Nonnull ComponentType<EntityStore, PlayerRef> playerRefComponentType) | Creates a new PlayerRefAddedSystem instance.

## Methods

- getDependencies() | Set<Dependency<EntityStore>> | public method.
- getQuery() | Query<EntityStore> | public method.
