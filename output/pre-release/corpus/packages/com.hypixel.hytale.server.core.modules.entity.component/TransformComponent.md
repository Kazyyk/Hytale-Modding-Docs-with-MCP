# TransformComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class TransformComponent implements Component<EntityStore>

An `EntityStore` component.

## Fields

- private WorldChunk chunk
- @Nullable private Ref<ChunkStore> chunkRef

## Methods

- public static ComponentType<EntityStore, TransformComponent> getComponentType()
- @Nonnull public Vector3d getPosition()
- public void setPosition(@Nonnull Vector3d position)
- public void teleportPosition(@Nonnull Vector3d position)
- @Nonnull public Vector3f getRotation()
- public void setRotation(@Nonnull Vector3f rotation)
- @Nonnull public Transform getTransform()
- return new Transform(this.position, this.rotation)
- public void teleportRotation(@Nonnull Vector3f rotation)
- @Nonnull public ModelTransform getSentTransform()
- @Deprecated public WorldChunk getChunk()
- @Nullable public Ref<ChunkStore> getChunkRef()
- public void markChunkDirty(@Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public void setChunkLocation(@Nullable Ref<ChunkStore> chunkRef, @Nullable WorldChunk chunk)

Also in this package: ActiveAnimationComponent, AudioComponent, BoundingBox, CachedStatsComponent, CollisionResultComponent, DisplayNameComponent, DynamicLight, EntityScaleComponent, FromPrefab, FromWorldGen, HeadRotation, HiddenFromAdventurePlayers, Intangible, Interactable, Invulnerable, ModelComponent, MovementAudioComponent, NPCMarkerComponent, NewSpawnComponent, PersistentDynamicLight (and 8 more)

Complete API:
  public static ComponentType<EntityStore,TransformComponent> getComponentType()
  public Vector3d getPosition()
  public void setPosition(Vector3d position)
  public void teleportPosition(Vector3d position)
  public Vector3f getRotation()
  public void setRotation(Vector3f rotation)
  public Transform getTransform()
  public void teleportRotation(Vector3f rotation)
  public ModelTransform getSentTransform()
  public WorldChunk getChunk()
  public Ref<ChunkStore> getChunkRef()
  public void markChunkDirty(ComponentAccessor<EntityStore> componentAccessor)
  public void setChunkLocation(Ref<ChunkStore> chunkRef, WorldChunk chunk)
  public TransformComponent clone()

Fields:
public static final BuilderCodec<TransformComponent> CODEC
private final Vector3d position
private final Vector3f rotation
private final ModelTransform sentTransform
private WorldChunk chunk
private Ref<ChunkStore> chunkRef
