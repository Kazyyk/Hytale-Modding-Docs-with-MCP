# LivingEntityEffectClearChangesSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.livingentity | Extends: EntityTickingSystem<EntityStore>

public class LivingEntityEffectClearChangesSystem extends EntityTickingSystem<EntityStore>

ECS system extending `EntityTickingSystem<EntityStore>`. Processes entities each tick.

## Methods

- getQuery() | Query<EntityStore> | public method.
- getDependencies() | Set<Dependency<EntityStore>> | public method.

Also in this package: LivingEntityEffectSystem

Complete API:
  public Query<EntityStore> getQuery()
  public Set<Dependency<EntityStore>> getDependencies()
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private static final Set<Dependency<EntityStore>> DEPENDENCIES
