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

Also in this package: ActionSetAlarm, BodyMotionTimer, HeadMotionTimer, MotionTimer, SensorAlarm, SensorTimer, State

Complete API:
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  protected void executeRestartAction()
  protected void executeModifyAction()
  protected void executeContinueAction()
  protected void executePauseAction()
  protected void executeStopAction()
  protected void executeStartAction()

Fields:
protected final Timer timer
protected final Timer.TimerAction action
protected double minStartValue
protected double maxStartValue
protected double minRestartValue
protected double maxValue
protected double rate
protected double increaseValue
protected boolean modifyRepeating
protected boolean repeating
