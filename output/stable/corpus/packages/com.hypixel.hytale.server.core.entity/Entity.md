# Entity

Type: class | Package: com.hypixel.hytale.server.core.entity | Implements: Component<EntityStore>

public abstract class Entity implements Component<EntityStore>

Abstract base class for all server-side entities. Implements `Component<EntityStore>` for the ECS architecture. Maintains a network ID, world reference, entity store reference, legacy UUID, legacy display name, and removal tracking. Provides static codec fields `MODEL`, `DISPLAY_NAME`, and `UUID`. The `CODEC` is an abstract builder codec (version 5) with legacy versioned support.

Known subclasses: LegacySpawnBeaconEntity, LivingEntity, PatrolPathMarkerEntity, SpawnBeacon

Also in this package: AnimationUtils, CallState, ChainCancelledException, ChainSyncStorage, DefaultAnimations, EntitySnapshot, EntityUtils, ExplosionConfig, ExplosionUtils, Frozen, InteractionChain, InteractionContext, InteractionEntry, InteractionManager, ItemUtils, LivingEntity, SnapshotProvider, StatModifiersManager, TempChain, UUIDComponent

Complete API:
  public void markNeedsSave()
  public void setLegacyUUID(UUID uuid)
  public boolean remove()
  public void loadIntoWorld(World world)
  public void unloadFromWorld()
  public int getNetworkId()
  public String getLegacyDisplayName()
  public UUID getUuid()
  public void setTransformComponent(TransformComponent transform)
  public TransformComponent getTransformComponent()
  public void moveTo(Ref<EntityStore> ref, double locX, double locY, double locZ, ComponentAccessor<EntityStore> componentAccessor)
  public World getWorld()
  public boolean wasRemoved()
  public boolean isCollidable()
  public int hashCode()
  public boolean equals(Object o)
  public String toString()
  public boolean isHiddenFromLivingEntity(Ref<EntityStore> ref, Ref<EntityStore> targetRef, ComponentAccessor<EntityStore> componentAccessor)
  public void setReference(Ref<EntityStore> reference)
  public Ref<EntityStore> getReference()
  public void clearReference()
  public Component<EntityStore> clone()
  public Holder<EntityStore> toHolder()

Fields:
public static final HytaleLogger LOGGER
public static final int VERSION
public static final KeyedCodec<Model.ModelReference> MODEL
public static final KeyedCodec<String> DISPLAY_NAME
public static final KeyedCodec<UUID> UUID
public static final BuilderCodec<Entity> CODEC
public static final int UNASSIGNED_ID
protected int networkId
protected UUID legacyUuid
protected World world
protected Ref<EntityStore> reference
private TransformComponent transformComponent
protected String legacyDisplayName
protected final AtomicBoolean wasRemoved
protected Throwable removedBy
