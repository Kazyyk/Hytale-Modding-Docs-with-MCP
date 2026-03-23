# PlayerPingSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: EntityTickingSystem<EntityStore> | Implements: RunWhenPausedSystem<EntityStore>

public class PlayerPingSystem extends EntityTickingSystem<EntityStore> implements RunWhenPausedSystem<EntityStore>

An ECS ticking system that sends periodic ping packets to each connected player to measure round-trip latency. Runs as a last-priority system in the `SEND_PACKET_GROUP`. Implements `RunWhenPausedSystem` so ping continues during game pause. Calls `PacketHandler.tickPing(dt)` for each entity with a `PlayerRef`.

## Related Types

- PlayerConnectionFlushSystem -- flushes packets after ping
