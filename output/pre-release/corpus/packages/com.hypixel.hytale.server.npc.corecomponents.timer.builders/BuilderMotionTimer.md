# BuilderMotionTimer

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.timer.builders | Extends: BuilderMotionBase

public abstract class BuilderMotionTimer extends BuilderMotionBase<T>

Abstract base builder for motion timers. Reads `Time` (double range, default [1.0, 1.0]) and `Motion` (child motion reference) from JSON configuration.

Known subclasses: BuilderBodyMotionTimer, BuilderHeadMotionTimer

Also in this package: BuilderActionSetAlarm, BuilderActionTimer, BuilderActionTimerContinue, BuilderActionTimerModify, BuilderActionTimerPause, BuilderActionTimerRestart, BuilderActionTimerStart, BuilderActionTimerStop, BuilderBodyMotionTimer, BuilderHeadMotionTimer, BuilderSensorAlarm, BuilderSensorTimer

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderMotionTimer<T> readConfig(JsonElement data)
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public double[] getTimerRange(BuilderSupport support)
  public T getMotion(BuilderSupport builderSupport)

Fields:
public static final double[] DEFAULT_TIMER_RANGE
protected final NumberArrayHolder timerRange
protected BuilderObjectReferenceHelper<T> motion
