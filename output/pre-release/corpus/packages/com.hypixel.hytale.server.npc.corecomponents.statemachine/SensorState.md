# SensorState

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.statemachine | Extends: SensorBase

public class SensorState extends SensorBase

## Fields

- protected final int state
- protected final boolean defaultSubState
- protected final int subState
- protected final boolean componentLocal
- protected final int componentIndex

## Methods

- @Override public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
- @Override public InfoProvider getSensorInfo()
- @Override public void getInfo(Role role, ComponentInfo holder)

Also in this package: ActionParentState, ActionState, ActionToggleStateEvaluator, SensorIsBusy

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()
  public void getInfo(Role role, ComponentInfo holder)

Fields:
protected final int state
protected final boolean defaultSubState
protected final int subState
protected final boolean componentLocal
protected final int componentIndex
