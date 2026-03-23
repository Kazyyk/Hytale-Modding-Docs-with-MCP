# MovementAudioComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class MovementAudioComponent implements Component<EntityStore>

An `EntityStore` component.

## Fields

- public static float NO_REPEAT
- private int lastInsideBlockTypeId
- private float nextMoveInRepeat
- protected Ref<EntityStore> owner

## Methods

- public static ComponentType<EntityStore, MovementAudioComponent> getComponentType()
- @Nonnull public MovementAudioComponent.ShouldHearPredicate getShouldHearPredicate(Ref<EntityStore> ref)
- public int getLastInsideBlockTypeId()
- public void setLastInsideBlockTypeId(int lastInsideBlockTypeId)
- public boolean canMoveInRepeat()
- public boolean tickMoveInRepeat(float dt)
- public void setNextMoveInRepeat(float nextMoveInRepeat)
- @Override public Component<EntityStore> clone()
- public boolean test(@Nonnull Ref<EntityStore> targetRef)

Also in this package: ActiveAnimationComponent, AudioComponent, BoundingBox, CachedStatsComponent, CollisionResultComponent, DisplayNameComponent, DynamicLight, EntityScaleComponent, FromPrefab, FromWorldGen, HeadRotation, HiddenFromAdventurePlayers, Intangible, Interactable, Invulnerable, ModelComponent, NPCMarkerComponent, NewSpawnComponent, PersistentDynamicLight, PersistentModel (and 8 more)

Complete API:
  public static ComponentType<EntityStore,MovementAudioComponent> getComponentType()
  public MovementAudioComponent.ShouldHearPredicate getShouldHearPredicate(Ref<EntityStore> ref)
  public int getLastInsideBlockTypeId()
  public void setLastInsideBlockTypeId(int lastInsideBlockTypeId)
  public boolean canMoveInRepeat()
  public boolean tickMoveInRepeat(float dt)
  public void setNextMoveInRepeat(float nextMoveInRepeat)
  public Component<EntityStore> clone()

Fields:
public static float NO_REPEAT
private final MovementAudioComponent.ShouldHearPredicate shouldHearPredicate
private int lastInsideBlockTypeId
private float nextMoveInRepeat
