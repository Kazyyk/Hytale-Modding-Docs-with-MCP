# EntitySupport

Type: class | Package: com.hypixel.hytale.server.npc.role.support

public class EntitySupport

Entity-level support for NPC roles. Manages display name selection, sensor scope ownership, body/head motion step scheduling, component execution delay tracking, and target player task lists. Provides static utility methods for setting display names on arbitrary entity references.

## Constructors

- public EntitySupport(NPCEntity parent, @Nonnull BuilderRole builder)

## Methods

- public StdScope getSensorScope()
- @Nullable public Instruction getNextBodyMotionStep()
- public boolean setNextBodyMotionStep(Instruction step)
- public void clearNextBodyMotionStep()
- @Nullable public Instruction getNextHeadMotionStep()
- public boolean setNextHeadMotionStep(Instruction step)
- public void clearNextHeadMotionStep()
- public void postRoleBuilt(@Nonnull BuilderSupport builderSupport)
- public void tick(float dt)
- public void handleNominatedDisplayName(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public void nominateDisplayName(@Nonnull String displayName)
- public void pickRandomDisplayName(@Nonnull Holder<EntityStore> holder, boolean override)
- public void pickRandomDisplayName(@Nonnull Ref<EntityStore> ref, boolean override, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public void addTargetPlayerActiveTask(@Nonnull String task)
- public void clearTargetPlayerActiveTasks()
- @Nullable public List<String> getTargetPlayerActiveTasks()
- public void registerDelay(@Nonnull IComponentExecutionControl component)

## Static Methods

- public static void setDisplayName(@Nonnull Holder<EntityStore> holder, @Nonnull String displayName)
- public static void setDisplayName(@Nonnull Holder<EntityStore> holder, @Nullable String displayName, boolean override)
- public static void setRandomDisplayName(@Nonnull Ref<EntityStore> ref, @Nullable String[] names, boolean override, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public static void setDisplayName(@Nonnull Ref<EntityStore> ref, @Nonnull String displayName, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public static void setDisplayName(@Nonnull Ref<EntityStore> ref, @Nullable String displayName, boolean override, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- @Nonnull public static StdScope createScope(@Nonnull NPCEntity entity)

`createScope` builds a new `StdScope` parented to `StdLib.getInstance()` with two supplier-backed variables: `blocked` (whether the active motion controller is obstructed) and `health` (health as a percentage).

Also in this package: CombatSupport, DebugFlagsChangeListener, DebugSupport, EntityList, EntityVisData, LineOfSightBuffer, LineOfSightEntityBuffer, MarkedEntitySupport, PathWaypointVisData, PositionCache, RangeType, RayPredicate, RoleStats, SensorVisData, StateSupport, WorldSupport

Complete API:
  public StdScope getSensorScope()
  public Instruction getNextBodyMotionStep()
  public boolean setNextBodyMotionStep(Instruction step)
  public void clearNextBodyMotionStep()
  public Instruction getNextHeadMotionStep()
  public boolean setNextHeadMotionStep(Instruction step)
  public void clearNextHeadMotionStep()
  public void postRoleBuilt(BuilderSupport builderSupport)
  public void tick(float dt)
  public void handleNominatedDisplayName(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void nominateDisplayName(String displayName)
  public void pickRandomDisplayName(Holder<EntityStore> holder, boolean override)
  public static void setDisplayName(Holder<EntityStore> holder, String displayName)
  public static void setDisplayName(Holder<EntityStore> holder, String displayName, boolean override)
  public void pickRandomDisplayName(Ref<EntityStore> ref, boolean override, ComponentAccessor<EntityStore> componentAccessor)
  public static void setRandomDisplayName(Ref<EntityStore> ref, String[] names, boolean override, ComponentAccessor<EntityStore> componentAccessor)
  public static void setDisplayName(Ref<EntityStore> ref, String displayName, ComponentAccessor<EntityStore> componentAccessor)
  public static void setDisplayName(Ref<EntityStore> ref, String displayName, boolean override, ComponentAccessor<EntityStore> componentAccessor)
  public void addTargetPlayerActiveTask(String task)
  public void clearTargetPlayerActiveTasks()
  public List<String> getTargetPlayerActiveTasks()
  public void registerDelay(IComponentExecutionControl component)
  public static StdScope createScope(NPCEntity entity)

Fields:
protected final NPCEntity parent
protected final String[] displayNames
protected String nominatedDisplayName
protected StdScope sensorScope
protected Instruction nextBodyMotionStep
protected Instruction nextHeadMotionStep
protected final List<IComponentExecutionControl> delayingComponents
protected List<String> targetPlayerActiveTasks
