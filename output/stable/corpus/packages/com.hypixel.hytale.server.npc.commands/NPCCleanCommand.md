# NPCCleanCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractWorldCommand

public class NPCCleanCommand extends AbstractWorldCommand

Implements `/npc clean`. Removes all NPC entities from the current world by iterating over all entities with the `NPCEntity` component type in parallel and issuing `removeEntity` commands with `RemoveReason.REMOVE`.

Requires confirmation (`requiresConfirmation = true`).

## Constructor


public NPCCleanCommand()

Registers as sub-command `"clean"` with translation key `"server.commands.npc.clean.desc"`.

## Related Types

- NPCCommand -- parent command collection
- NPCAllCommand -- spawns all NPC roles (inverse operation)
