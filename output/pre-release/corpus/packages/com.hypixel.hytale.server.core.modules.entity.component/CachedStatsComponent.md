# CachedStatsComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component<EntityStore>

public class CachedStatsComponent implements Component<EntityStore>

Component caching computed entity stat values to avoid repeated lookups. Currently caches whether the entity can breathe.

## Methods

- public static ComponentType<EntityStore, CachedStatsComponent> getComponentType()
- public boolean isCanBreathe()
- public void setCanBreathe(boolean canBreathe)
- public Component<EntityStore> clone()

## Relationships

- Implements `Component<EntityStore>`
- Registered by EntityModule

Also in this package: ActiveAnimationComponent, AudioComponent, BoundingBox, CollisionResultComponent, DisplayNameComponent, DynamicLight, EntityScaleComponent, FromPrefab, FromWorldGen, HeadRotation, HiddenFromAdventurePlayers, Intangible, Interactable, Invulnerable, ModelComponent, MovementAudioComponent, NPCMarkerComponent, NewSpawnComponent, PersistentDynamicLight, PersistentModel (and 8 more)

Complete API:
  public static ComponentType<EntityStore,CachedStatsComponent> getComponentType()
  public boolean isCanBreathe()
  public void setCanBreathe(boolean canBreathe)
  public Component<EntityStore> clone()

Fields:
private boolean canBreathe
