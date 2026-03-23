# NPCAttackCommand.SetAttackCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: NPCWorldCommandBase

public static class NPCAttackCommand.SetAttackCommand extends NPCWorldCommandBase

Inner class of NPCAttackCommand. Sets attack override interactions on the target NPC's `CombatSupport`. Clears existing overrides before adding the new interaction IDs.

## Arguments

- attack | List<Interaction> | no | List of interaction assets to set as attack overrides

## Constructor


public SetAttackCommand()

Registers with empty name (default sub-command) and translation key `"server.commands.npc.attack.desc"`.

## Related Types

- NPCAttackCommand -- parent command collection
- NPCAttackCommand.ClearAttackCommand -- clears attack overrides
- NPCWorldCommandBase -- base class

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDescriptorsCommand (and 29 more)

Complete API:
  protected void execute(CommandContext context, NPCEntity npc, World world, Store<EntityStore> store, Ref<EntityStore> ref)

Fields:
private final OptionalArg<List<Interaction>> attackArg
