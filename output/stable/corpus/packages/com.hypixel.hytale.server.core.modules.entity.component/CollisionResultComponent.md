# CollisionResultComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class CollisionResultComponent implements Component<EntityStore>

An `EntityStore` component.

## Fields

- private boolean pendingCollisionCheck

## Methods

- public static ComponentType<EntityStore, CollisionResultComponent> getComponentType()
- public CollisionResult getCollisionResult()
- public Vector3d getCollisionStartPosition()
- public Vector3d getCollisionPositionOffset()
- public Vector3d getCollisionStartPositionCopy()
- public Vector3d getCollisionPositionOffsetCopy()
- public boolean isPendingCollisionCheck()
- public void markPendingCollisionCheck()
- public void consumePendingCollisionCheck()
- public void resetLocationChange()
- @Override public Component<EntityStore> clone()

Also in this package: ActiveAnimationComponent, AudioComponent, BoundingBox, DisplayNameComponent, DynamicLight, EntityScaleComponent, FromPrefab, FromWorldGen, HeadRotation, HiddenFromAdventurePlayers, Intangible, Interactable, Invulnerable, ModelComponent, MovementAudioComponent, NPCMarkerComponent, NewSpawnComponent, PersistentDynamicLight, PersistentModel, PositionDataComponent (and 7 more)

Complete API:
  public static ComponentType<EntityStore,CollisionResultComponent> getComponentType()
  public CollisionResult getCollisionResult()
  public Vector3d getCollisionStartPosition()
  public Vector3d getCollisionPositionOffset()
  public Vector3d getCollisionStartPositionCopy()
  public Vector3d getCollisionPositionOffsetCopy()
  public boolean isPendingCollisionCheck()
  public void markPendingCollisionCheck()
  public void consumePendingCollisionCheck()
  public void resetLocationChange()
  public Component<EntityStore> clone()

Fields:
private final CollisionResult collisionResult
private final Vector3d collisionStartPosition
private final Vector3d collisionPositionOffset
private final Vector3d collisionStartPositionCopy
private final Vector3d collisionPositionOffsetCopy
private boolean pendingCollisionCheck
