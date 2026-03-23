# NPCAttackCommand.ClearAttackCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: NPCWorldCommandBase

public static class NPCAttackCommand.ClearAttackCommand extends NPCWorldCommandBase

Inner class of NPCAttackCommand. Clears all attack interaction overrides on the target NPC by calling `npc.getRole().getCombatSupport().clearAttackOverrides()`.

## Constructor


public ClearAttackCommand()

Registers as sub-command `"clear"` with translation key `"server.commands.npc.attack.clear.desc"`.

## Related Types

- NPCAttackCommand -- parent command collection
- NPCAttackCommand.SetAttackCommand -- sets attack overrides
- NPCWorldCommandBase -- base class

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDumpCommand, NPCFreezeCommand (and 28 more)

Complete API:
  protected void execute(CommandContext context, NPCEntity npc, World world, Store<EntityStore> store, Ref<EntityStore> ref)
