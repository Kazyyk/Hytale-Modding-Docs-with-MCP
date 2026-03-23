# SensorTimer

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.timer | Extends: SensorBase

public class SensorTimer extends SensorBase

NPC sensor that checks whether a named timer exists and its current value falls within a configurable range. Also checks the timer state (ANY, RUNNING, PAUSED, STOPPED, ELAPSED).

## Fields

- timer | Timer | The named timer to check.
- timerState | Timer.TimerState | Required timer state.
- minTimeRemaining | double | Minimum acceptable value.
- maxTimeRemaining | double | Maximum acceptable value.

## Related Types

- ActionTimer -- action that controls timers
- BuilderSensorTimer -- JSON builder for this sensor

Also in this package: ActionSetAlarm, ActionTimer, BodyMotionTimer, HeadMotionTimer, MotionTimer, SensorAlarm, State

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()
  protected boolean isBetween(double value)

Fields:
protected final double minTimeRemaining
protected final double maxTimeRemaining
protected final Timer timer
protected final Timer.TimerState timerState
