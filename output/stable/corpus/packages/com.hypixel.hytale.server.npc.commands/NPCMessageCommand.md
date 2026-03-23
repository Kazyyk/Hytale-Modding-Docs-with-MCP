# NPCMessageCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractPlayerCommand

public class NPCMessageCommand extends AbstractPlayerCommand

Implements `/npc message`. Sends a beacon message to one or all NPCs. Beacon messages are processed by the NPC's `BeaconSupport` component and can trigger beacon-type sensors in the behavior tree.

## Arguments

- message | String | yes | -- | The message string to send
- expiration | Double | no | 1.0 | Message expiration time in seconds
- --all | flag | no | -- | Send to all NPCs with `BeaconSupport
- entity | entity ID | no | -- | Target NPC (defaults to player's look-target)

## Behavior

- **`--all` mode:** Iterates all entities with `NPCEntity` in parallel, posting the message to each entity's `BeaconSupport` component (if present) with the player as the sender.
- **Single target mode:** Uses NPCCommandUtils to resolve the target NPC and posts the message to its `BeaconSupport`.

## Constructor


public NPCMessageCommand()

Registers as sub-command `"message"` with translation key `"server.commands.npc.message.desc"`.

## Related Types

- NPCCommandUtils -- used for target resolution
- NPCCommand -- parent command collection
