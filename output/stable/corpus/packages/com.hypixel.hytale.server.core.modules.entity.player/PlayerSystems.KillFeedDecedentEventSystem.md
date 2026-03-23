# PlayerSystems.KillFeedDecedentEventSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: EntityEventSystem<EntityStore, KillFeedEvent.DecedentMessage>

public static class PlayerSystems.KillFeedDecedentEventSystem extends EntityEventSystem<EntityStore, KillFeedEvent.DecedentMessage>

An ECS event system that handles `KillFeedEvent.DecedentMessage` events for player entities. Provides the player's display name (from `DisplayNameComponent` or falling back to `PlayerRef.getUsername()`) as the victim name in kill feed messages.

## Related Types

- PlayerSystems -- parent container class
