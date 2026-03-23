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
