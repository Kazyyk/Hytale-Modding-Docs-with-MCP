# PlayerConnectionFlushSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: EntityTickingSystem<EntityStore> | Implements: RunWhenPausedSystem<EntityStore>

public class PlayerConnectionFlushSystem extends EntityTickingSystem<EntityStore> implements RunWhenPausedSystem<EntityStore>

An ECS ticking system that flushes outbound network packets for each player connection. Runs as the last system in the tick (after `SEND_PACKET_GROUP` and `PlayerPingSystem`). Only executes if `Constants.FORCE_NETWORK_FLUSH` is enabled. Implements `RunWhenPausedSystem` so it runs even when the game is paused.

## Related Types

- PlayerPingSystem -- runs before this system in the flush chain
