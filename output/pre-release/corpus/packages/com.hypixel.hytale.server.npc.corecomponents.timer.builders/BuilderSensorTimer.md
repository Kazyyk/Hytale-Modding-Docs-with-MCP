# BuilderSensorTimer

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.timer.builders | Extends: BuilderSensorBase

public class BuilderSensorTimer extends BuilderSensorBase

Builder for SensorTimer. Reads `Name` (timer name), `State` (timer state), and `TimeRemainingRange` (default [0, MAX_VALUE]) from JSON configuration.

Also in this package: BuilderActionSetAlarm, BuilderActionTimer, BuilderActionTimerContinue, BuilderActionTimerModify, BuilderActionTimerPause, BuilderActionTimerRestart, BuilderActionTimerStart, BuilderActionTimerStop, BuilderBodyMotionTimer, BuilderHeadMotionTimer, BuilderMotionTimer, BuilderSensorAlarm

Complete API:
  public SensorTimer build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Sensor> readConfig(JsonElement data)
  public double[] getRemainingTimeRange(BuilderSupport support)
  public Timer getTimer(BuilderSupport support)
  public Timer.TimerState getTimerState()

Fields:
public static final double[] DEFAULT_TIME_ELAPSED_RANGE
protected final NumberArrayHolder timeRemainingRange
protected final StringHolder name
protected Timer.TimerState timerState
