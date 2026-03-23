# FlockDeathSystems

Type: class | Package: com.hypixel.hytale.server.flock | Extends: java.lang.Object

public class FlockDeathSystems

ECS systems that handle flock membership changes on entity death.

## Inner Classes

### EntityDeath


public static class EntityDeath extends DeathSystems.OnDeathSystem

Fires when a non-player living entity dies. Removes FlockMembership unless `Role.isCorpseStaysInFlock()` is `true`. Also notifies the attacker's flock of the kill via `Flock.onTargetKilled()`.

### PlayerDeath


public static class PlayerDeath extends DeathSystems.OnDeathSystem

Fires when a player dies. Removes FlockMembership unconditionally.

## Related Types

- FlockMembership -- removed on death
- Flock -- receives kill notifications
