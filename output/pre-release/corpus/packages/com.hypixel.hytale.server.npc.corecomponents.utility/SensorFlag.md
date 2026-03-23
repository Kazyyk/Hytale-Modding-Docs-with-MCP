# SensorFlag

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.utility

public class SensorFlag

Sensor that reads a boolean flag from the NPC's flag store.

Also in this package: ActionNothing, ActionRandom, ActionResetInstructions, ActionSequence, ActionSetFlag, ActionTimeout, BodyMotionNothing, BodyMotionSequence, HeadMotionNothing, HeadMotionSequence, MotionSequence, SensorAdjustPosition, SensorAnd, SensorAny, SensorEval, SensorMany, SensorNot, SensorOr, SensorRandom, SensorSwitch (and 1 more)

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()

Fields:
protected final int flagIndex
protected final boolean value
