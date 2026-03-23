# NPCRoleCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: NPCWorldCommandBase

public class NPCRoleCommand extends NPCWorldCommandBase

Implements `/npc role`. Changes the role of a target NPC at runtime by queueing a role change via `RoleChangeSystem.requestRoleChange()`. If a role change is already pending, the command fails with an error message.

Also provides a usage variant (no role argument) that displays the NPC's current role name.

## Arguments

- role | BuilderInfo | yes | The new NPC role (uses `NPCCommand.NPC_ROLE` argument type)

## Constructor


public NPCRoleCommand()

Registers as sub-command `"role"` with translation key `"server.commands.npc.role.desc"`. Adds GetRoleCommand as a usage variant.

## Sub-commands

- *(no args)* | NPCRoleCommand.GetRoleCommand | Displays the NPC's current role

## Related Types

- NPCRoleCommand.GetRoleCommand -- displays current role
- NPCWorldCommandBase -- base class
- NPCCommand -- parent command collection

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDumpCommand (and 28 more)

Complete API:
  protected void execute(CommandContext context, NPCEntity npc, World world, Store<EntityStore> store, Ref<EntityStore> ref)

Fields:
private final RequiredArg<BuilderInfo> roleArg
