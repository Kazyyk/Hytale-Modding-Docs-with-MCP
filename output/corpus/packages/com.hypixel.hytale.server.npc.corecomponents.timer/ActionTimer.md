# ActionTimer

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.timer | Extends: ActionBase

public class ActionTimer extends ActionBase

NPC action that controls named timers. Supports six operations: START, PAUSE, STOP, MODIFY, CONTINUE, and RESTART. Each operation has a corresponding builder subclass and constructor overload.

## Fields

- timer | Timer | The named timer to control.
- action | Timer.TimerAction | The operation to perform.
- minStartValue | double | Start range lower bound (START/MODIFY).
- maxStartValue | double | Start range upper bound (START).
- rate | double | Countdown rate (START/MODIFY).
- repeating | boolean | Whether the timer loops (START/MODIFY).

## Related Types

- SensorTimer -- sensor checking timer state
- BuilderActionTimerStart -- builder for START action
- BuilderActionTimerStop -- builder for STOP action
