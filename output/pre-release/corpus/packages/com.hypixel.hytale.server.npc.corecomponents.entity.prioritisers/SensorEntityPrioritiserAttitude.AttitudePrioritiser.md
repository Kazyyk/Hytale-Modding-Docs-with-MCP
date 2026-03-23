# SensorEntityPrioritiserAttitude.AttitudePrioritiser

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.prioritisers | Implements: IEntityByPriorityFilter

public static class SensorEntityPrioritiserAttitude.AttitudePrioritiser implements IEntityByPriorityFilter

Inner class of `SensorEntityPrioritiserAttitude` that filters and prioritises entities by attitude during sensor entity collection. Tracks the highest-priority entity seen so far, allowing early termination when the top priority (index 0) is found.

## Constructor


public AttitudePrioritiser(int[] attitudeToPriority)

## Fields

- attitudeToPriority | int[] | Maps attitude ordinal to priority index (lower = higher priority).
- highestPriorityTarget | Ref<EntityStore> | The best target found so far.
- highestPriorityIndex | int | The best priority index seen (initialized to `Integer.MAX_VALUE`).

## Methods

- init(Role) | void | Caches the `WorldSupport` from the role for attitude lookups.
- test(Ref<EntityStore>, Ref<EntityStore>, ComponentAccessor<EntityStore>) | boolean | Evaluates a target's attitude priority; returns `true` (stop iterating) if top priority is reached.
- getHighestPriorityTarget() | Ref<EntityStore> | Returns the highest-priority target found.
- cleanup() | void | Resets all state for reuse.

Also in this package: DefaultPrioritiser, SensorEntityPrioritiserAttitude, SensorEntityPrioritiserDefault

Complete API:
  public void init(Role role)
  public boolean test(Ref<EntityStore> ref, Ref<EntityStore> targetRef, ComponentAccessor<EntityStore> componentAccessor)
  public Ref<EntityStore> getHighestPriorityTarget()
  public void cleanup()

Fields:
private final int[] attitudeToPriority
private Ref<EntityStore> highestPriorityTarget
private int highestPriorityIndex
private WorldSupport support
