# FarmingSystems.CoopResidentTicking

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming | Extends: EntityTickingSystem<EntityStore>

public static class FarmingSystems.CoopResidentTicking extends EntityTickingSystem<EntityStore>

Ticks coop resident entities. If a resident is marked for despawn, removes it from the entity store.

Declared as a static inner class of FarmingSystems. Registered by FarmingPlugin during setup.

## Key Methods

- void` / `Query tick(...)
- void` / `Query getQuery(...)

Also in this package: CoopResidentEntitySystem, FarmingPlugin, FarmingSystems, FarmingUtil, MigrateFarming, OnCoopAdded, OnFarmBlockAdded, OnSoilAdded, Ticking

Complete API:
  public Query<EntityStore> getQuery()
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private final ComponentType<EntityStore,CoopResidentComponent> coopResidentComponentType
