# NPCGiveCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: NPCWorldCommandBase

public class NPCGiveCommand extends NPCWorldCommandBase

Implements `/npc give`. Gives an item to a target NPC. If the item has an `Armor` configuration, it is applied as armor via `RoleUtils.setArmor()`. Otherwise, it is placed in the NPC's hand via `RoleUtils.setItemInHand()`.

Also provides a `nothing` sub-command to clear the NPC's held item.

## Arguments

- item | Item | yes | The item asset to give to the NPC

## Constructor


public NPCGiveCommand()

Registers as sub-command `"give"` with translation key `"server.commands.npc.give.desc"`. Adds GiveNothingCommand as a sub-command.

## Sub-commands

- nothing | NPCGiveCommand.GiveNothingCommand

## Related Types

- NPCGiveCommand.GiveNothingCommand -- clears the NPC's held item
- NPCWorldCommandBase -- base class
- NPCCommand -- parent command collection

Also in this package: BlockEventsCommand, ChunkCommand, ChunksCommand, ClearAttackCommand, ClearCommand, DefaultsCommand, DropCommand, EntityEventsCommand, GetRoleCommand, GiveNothingCommand, NPCAllCommand, NPCAppearanceCommand, NPCAttackCommand, NPCBenchmarkCommand, NPCBlackboardCommand, NPCCleanCommand, NPCCommand, NPCCommandUtils, NPCDebugCommand, NPCDumpCommand (and 28 more)

Complete API:
  protected void execute(CommandContext context, NPCEntity npc, World world, Store<EntityStore> store, Ref<EntityStore> ref)

Fields:
private final RequiredArg<Item> itemArg
