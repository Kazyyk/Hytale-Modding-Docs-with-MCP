# SensorAlarm.State

Type: enum | Package: com.hypixel.hytale.server.npc.corecomponents.timer

public static enum State implements Supplier<String>

States that a `SensorAlarm` can check against.

## Enum Constants

- SET | "Set" | Alarm is set and has not yet passed.
- UNSET | "Not set" | Alarm has not been set.
- PASSED | "Passed" | Alarm time has elapsed.

Known implementors: CanSpawnPortal, Error, Error, InstanceKeyNotFound, PortalIsOpen, PortalTypeNotFound

Also in this package: ActionSetAlarm, ActionTimer, BodyMotionTimer, HeadMotionTimer, MotionTimer, SensorAlarm, SensorTimer

Complete API:
  public String asText()
  public String get()

Fields:
private final String asText
