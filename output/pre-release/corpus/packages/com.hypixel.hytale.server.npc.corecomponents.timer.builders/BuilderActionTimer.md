# BuilderActionTimer

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.timer.builders | Extends: BuilderActionBase

public abstract class BuilderActionTimer extends BuilderActionBase

Abstract base builder for all timer control actions. Reads the `Name` (timer name) from JSON configuration. Subclasses implement specific timer operations.

Known subclasses: BuilderActionTimerContinue, BuilderActionTimerModify, BuilderActionTimerPause, BuilderActionTimerRestart, BuilderActionTimerStart, BuilderActionTimerStop

Also in this package: BuilderActionSetAlarm, BuilderActionTimerContinue, BuilderActionTimerModify, BuilderActionTimerPause, BuilderActionTimerRestart, BuilderActionTimerStart, BuilderActionTimerStop, BuilderBodyMotionTimer, BuilderHeadMotionTimer, BuilderMotionTimer, BuilderSensorAlarm, BuilderSensorTimer

Complete API:
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderActionTimer readConfig(JsonElement data)
  public abstract Timer.TimerAction getTimerAction()
  public Timer getTimer(BuilderSupport support)

Fields:
protected final StringHolder name
