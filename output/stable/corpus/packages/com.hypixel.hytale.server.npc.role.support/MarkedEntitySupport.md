# MarkedEntitySupport

Type: class | Package: com.hypixel.hytale.server.npc.role.support

public class MarkedEntitySupport

Named target slot system for NPC roles. Behavior tree instructions mark entities into named slots (e.g. `"LockedTarget"`) and later retrieve them by slot name or index. Slot mappings are configured by `BuilderSupport` after role construction. Also manages stored position slots and flock-wide target propagation.

## Constants

- public static final String DEFAULT_TARGET_SLOT

## Constructors

- public MarkedEntitySupport(NPCEntity parent)

## Methods

- public Ref<EntityStore>[] getEntityTargets()
- public void postRoleBuilder(@Nonnull BuilderSupport support)
- public void clearMarkedEntity(int targetSlot)
- public void setMarkedEntity(String targetSlot, Ref<EntityStore> target)
- public void setMarkedEntity(int targetSlot, @Nullable Ref<EntityStore> target)
- @Nullable public Ref<EntityStore> getMarkedEntityRef(String targetSlot)
- @Nullable public Ref<EntityStore> getMarkedEntityRef(int targetSlot)
- public int getMarkedEntitySlotCount()
- public Vector3d getStoredPosition(int slot)
- public boolean hasMarkedEntity(@Nonnull Ref<EntityStore> entityReference, int targetSlot)
- public boolean hasMarkedEntityInSlot(String targetSlot)
- public boolean hasMarkedEntityInSlot(int targetSlot)
- public void flockSetTarget(@Nonnull String targetSlot, @Nullable Ref<EntityStore> targetRef, @Nonnull Store<EntityStore> store)
- public void setTargetSlotToIgnoreForAvoidance(int targetSlotToIgnoreForAvoidance)
- @Nullable public Ref<EntityStore> getTargetReferenceToIgnoreForAvoidance()
- public String getSlotName(int slot)
- public void unloaded()

## Behavior

`flockSetTarget` propagates a target assignment to all flock members by iterating over the entity group and calling `onFlockSetTarget` on each member's `NPCEntity`. `getTargetReferenceToIgnoreForAvoidance` returns the entity in the avoidance-ignore slot (or the default slot if none is explicitly set).

Also in this package: CombatSupport, DebugFlagsChangeListener, DebugSupport, EntityList, EntitySupport, EntityVisData, LineOfSightBuffer, LineOfSightEntityBuffer, PositionCache, RangeType, RayPredicate, RoleStats, SensorVisData, StateSupport, WorldSupport

Complete API:
  public Ref<EntityStore>[] getEntityTargets()
  public void postRoleBuilder(BuilderSupport support)
  public void clearMarkedEntity(int targetSlot)
  public void setMarkedEntity(String targetSlot, Ref<EntityStore> target)
  public void setMarkedEntity(int targetSlot, Ref<EntityStore> target)
  public Ref<EntityStore> getMarkedEntityRef(String targetSlot)
  public Ref<EntityStore> getMarkedEntityRef(int targetSlot)
  public int getMarkedEntitySlotCount()
  public Vector3d getStoredPosition(int slot)
  public boolean hasMarkedEntity(Ref<EntityStore> entityReference, int targetSlot)
  public boolean hasMarkedEntityInSlot(String targetSlot)
  public boolean hasMarkedEntityInSlot(int targetSlot)
  public void flockSetTarget(String targetSlot, Ref<EntityStore> targetRef, Store<EntityStore> store)
  public void setTargetSlotToIgnoreForAvoidance(int targetSlotToIgnoreForAvoidance)
  public Ref<EntityStore> getTargetReferenceToIgnoreForAvoidance()
  public String getSlotName(int slot)
  public void unloaded()

Fields:
public static final String DEFAULT_TARGET_SLOT
protected static final ComponentType<EntityStore,NPCEntity> NPC_COMPONENT_TYPE
private static final Object2IntMap<String> EMPTY_TARGET_SLOT_MAP
protected final NPCEntity parent
protected Object2IntMap<String> targetSlotMappings
protected Int2ObjectMap<String> slotToNameMap
protected Ref<EntityStore>[] entityTargets
protected Vector3d[] storedPositions
protected int defaultTargetSlot
protected int targetSlotToIgnoreForAvoidance
