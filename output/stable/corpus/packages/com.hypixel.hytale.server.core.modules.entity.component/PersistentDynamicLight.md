# PersistentDynamicLight

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class PersistentDynamicLight implements Component<EntityStore>

An `EntityStore` component.

## Fields

- private ColorLight colorLight

## Methods

- public static ComponentType<EntityStore, PersistentDynamicLight> getComponentType()
- public ColorLight getColorLight()
- public void setColorLight(ColorLight colorLight)
- @Override public Component<EntityStore> clone()

Also in this package: ActiveAnimationComponent, AudioComponent, BoundingBox, CollisionResultComponent, DisplayNameComponent, DynamicLight, EntityScaleComponent, FromPrefab, FromWorldGen, HeadRotation, HiddenFromAdventurePlayers, Intangible, Interactable, Invulnerable, ModelComponent, MovementAudioComponent, NPCMarkerComponent, NewSpawnComponent, PersistentModel, PositionDataComponent (and 7 more)

Complete API:
  public static ComponentType<EntityStore,PersistentDynamicLight> getComponentType()
  public ColorLight getColorLight()
  public void setColorLight(ColorLight colorLight)
  public Component<EntityStore> clone()

Fields:
public static final BuilderCodec<PersistentDynamicLight> CODEC
private ColorLight colorLight
