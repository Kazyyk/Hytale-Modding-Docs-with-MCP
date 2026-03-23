# SensorEntityBase

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity | Extends: SensorWithEntityFilters

public abstract class SensorEntityBase extends SensorWithEntityFilters

## Fields

- private static final HytaleLogger LOGGER
- protected static final ComponentType<EntityStore, TransformComponent> TRANSFORM_COMPONENT_TYPE
- protected static final ComponentType<EntityStore, NPCEntity> NPC_COMPONENT_TYPE
- protected static final ComponentType<EntityStore, Player> PLAYER_COMPONENT_TYPE
- protected static final ComponentType<EntityStore, DeathComponent> DEATH_COMPONENT_TYPE
- protected final double range
- protected final double minRange
- protected final boolean useProjectedDistance
- protected final boolean lockOnTarget
- protected final boolean autoUnlockTarget
- protected final boolean onlyLockedTarget
- protected final int lockedTargetSlot
- protected final int ignoredTargetSlot
- protected final ISensorEntityPrioritiser prioritiser
- protected IEntityByPriorityFilter npcPrioritiser
- protected IEntityByPriorityFilter playerPrioritiser
- protected final ISensorEntityCollector collector
- protected int ownRole
- protected final EntityPositionProvider positionProvider
- protected int currentVisSensorColorIndex
- protected final float visViewAngle
- TransformComponent transformComponent
- Vector3d position
- DebugSupport debugSupport
- Ref<EntityStore> targetRef
- Ref<EntityStore> target
- Player playerComponent
- GameMode gameMode
- PlayerSettings playerSettingsComponent
- boolean allowDetection
- TransformComponent targetTransformComponent
- Vector3d pos
- double squaredDistance
- NPCEntity npcComponent
- boolean filterMatch
- boolean match
- Ref<EntityStore> player
- Ref<EntityStore> npc
- Ref<EntityStore> ignoredEntity

## Constructors

- public SensorEntityBase(@Nonnull BuilderSensorEntityBase builder, ISensorEntityPrioritiser prioritiser, @Nonnull BuilderSupport builderSupport)

## Methods

- public boolean matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)
- public void done()
- public InfoProvider getSensorInfo()
- public void registerWithSupport(@Nonnull Role role)
- public void motionControllerChanged(@Nullable Ref<EntityStore> ref,
        @Nonnull NPCEntity npcComponent,
        MotionController motionController,
        @Nullable ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `void` | `loaded(Role role)` |
| `public` | `void` | `spawned(Role role)` |
| `public` | `void` | `unloaded(Role role)` |
| `public` | `void` | `removed(Role role)` |
| `public` | `void` | `teleported(Role role, World from, World to)` |
| `` | `protected void` | `initialisePrioritiser()` |
| `` | `protected abstract boolean` | `isGetPlayers()` |
| `` | `protected abstract boolean` | `isGetNPCs()` |
| `` | `protected boolean` | `isExcludingOwnType()` |
| `protected` | `Ref<EntityStore>` | `filterLockedEntity(@Nonnull Ref<EntityStore> ref, @Nonnull Vector3d position, @Nonnull Role role, @Nonnull Store<EntityStore> store)` |
| `` | `protected boolean` | `filterEntityWithRange(@Nonnull Ref<EntityStore> ref, @Nonnull Ref<EntityStore> targetRef, @Nonnull Vector3d position, @Nonnull Role role, @Nonnull Store<EntityStore> store)` |
| `` | `protected boolean` | `filterEntity(@Nonnull Ref<EntityStore> ref, @Nonnull Ref<EntityStore> targetRef, @Nonnull Role role, @Nonnull Store<EntityStore> store)` |
| `` | `protected boolean` | `filterPrioritisedPlayer(@Nonnull Ref<EntityStore> ref, @Nonnull Ref<EntityStore> targetRef, @Nonnull Role role, @Nonnull Store<EntityStore> store)` |
| `` | `protected boolean` | `filterPrioritisedNPC(@Nonnull Ref<EntityStore> ref, @Nonnull Ref<EntityStore> targetRef, @Nonnull Role role, @Nonnull Store<EntityStore> store)` |
| `` | `protected boolean` | `filterPrioritisedEntity(@Nonnull Ref<EntityStore> ref,
        @Nonnull Ref<EntityStore> targetRef,
        @Nonnull Role role,
        @Nonnull Store<EntityStore> store,
        @Nonnull IEntityByPriorityFilter entityPrioritiser)` |
| `` | `private void` | `recordEntityVisData(@Nonnull Ref<EntityStore> targetRef, @Nonnull Role role, boolean matched)` |
| `protected` | `Ref<EntityStore>` | `findPlayerOrEntity(@Nonnull Ref<EntityStore> ref, @Nonnull Vector3d position, @Nonnull Role role, @Nonnull Store<EntityStore> store)` |

## Related Types

- SensorEntity

Known subclasses: SensorEntity, SensorPlayer

Also in this package: ActionBeacon, ActionIgnoreForAvoidance, ActionNotify, ActionOverrideAttitude, ActionReleaseTarget, ActionSetMarkedTarget, ActionSetStat, HeadMotionWatch, SensorBeacon, SensorCount, SensorEntity, SensorKill, SensorPlayer, SensorSelf, SensorTarget

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public void done()
  public InfoProvider getSensorInfo()
  public void registerWithSupport(Role role)
  public void motionControllerChanged(Ref<EntityStore> ref, NPCEntity npcComponent, MotionController motionController, ComponentAccessor<EntityStore> componentAccessor)
  public void loaded(Role role)
  public void spawned(Role role)
  public void unloaded(Role role)
  public void removed(Role role)
  public void teleported(Role role, World from, World to)
  protected void initialisePrioritiser()
  protected abstract boolean isGetPlayers()
  protected abstract boolean isGetNPCs()
  protected boolean isExcludingOwnType()
  protected Ref<EntityStore> filterLockedEntity(Ref<EntityStore> ref, Vector3d position, Role role, Store<EntityStore> store)
  protected boolean filterEntityWithRange(Ref<EntityStore> ref, Ref<EntityStore> targetRef, Vector3d position, Role role, Store<EntityStore> store)
  protected boolean filterEntity(Ref<EntityStore> ref, Ref<EntityStore> targetRef, Role role, Store<EntityStore> store)
  protected boolean filterPrioritisedPlayer(Ref<EntityStore> ref, Ref<EntityStore> targetRef, Role role, Store<EntityStore> store)
  protected boolean filterPrioritisedNPC(Ref<EntityStore> ref, Ref<EntityStore> targetRef, Role role, Store<EntityStore> store)
  protected boolean filterPrioritisedEntity(Ref<EntityStore> ref, Ref<EntityStore> targetRef, Role role, Store<EntityStore> store, IEntityByPriorityFilter entityPrioritiser)
  private void recordEntityVisData(Ref<EntityStore> targetRef, Role role, boolean matched)
  protected Ref<EntityStore> findPlayerOrEntity(Ref<EntityStore> ref, Vector3d position, Role role, Store<EntityStore> store)

Fields:
private static final HytaleLogger LOGGER
protected static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
protected static final ComponentType<EntityStore,NPCEntity> NPC_COMPONENT_TYPE
protected static final ComponentType<EntityStore,Player> PLAYER_COMPONENT_TYPE
protected static final ComponentType<EntityStore,DeathComponent> DEATH_COMPONENT_TYPE
protected final double range
protected final double minRange
protected final boolean useProjectedDistance
protected final boolean lockOnTarget
protected final boolean autoUnlockTarget
protected final boolean onlyLockedTarget
protected final int lockedTargetSlot
protected final int ignoredTargetSlot
protected final ISensorEntityPrioritiser prioritiser
protected IEntityByPriorityFilter npcPrioritiser
protected IEntityByPriorityFilter playerPrioritiser
protected final ISensorEntityCollector collector
protected int ownRole
protected final EntityPositionProvider positionProvider
protected int currentVisSensorColorIndex
protected final float visViewAngle
