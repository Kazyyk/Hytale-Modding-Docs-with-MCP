# VoidEventStagesSystem

Type: class | Package: com.hypixel.hytale.builtin.portals.systems.voidevent | Extends: DelayedEntitySystem<EntityStore>

public class VoidEventStagesSystem extends DelayedEntitySystem<EntityStore>

Delayed entity system (1.5s interval) that manages progression through void event stages based on elapsed time. Transitions stages by starting/stopping forced weather effects.

## Methods

- public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
- public static void startStage(VoidEventStage stage, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
- public static void stopStage(VoidEventStage stage, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
- public Query<EntityStore> getQuery()

Also in this package: Instantiate, StartVoidEventInFragmentSystem, VoidEventRefSystem, VoidInvasionPortalsSpawnSystem, VoidSpawnerSystems

Complete API:
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  private static VoidEventStage computeAppropriateStage(VoidEventConfig config, int elapsedSeconds)
  public static void startStage(VoidEventStage stage, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public static void stopStage(VoidEventStage stage, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public Query<EntityStore> getQuery()
