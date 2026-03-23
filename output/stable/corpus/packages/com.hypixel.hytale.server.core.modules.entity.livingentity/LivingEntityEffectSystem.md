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

Also in this package: LivingEntityEffectClearChangesSystem

Complete API:
  public Query<EntityStore> getQuery()
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public SystemGroup<EntityStore> getGroup()
  public static boolean canApplyEffect(Ref<EntityStore> ownerRef, EntityEffect entityEffect, ComponentAccessor<EntityStore> componentAccessor)

Fields:
private static final Query<EntityStore> QUERY
private static final String EFFECT_NAME_BURN
private static final String BLOCK_TYPE_FLUID_WATER
