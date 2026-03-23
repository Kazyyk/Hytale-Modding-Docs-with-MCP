# ModelComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class ModelComponent implements Component<EntityStore>

An `EntityStore` component.

## Fields

- private boolean isNetworkOutdated

## Methods

- public static ComponentType<EntityStore, ModelComponent> getComponentType()
- public Model getModel()
- public boolean consumeNetworkOutdated()
- @Override public Component<EntityStore> clone()

Also in this package: ActiveAnimationComponent, AudioComponent, BoundingBox, CollisionResultComponent, DisplayNameComponent, DynamicLight, EntityScaleComponent, FromPrefab, FromWorldGen, HeadRotation, HiddenFromAdventurePlayers, Intangible, Interactable, Invulnerable, MovementAudioComponent, NPCMarkerComponent, NewSpawnComponent, PersistentDynamicLight, PersistentModel, PositionDataComponent (and 7 more)

Complete API:
  public static ComponentType<EntityStore,ModelComponent> getComponentType()
  public Model getModel()
  public boolean consumeNetworkOutdated()
  public Component<EntityStore> clone()

Fields:
private final Model model
private boolean isNetworkOutdated
