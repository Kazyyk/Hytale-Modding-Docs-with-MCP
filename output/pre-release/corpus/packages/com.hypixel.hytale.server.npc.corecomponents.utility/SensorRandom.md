# SensorRandom

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.utility

public class SensorRandom

Sensor with configurable random true/false durations.

Also in this package: ActionNothing, ActionRandom, ActionResetInstructions, ActionSequence, ActionSetFlag, ActionTimeout, BodyMotionNothing, BodyMotionSequence, HeadMotionNothing, HeadMotionSequence, MotionSequence, SensorAdjustPosition, SensorAnd, SensorAny, SensorEval, SensorFlag, SensorMany, SensorNot, SensorOr, SensorSwitch (and 1 more)

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()
  protected double pickNextDuration()

Fields:
protected final double minFalseDuration
protected final double maxFalseDuration
protected final double minTrueDuration
protected final double maxTrueDuration
protected double remainingDuration
protected boolean state
