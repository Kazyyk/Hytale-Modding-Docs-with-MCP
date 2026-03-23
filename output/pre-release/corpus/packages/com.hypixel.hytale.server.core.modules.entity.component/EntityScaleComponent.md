# EntityScaleComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class EntityScaleComponent implements Component<EntityStore>

An `EntityStore` component.

## Fields

- private float scale
- private boolean isNetworkOutdated

## Methods

- public static ComponentType<EntityStore, EntityScaleComponent> getComponentType()
- public float getScale()
- public void setScale(float scale)
- public boolean consumeNetworkOutdated()
- @Override public Component<EntityStore> clone()

Also in this package: ActiveAnimationComponent, AudioComponent, BoundingBox, CachedStatsComponent, CollisionResultComponent, DisplayNameComponent, DynamicLight, FromPrefab, FromWorldGen, HeadRotation, HiddenFromAdventurePlayers, Intangible, Interactable, Invulnerable, ModelComponent, MovementAudioComponent, NPCMarkerComponent, NewSpawnComponent, PersistentDynamicLight, PersistentModel (and 8 more)

Complete API:
  public static ComponentType<EntityStore,EntityScaleComponent> getComponentType()
  public float getScale()
  public void setScale(float scale)
  public boolean consumeNetworkOutdated()
  public Component<EntityStore> clone()

Fields:
public static final BuilderCodec<EntityScaleComponent> CODEC
private float scale
private boolean isNetworkOutdated
