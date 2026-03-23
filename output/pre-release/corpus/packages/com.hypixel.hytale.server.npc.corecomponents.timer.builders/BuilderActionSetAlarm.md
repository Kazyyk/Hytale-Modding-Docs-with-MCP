# BuilderActionSetAlarm

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.timer.builders | Extends: BuilderActionBase

public class BuilderActionSetAlarm extends BuilderActionBase

Builder for ActionSetAlarm. Reads `Name` (alarm name) and `DurationRange` (temporal range) from JSON configuration. Duration range of `["P0D", "P0D"]` will unset the alarm.

Also in this package: BuilderActionTimer, BuilderActionTimerContinue, BuilderActionTimerModify, BuilderActionTimerPause, BuilderActionTimerRestart, BuilderActionTimerStart, BuilderActionTimerStop, BuilderBodyMotionTimer, BuilderHeadMotionTimer, BuilderMotionTimer, BuilderSensorAlarm, BuilderSensorTimer

Complete API:
  public ActionSetAlarm build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderActionSetAlarm readConfig(JsonElement data)
  public Alarm getAlarm(BuilderSupport support)
  public TemporalAmount[] getDurationRange(BuilderSupport support)

Fields:
public static final TemporalAmount MIN_TIME
public static final TemporalAmount MAX_TIME
protected final StringHolder name
protected final TemporalArrayHolder durationRange
