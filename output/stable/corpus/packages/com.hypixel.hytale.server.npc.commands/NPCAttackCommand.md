# NPCAttackCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractCommandCollection

public class NPCAttackCommand extends AbstractCommandCollection

Implements `/npc attack`. A command collection with two sub-commands for overriding and clearing an NPC's attack interaction sequence via its `CombatSupport`.

## Constructor


public NPCAttackCommand()

Registers as sub-command `"attack"` with translation key `"server.commands.npc.attack.desc"`. Adds SetAttackCommand and ClearAttackCommand as sub-commands.

## Sub-commands

- *(default)* | NPCAttackCommand.SetAttackCommand
- clear | NPCAttackCommand.ClearAttackCommand

## Related Types

- NPCAttackCommand.SetAttackCommand -- sets attack override interactions
- NPCAttackCommand.ClearAttackCommand -- clears attack overrides
- NPCCommand -- parent command collection

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDumpCommand, NPCFreezeCommand (and 28 more)
