# LivingEntityEffectSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.livingentity | Extends: EntityTickingSystem<EntityStore> | Implements: DisableProcessingAssert

public class LivingEntityEffectSystem extends EntityTickingSystem<EntityStore> implements DisableProcessingAssert

ECS ticking system that processes active entity effects each tick. For each entity with an `EffectControllerComponent` and `TransformComponent`, iterates over active effects, checks apply conditions, ticks each effect's duration and stat modifications, removes expired or condition-failed effects, and tracks invulnerability state. Runs non-parallel within the `GatherDamage` system group.

## Static Methods

- public static boolean canApplyEffect(Ref<EntityStore> ownerRef, EntityEffect entityEffect, ComponentAccessor<EntityStore> componentAccessor)

## Methods

- public Query<EntityStore> getQuery()
- public boolean isParallel(int archetypeChunkSize, int taskCount)
- public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
- public SystemGroup<EntityStore> getGroup()

## Relationships

- Extends `EntityTickingSystem<EntityStore>`
- Implements `DisableProcessingAssert`
- Evaluates Condition arrays via `Condition.allConditionsMet()`

Also in this package: LivingEntityEffectClearChangesSystem

Complete API:
  public Query<EntityStore> getQuery()
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public SystemGroup<EntityStore> getGroup()
  public static boolean canApplyEffect(Ref<EntityStore> ownerRef, EntityEffect entityEffect, ComponentAccessor<EntityStore> componentAccessor)

Fields:
private static final Query<EntityStore> QUERY
