# SensorEval

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.utility

public class SensorEval

Sensor that evaluates a compiled expression to determine its boolean result.

Also in this package: ActionNothing, ActionRandom, ActionResetInstructions, ActionSequence, ActionSetFlag, ActionTimeout, BodyMotionNothing, BodyMotionSequence, HeadMotionNothing, HeadMotionSequence, MotionSequence, SensorAdjustPosition, SensorAnd, SensorAny, SensorFlag, SensorMany, SensorNot, SensorOr, SensorRandom, SensorSwitch (and 1 more)

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()
  protected ValueType compile(String expression, StdScope sensorScope, List<ExecutionContext.Instruction> instructions)
  protected boolean evalBoolean(StdScope sensorScope, ExecutionContext.Instruction[] instructions)

Fields:
protected final String expression
protected final CompileContext compileContext
protected ExecutionContext.Instruction[] instructions
protected boolean isValid
