# NPCBlackboardCommand.ChunksCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractWorldCommand

public static class NPCBlackboardCommand.ChunksCommand extends AbstractWorldCommand

Inner class of NPCBlackboardCommand. Lists all chunk sections that have `BlockPositionProvider` components in the `ChunkStore`, showing position coordinates, entry count, and searched block set count for each section.

## Constructor


public ChunksCommand()

Registers as sub-command `"chunks"` with translation key `"server.commands.npc.blackboard.chunks.desc"`.

## Related Types

- NPCBlackboardCommand -- parent command collection
- NPCBlackboardCommand.ChunkCommand -- detailed view for a single chunk
