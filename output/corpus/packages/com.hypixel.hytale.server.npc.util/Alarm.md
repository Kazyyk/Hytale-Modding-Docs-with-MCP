# Alarm

Type: class | Package: com.hypixel.hytale.server.npc.util | Extends: PersistentParameter

public class Alarm extends PersistentParameter<Instant>

A persistent NPC parameter that stores an `Instant` timestamp. Used to set time-based alarms that can be checked against the current time to determine if they have passed.

## Key Methods

- public static final BuilderCodec<Alarm> CODEC = BuilderCodec.builder(Alarm.class, Alarm::new)
- public boolean isSet()
- public boolean hasPassed(Instant instant)
