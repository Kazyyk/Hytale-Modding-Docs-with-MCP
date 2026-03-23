# WorldGenId

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class WorldGenId implements Component<EntityStore>

An `EntityStore` component.

## Constants

- public static final int NON_WORLD_GEN_ID

## Fields

- private int worldGenId

## Methods

- public static ComponentType<EntityStore, WorldGenId> getComponentType()
- public int getWorldGenId()
- @Override public Component<EntityStore> clone()

Also in this package: ActiveAnimationComponent, AudioComponent, BoundingBox, CollisionResultComponent, DisplayNameComponent, DynamicLight, EntityScaleComponent, FromPrefab, FromWorldGen, HeadRotation, HiddenFromAdventurePlayers, Intangible, Interactable, Invulnerable, ModelComponent, MovementAudioComponent, NPCMarkerComponent, NewSpawnComponent, PersistentDynamicLight, PersistentModel (and 7 more)

Complete API:
  public static ComponentType<EntityStore,WorldGenId> getComponentType()
  public int getWorldGenId()
  public Component<EntityStore> clone()

Fields:
public static final int NON_WORLD_GEN_ID
public static final BuilderCodec<WorldGenId> CODEC
private int worldGenId
