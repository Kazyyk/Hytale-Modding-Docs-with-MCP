# ActiveAnimationComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class ActiveAnimationComponent implements Component<EntityStore>

An `EntityStore` component.

## Fields

- private boolean isNetworkOutdated

## Methods

- public static ComponentType<EntityStore, ActiveAnimationComponent> getComponentType()
- public String[] getActiveAnimations()
- public void setPlayingAnimation(AnimationSlot slot, @Nullable String animation)
- public boolean consumeNetworkOutdated()
- @Override public Component<EntityStore> clone()

Also in this package: AudioComponent, BoundingBox, CachedStatsComponent, CollisionResultComponent, DisplayNameComponent, DynamicLight, EntityScaleComponent, FromPrefab, FromWorldGen, HeadRotation, HiddenFromAdventurePlayers, Intangible, Interactable, Invulnerable, ModelComponent, MovementAudioComponent, NPCMarkerComponent, NewSpawnComponent, PersistentDynamicLight, PersistentModel (and 8 more)

Complete API:
  public static ComponentType<EntityStore,ActiveAnimationComponent> getComponentType()
  public String[] getActiveAnimations()
  public void setPlayingAnimation(AnimationSlot slot, String animation)
  public boolean consumeNetworkOutdated()
  public Component<EntityStore> clone()

Fields:
private final String[] activeAnimations
private boolean isNetworkOutdated
