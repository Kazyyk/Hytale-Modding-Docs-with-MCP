# NPCFreezeCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractWorldCommand

public class NPCFreezeCommand extends AbstractWorldCommand

Implements `/npc freeze`. Pauses NPC behavior ticking by adding the `Frozen` ECS component to target entities.

## Arguments

- --all | flag | no | Freeze all NPCs and items in the world
- --toggle | flag | no | Toggle freeze state on the target NPC
- entity | entity ID | no | Target NPC (defaults to player's look-target)

## Behavior

- **`--all` mode:** Iterates all entities with `NPCEntity` component in parallel, adding `Frozen`. Also freezes all `ItemComponent` entities and makes them `Interactable`.
- **Single target mode:** Uses NPCCommandUtils to resolve the target NPC.
  - With `--toggle`: removes `Frozen` if present, or adds it if absent.
  - Without `--toggle`: always adds `Frozen`.

## Constructor


public NPCFreezeCommand()

Registers as sub-command `"freeze"` with translation key `"server.commands.npc.freeze.desc"`.

## Related Types

- NPCThawCommand -- unfreezes NPCs (inverse operation)
- NPCStepCommand -- steps frozen NPCs one tick at a time
- NPCCommandUtils -- used for single-target resolution
- NPCCommand -- parent command collection
