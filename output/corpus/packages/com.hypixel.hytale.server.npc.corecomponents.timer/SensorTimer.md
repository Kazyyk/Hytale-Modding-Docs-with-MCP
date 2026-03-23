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
