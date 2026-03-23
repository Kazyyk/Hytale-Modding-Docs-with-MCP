# BuilderActionTimerModify

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.timer.builders | Extends: BuilderActionTimer

public class BuilderActionTimerModify extends BuilderActionTimer

Builder for ActionTimer MODIFY operation. Can set AddValue, MaxValue, Rate, SetValue, and Repeating on a running timer.

Also in this package: BuilderActionSetAlarm, BuilderActionTimer, BuilderActionTimerContinue, BuilderActionTimerPause, BuilderActionTimerRestart, BuilderActionTimerStart, BuilderActionTimerStop, BuilderBodyMotionTimer, BuilderHeadMotionTimer, BuilderMotionTimer, BuilderSensorAlarm, BuilderSensorTimer

Complete API:
  public ActionTimer build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderActionTimer readConfig(JsonElement data)
  public Timer.TimerAction getTimerAction()
  public double getIncreaseValue(BuilderSupport builderSupport)
  public double[] getRestartValueRange(BuilderSupport builderSupport)
  public double getRate(BuilderSupport builderSupport)
  public double getSetValue(BuilderSupport builderSupport)
  public boolean isModifyRepeating()
  public boolean isRepeating(BuilderSupport support)

Fields:
private static final double[] DEFAULT_RESTART_VALUE_RANGE
protected final DoubleHolder increaseValue
protected final DoubleHolder setValue
protected final NumberArrayHolder restartValueRange
protected final DoubleHolder rate
protected final BooleanHolder repeating
protected boolean modifyRepeating
