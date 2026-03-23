# NPCGiveCommand.GiveNothingCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: NPCWorldCommandBase

public static class NPCGiveCommand.GiveNothingCommand extends NPCWorldCommandBase

Inner class of NPCGiveCommand. Clears the NPC's held item by calling `RoleUtils.setItemInHand(npc, null)`.

## Constructor


public GiveNothingCommand()

Registers as sub-command `"nothing"` with translation key `"server.commands.npc.give.nothing.desc"`.

## Related Types

- NPCGiveCommand -- parent command
- NPCWorldCommandBase -- base class
