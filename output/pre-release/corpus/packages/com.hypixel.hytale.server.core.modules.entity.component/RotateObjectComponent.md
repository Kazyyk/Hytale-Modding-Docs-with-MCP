# RotateObjectComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class RotateObjectComponent implements Component<EntityStore>

An `EntityStore` component.

## Fields

- private float rotationSpeed

## Methods

- @Nonnull public static ComponentType<EntityStore, RotateObjectComponent> getComponentType()
- @Override public Component<EntityStore> clone()
- public void setRotationSpeed(float rotationSpeed)
- public float getRotationSpeed()

Also in this package: ActiveAnimationComponent, AudioComponent, BoundingBox, CachedStatsComponent, CollisionResultComponent, DisplayNameComponent, DynamicLight, EntityScaleComponent, FromPrefab, FromWorldGen, HeadRotation, HiddenFromAdventurePlayers, Intangible, Interactable, Invulnerable, ModelComponent, MovementAudioComponent, NPCMarkerComponent, NewSpawnComponent, PersistentDynamicLight (and 8 more)

Complete API:
  public static ComponentType<EntityStore,RotateObjectComponent> getComponentType()
  public Component<EntityStore> clone()
  public void setRotationSpeed(float rotationSpeed)
  public float getRotationSpeed()

Fields:
public static final BuilderCodec<RotateObjectComponent> CODEC
private float rotationSpeed
