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
