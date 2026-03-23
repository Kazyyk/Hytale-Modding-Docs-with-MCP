# BuilderActionTimerStart

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.timer.builders | Extends: BuilderActionTimer

public class BuilderActionTimerStart extends BuilderActionTimer

Builder for ActionTimer START operation. Reads `StartValueRange`, `RestartValueRange`, `Rate` (default 1.0), and `Repeating` (default false).

Also in this package: BuilderActionSetAlarm, BuilderActionTimer, BuilderActionTimerContinue, BuilderActionTimerModify, BuilderActionTimerPause, BuilderActionTimerRestart, BuilderActionTimerStop, BuilderBodyMotionTimer, BuilderHeadMotionTimer, BuilderMotionTimer, BuilderSensorAlarm, BuilderSensorTimer

Complete API:
  public ActionTimer build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderActionTimer readConfig(JsonElement data)
  public Timer.TimerAction getTimerAction()
  public double[] getStartValueRange(BuilderSupport builderSupport)
  public double[] getRestartValueRange(BuilderSupport builderSupport)
  public double getRate(BuilderSupport builderSupport)
  public boolean isRepeating(BuilderSupport support)

Fields:
protected final NumberArrayHolder startValueRange
protected final NumberArrayHolder restartValueRange
protected final DoubleHolder rate
protected final BooleanHolder repeating
