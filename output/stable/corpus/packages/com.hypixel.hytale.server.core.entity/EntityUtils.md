# EntityUtils

Type: class | Package: com.hypixel.hytale.server.core.entity

public class EntityUtils

Utility class for entity component operations. Provides `toHolder()` to extract all components from an archetype chunk into a `Holder`, and helper methods to find entity component types from archetypes. Also provides methods to get `Entity`, `Model`, and `PhysicsValues` from entity references.

Also in this package: AnimationUtils, CallState, ChainCancelledException, ChainSyncStorage, DefaultAnimations, Entity, EntitySnapshot, ExplosionConfig, ExplosionUtils, Frozen, InteractionChain, InteractionContext, InteractionEntry, InteractionManager, ItemUtils, LivingEntity, SnapshotProvider, StatModifiersManager, TempChain, UUIDComponent

Complete API:
  public static Holder<EntityStore> toHolder(int index, ArchetypeChunk<EntityStore> archetypeChunk)
  private static ComponentType<EntityStore,T> findComponentType(Archetype<EntityStore> archetype)
  private static ComponentType<EntityStore,T> findComponentType(Archetype<EntityStore> archetype, Class<C> entityClass)
  public static Entity getEntity(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public static Entity getEntity(int index, ArchetypeChunk<EntityStore> archetypeChunk)
  public static Entity getEntity(Holder<EntityStore> holder)
  public static boolean hasEntity(Archetype<EntityStore> archetype)
  public static boolean hasLivingEntity(Archetype<EntityStore> archetype)
  public static PhysicsValues getPhysicsValues(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
