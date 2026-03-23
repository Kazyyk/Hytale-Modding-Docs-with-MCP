# BoundingBox

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class BoundingBox implements Component<EntityStore>

An `EntityStore` component.

## Fields

- protected Map<String, DetailBox[]> detailBoxes

## Methods

- public static ComponentType<EntityStore, BoundingBox> getComponentType()
- @Nonnull public Box getBoundingBox()
- public void setBoundingBox(@Nonnull Box boundingBox)
- public Map<String, DetailBox[]> getDetailBoxes()
- public void setDetailBoxes(Map<String, DetailBox[]> detailBoxes)
- @Override public Component<EntityStore> clone()

Also in this package: ActiveAnimationComponent, AudioComponent, CachedStatsComponent, CollisionResultComponent, DisplayNameComponent, DynamicLight, EntityScaleComponent, FromPrefab, FromWorldGen, HeadRotation, HiddenFromAdventurePlayers, Intangible, Interactable, Invulnerable, ModelComponent, MovementAudioComponent, NPCMarkerComponent, NewSpawnComponent, PersistentDynamicLight, PersistentModel (and 8 more)

Complete API:
  public static ComponentType<EntityStore,BoundingBox> getComponentType()
  public Box getBoundingBox()
  public void setBoundingBox(Box boundingBox)
  public Map<String,DetailBox[]> getDetailBoxes()
  public void setDetailBoxes(Map<String,DetailBox[]> detailBoxes)
  public Component<EntityStore> clone()

Fields:
private final Box boundingBox
protected Map<String,DetailBox[]> detailBoxes
