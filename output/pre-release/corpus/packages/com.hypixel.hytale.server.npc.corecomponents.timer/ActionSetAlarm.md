# ActionSetAlarm

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.timer | Extends: ActionBase

public class ActionSetAlarm extends ActionBase

NPC action that sets or cancels a named persistent alarm timer. Duration is randomly selected from a configurable range. When the max duration is zero, the alarm is cancelled instead of set.

## Fields

- alarm | Alarm | The named alarm to set/cancel.
- minDuration | TemporalAmount | Minimum alarm duration.
- randomVariation | long | Range of random variation in seconds.
- cancel | boolean | If true, unsets the alarm instead of setting it.

## Related Types

- BuilderActionSetAlarm -- JSON builder for this action
- SensorAlarm -- sensor checking alarm state

Also in this package: ActionTimer, BodyMotionTimer, HeadMotionTimer, MotionTimer, SensorAlarm, SensorTimer, State

Complete API:
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)

Fields:
protected final Alarm alarm
protected final TemporalAmount minDuration
protected final long randomVariation
protected final boolean cancel
