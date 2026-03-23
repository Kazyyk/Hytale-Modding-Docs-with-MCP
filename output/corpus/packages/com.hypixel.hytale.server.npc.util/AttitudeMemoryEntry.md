# AttitudeMemoryEntry

Type: class | Package: com.hypixel.hytale.server.npc.util | Implements: Tickable

public class AttitudeMemoryEntry implements Tickable

A tickable entry representing a temporary attitude override for an NPC. Tracks an `Attitude` value with a decaying duration timer.

## Key Methods

- public void tick(float dt)
- public double getRemainingDuration()
- public double getInitialDuration()
- public Attitude getAttitudeOverride()
- public boolean isExpired()
