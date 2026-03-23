# NPCTestCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractCommandCollection

public class NPCTestCommand extends AbstractCommandCollection

Implements `/npc test`. A command collection for NPC-related diagnostic tests. Currently contains one sub-command for probing position validity.

## Constructor


public NPCTestCommand()

Registers as sub-command `"test"` with translation key `"server.commands.npc.test.desc"`. Adds ProbeTestCommand as a sub-command.

## Sub-commands

- probe | NPCTestCommand.ProbeTestCommand | Tests position validity at the player's location

## Related Types

- NPCTestCommand.ProbeTestCommand
- NPCCommand -- parent command collection

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDescriptorsCommand (and 29 more)
