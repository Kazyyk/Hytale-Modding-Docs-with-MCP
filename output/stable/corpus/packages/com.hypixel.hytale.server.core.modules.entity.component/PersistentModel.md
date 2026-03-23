# PersistentModel

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class PersistentModel implements Component<EntityStore>

An `EntityStore` component.

## Fields

- private Model.ModelReference modelReference

## Methods

- @Nonnull public static ComponentType<EntityStore, PersistentModel> getComponentType()
- @Nonnull public Model.ModelReference getModelReference()
- public void setModelReference(@Nonnull Model.ModelReference modelReference)
- @Override public Component<EntityStore> clone()

Also in this package: ActiveAnimationComponent, AudioComponent, BoundingBox, CollisionResultComponent, DisplayNameComponent, DynamicLight, EntityScaleComponent, FromPrefab, FromWorldGen, HeadRotation, HiddenFromAdventurePlayers, Intangible, Interactable, Invulnerable, ModelComponent, MovementAudioComponent, NPCMarkerComponent, NewSpawnComponent, PersistentDynamicLight, PositionDataComponent (and 7 more)

Complete API:
  public static ComponentType<EntityStore,PersistentModel> getComponentType()
  public Model.ModelReference getModelReference()
  public void setModelReference(Model.ModelReference modelReference)
  public Component<EntityStore> clone()

Fields:
public static final BuilderCodec<PersistentModel> CODEC
private Model.ModelReference modelReference
