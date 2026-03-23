# ActionResetInstructions

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.utility

public class ActionResetInstructions

Action that resets specified instruction indices to their initial state.

Also in this package: ActionNothing, ActionRandom, ActionSequence, ActionSetFlag, ActionTimeout, BodyMotionNothing, BodyMotionSequence, HeadMotionNothing, HeadMotionSequence, MotionSequence, SensorAdjustPosition, SensorAnd, SensorAny, SensorEval, SensorFlag, SensorMany, SensorNot, SensorOr, SensorRandom, SensorSwitch (and 1 more)

Complete API:
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  protected boolean resetInstructions(Role role, double dt)

Fields:
protected final int[] instructions
