# ActionSetFlag

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.utility

public class ActionSetFlag

Action that sets a boolean flag on the NPC's flag store.

Also in this package: ActionNothing, ActionRandom, ActionResetInstructions, ActionSequence, ActionTimeout, BodyMotionNothing, BodyMotionSequence, HeadMotionNothing, HeadMotionSequence, MotionSequence, SensorAdjustPosition, SensorAnd, SensorAny, SensorEval, SensorFlag, SensorMany, SensorNot, SensorOr, SensorRandom, SensorSwitch (and 1 more)

Complete API:
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)

Fields:
protected final int flagIndex
protected final boolean value
