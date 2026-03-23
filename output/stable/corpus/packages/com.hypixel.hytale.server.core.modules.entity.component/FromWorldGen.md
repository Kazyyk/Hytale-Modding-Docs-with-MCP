# FromWorldGen

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class FromWorldGen implements Component<EntityStore>

An `EntityStore` component.

## Fields

- private int worldGenId

## Methods

- public static ComponentType<EntityStore, FromWorldGen> getComponentType()
- public int getWorldGenId()
- @Override public Component<EntityStore> clone()

Also in this package: ActiveAnimationComponent, AudioComponent, BoundingBox, CollisionResultComponent, DisplayNameComponent, DynamicLight, EntityScaleComponent, FromPrefab, HeadRotation, HiddenFromAdventurePlayers, Intangible, Interactable, Invulnerable, ModelComponent, MovementAudioComponent, NPCMarkerComponent, NewSpawnComponent, PersistentDynamicLight, PersistentModel, PositionDataComponent (and 7 more)

Complete API:
  public static ComponentType<EntityStore,FromWorldGen> getComponentType()
  public int getWorldGenId()
  public Component<EntityStore> clone()

Fields:
public static final BuilderCodec<FromWorldGen> CODEC
private int worldGenId
