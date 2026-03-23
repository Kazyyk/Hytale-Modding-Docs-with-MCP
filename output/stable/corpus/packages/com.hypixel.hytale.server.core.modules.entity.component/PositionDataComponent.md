# PositionDataComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class PositionDataComponent implements Component<EntityStore>

An `EntityStore` component.

## Fields

- private int insideBlockTypeId
- private int standingOnBlockTypeId

## Methods

- public static ComponentType<EntityStore, PositionDataComponent> getComponentType()
- public int getInsideBlockTypeId()
- public void setInsideBlockTypeId(int insideBlockTypeId)
- public int getStandingOnBlockTypeId()
- public void setStandingOnBlockTypeId(int standingOnBlockTypeId)
- @Override public Component<EntityStore> clone()

Also in this package: ActiveAnimationComponent, AudioComponent, BoundingBox, CollisionResultComponent, DisplayNameComponent, DynamicLight, EntityScaleComponent, FromPrefab, FromWorldGen, HeadRotation, HiddenFromAdventurePlayers, Intangible, Interactable, Invulnerable, ModelComponent, MovementAudioComponent, NPCMarkerComponent, NewSpawnComponent, PersistentDynamicLight, PersistentModel (and 7 more)

Complete API:
  public static ComponentType<EntityStore,PositionDataComponent> getComponentType()
  public int getInsideBlockTypeId()
  public void setInsideBlockTypeId(int insideBlockTypeId)
  public int getStandingOnBlockTypeId()
  public void setStandingOnBlockTypeId(int standingOnBlockTypeId)
  public Component<EntityStore> clone()

Fields:
private int insideBlockTypeId
private int standingOnBlockTypeId
