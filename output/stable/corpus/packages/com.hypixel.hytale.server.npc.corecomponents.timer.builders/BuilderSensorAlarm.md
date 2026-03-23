# BuilderSensorAlarm

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.timer.builders | Extends: BuilderSensorBase

public class BuilderSensorAlarm extends BuilderSensorBase

Builder for SensorAlarm. Reads `Name` (alarm name), `State` (SET/UNSET/PASSED), and `Clear` (boolean, default false) from JSON configuration.

Also in this package: BuilderActionSetAlarm, BuilderActionTimer, BuilderActionTimerContinue, BuilderActionTimerModify, BuilderActionTimerPause, BuilderActionTimerRestart, BuilderActionTimerStart, BuilderActionTimerStop, BuilderBodyMotionTimer, BuilderHeadMotionTimer, BuilderMotionTimer, BuilderSensorTimer

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public SensorAlarm build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Sensor> readConfig(JsonElement data)
  public Alarm getAlarm(BuilderSupport support)
  public SensorAlarm.State getState(BuilderSupport support)
  public boolean isClear(BuilderSupport support)

Fields:
protected final StringHolder name
protected final EnumHolder<SensorAlarm.State> state
protected final BooleanHolder clear
