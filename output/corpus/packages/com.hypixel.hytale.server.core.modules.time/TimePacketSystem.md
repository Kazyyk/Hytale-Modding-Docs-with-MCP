# TimePacketSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.time | Extends: DelayedSystem<EntityStore>

public class TimePacketSystem extends DelayedSystem<EntityStore>

Broadcasts the current game time to all players at 1-second intervals when game time is not paused.

## Methods

- public void delayedTick(float dt, int systemIndex, Store<EntityStore> store)
