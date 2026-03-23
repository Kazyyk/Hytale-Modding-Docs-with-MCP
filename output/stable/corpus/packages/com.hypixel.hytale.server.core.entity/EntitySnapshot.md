# EntitySnapshot

Type: class | Package: com.hypixel.hytale.server.core.entity

public class EntitySnapshot

Stores a snapshot of an entity's position and body rotation at a point in time. Contains `Vector3d position` and `Vector3f bodyRotation` fields with `init()` for updating and getter methods.

Known implementors: EntityAddSnapshot, EntityRemoveSnapshot, EntityTransformSnapshot

Also in this package: AnimationUtils, CallState, ChainCancelledException, ChainSyncStorage, DefaultAnimations, Entity, EntityUtils, ExplosionConfig, ExplosionUtils, Frozen, InteractionChain, InteractionContext, InteractionEntry, InteractionManager, ItemUtils, LivingEntity, SnapshotProvider, StatModifiersManager, TempChain, UUIDComponent

Complete API:
  public void init(Vector3d position, Vector3f bodyRotation)
  public Vector3d getPosition()
  public Vector3f getBodyRotation()
  public String toString()

Fields:
private final Vector3d position
private final Vector3f bodyRotation
