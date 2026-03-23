# LivingEntityEffectSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.livingentity | Extends: EntityTickingSystem<EntityStore> | Implements: DisableProcessingAssert

public class LivingEntityEffectSystem extends EntityTickingSystem<EntityStore> implements DisableProcessingAssert

ECS system extending `EntityTickingSystem<EntityStore>`. Processes entities each tick.

## Fields

- EFFECT_NAME_BURN | String | Static final String field.
- BLOCK_TYPE_FLUID_WATER | String | Static final String field.

## Methods

- getQuery() | Query<EntityStore> | public method.
- isParallel(int archetypeChunkSize, int taskCount) | boolean | public method.
- getGroup() | SystemGroup<EntityStore> | public method.
