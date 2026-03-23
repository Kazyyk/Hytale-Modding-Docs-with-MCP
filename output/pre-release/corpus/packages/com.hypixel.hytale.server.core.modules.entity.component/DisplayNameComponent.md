# DisplayNameComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class DisplayNameComponent implements Component<EntityStore>

An `EntityStore` component.

## Fields

- @Nullable private Message displayName

## Methods

- @Nonnull public static ComponentType<EntityStore, DisplayNameComponent> getComponentType()
- @Nullable public Message getDisplayName()
- @Override public Component<EntityStore> clone()

Also in this package: ActiveAnimationComponent, AudioComponent, BoundingBox, CachedStatsComponent, CollisionResultComponent, DynamicLight, EntityScaleComponent, FromPrefab, FromWorldGen, HeadRotation, HiddenFromAdventurePlayers, Intangible, Interactable, Invulnerable, ModelComponent, MovementAudioComponent, NPCMarkerComponent, NewSpawnComponent, PersistentDynamicLight, PersistentModel (and 8 more)

Complete API:
  public static ComponentType<EntityStore,DisplayNameComponent> getComponentType()
  public Message getDisplayName()
  public Component<EntityStore> clone()

Fields:
public static final BuilderCodec<DisplayNameComponent> CODEC
private Message displayName
