# KillFeedEvent

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage.event

public class KillFeedEvent

Container class for the three cancellable ECS events dispatched during kill feed message generation by DeathSystems.KillFeed. These events allow other systems to customize or cancel the kill feed display.

## Inner Types

- KillFeedEvent.KillerMessage -- event dispatched on the killer entity to set the killer's display name
- KillFeedEvent.DecedentMessage -- event dispatched on the dying entity to set the victim's display name
- KillFeedEvent.Display -- event dispatched for the final kill feed broadcast

## Related Types

- DeathSystems.KillFeed -- the system that dispatches these events
- Damage -- the damage event carried through the kill feed
