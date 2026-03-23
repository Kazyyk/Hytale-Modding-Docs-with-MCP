# HeadRotation

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class HeadRotation implements Component<EntityStore>

An `EntityStore` component.

## Methods

- public static ComponentType<EntityStore, HeadRotation> getComponentType()
- @Nonnull public Vector3f getRotation()
- public void setRotation(@Nonnull Vector3f rotation)
- public Vector3d getDirection()
- @Nonnull public Vector3i getAxisDirection()
- @Nonnull public Vector3i getAxisDirection(@Nonnull Vector3i result)
- @Nonnull public Vector3i getHorizontalAxisDirection()
- @Nonnull public Axis getAxis()
- @Nonnull public static Vector3i getAxisDirection(float pitch, float yaw, @Nonnull Vector3i result)
- throw new IllegalStateException("Pitch can't be NaN")
- throw new IllegalStateException("Yaw can't be NaN")
- @Nonnull private static Vector3d getDirection(float pitch, float yaw, @Nonnull Vector3d result)
- public void teleportRotation(@Nonnull Vector3f rotation)

Also in this package: ActiveAnimationComponent, AudioComponent, BoundingBox, CollisionResultComponent, DisplayNameComponent, DynamicLight, EntityScaleComponent, FromPrefab, FromWorldGen, HiddenFromAdventurePlayers, Intangible, Interactable, Invulnerable, ModelComponent, MovementAudioComponent, NPCMarkerComponent, NewSpawnComponent, PersistentDynamicLight, PersistentModel, PositionDataComponent (and 7 more)

Complete API:
  public static ComponentType<EntityStore,HeadRotation> getComponentType()
  public Vector3f getRotation()
  public void setRotation(Vector3f rotation)
  public Vector3d getDirection()
  public Vector3i getAxisDirection()
  public Vector3i getAxisDirection(Vector3i result)
  public Vector3i getHorizontalAxisDirection()
  public Axis getAxis()
  public static Vector3i getAxisDirection(float pitch, float yaw, Vector3i result)
  private static Vector3d getDirection(float pitch, float yaw, Vector3d result)
  public void teleportRotation(Vector3f rotation)
  public HeadRotation clone()

Fields:
public static final BuilderCodec<HeadRotation> CODEC
private final Vector3f rotation
