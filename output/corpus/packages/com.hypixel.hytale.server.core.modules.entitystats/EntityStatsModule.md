# EntityStatsModule

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats | Extends: JavaPlugin

public class EntityStatsModule extends JavaPlugin

Core plugin that manages the entity stats system. Registers the EntityStatMap ECS component, all `EntityStatType` assets, `Condition` and `Modifier` codec types, and the systems in EntityStatsSystems. Depends on `EntityModule` and `InteractionModule`.

## Static Methods

- get() | EntityStatsModule | Returns the singleton instance.
- get(Entity entity) | EntityStatMap | **Deprecated.** Retrieves the stat map for an entity.
- resolveEntityStats(Object2FloatMap<String>) | Int2FloatMap | Resolves string-keyed stat values to index-keyed maps.
- resolveEntityStats(Map<String, T>) | Int2ObjectMap<T> | Resolves string-keyed stat objects to index-keyed maps.
- resolveEntityStats(String[]) | int[] | Resolves string stat names to index array.

## Instance Methods

- getEntityStatMapComponentType() | ComponentType<EntityStore, EntityStatMap> | Returns the registered component type for `EntityStatMap`.
- getStatModifyingSystemType() | SystemType<EntityStore, StatModifyingSystem> | Returns the system type for stat-modifying systems.

## Registered Condition Types

`LogicCondition`, `RegenHealth`, `NoDamageTaken`, `Suffocating`, `Charging`, `Alive`, `Environment`, `Player`, `OutOfCombat`, `Wielding`, `Sprinting`, `Gliding`, `Stat`

## Registered Modifier Types

`Boost` and `Static` (both map to `StaticModifier`)

## Inner Types

- `PlayerRegenerateStatsSystem` -- regeneration system for Player entities

## Related Types

- EntityStatMap -- the component this module registers
- EntityStatsSystems -- all ECS systems for stat processing
- DefaultEntityStatTypes -- built-in stat type indices
