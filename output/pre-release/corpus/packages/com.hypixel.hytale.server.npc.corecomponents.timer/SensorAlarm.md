# SensorAlarm

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.timer | Extends: SensorBase

public class SensorAlarm extends SensorBase

NPC sensor that checks the state of a named persistent alarm. Supports three states: SET (alarm exists and has not passed), UNSET (alarm not set), and PASSED (alarm time has elapsed). Optionally clears the alarm when PASSED is detected.

## Fields

- alarm | Alarm | The named alarm to check.
- state | SensorAlarm.State | The state to match against.
- clear | boolean | Whether to clear the alarm on PASSED match.

## Related Types

- ActionSetAlarm -- action that sets alarms
- SensorAlarm.State -- alarm state enum
- BuilderSensorAlarm -- JSON builder for this sensor

Also in this package: ActionSetAlarm, ActionTimer, BodyMotionTimer, HeadMotionTimer, MotionTimer, SensorTimer, State

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()

Fields:
protected final Alarm alarm
protected final SensorAlarm.State state
protected final boolean clear
