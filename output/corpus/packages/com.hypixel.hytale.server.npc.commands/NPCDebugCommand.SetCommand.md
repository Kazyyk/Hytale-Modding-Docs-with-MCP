# NPCDebugCommand.SetCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: NPCMultiSelectCommandBase

public static class NPCDebugCommand.SetCommand extends NPCMultiSelectCommandBase

Inner class of NPCDebugCommand. Replaces all debug flags on the target NPC(s) with the specified set. The `flags` argument is a comma-separated list of `RoleDebugFlags` names.

## Arguments

- flags | String | yes | Comma-separated list of debug flag names

## Constructor


public SetCommand()

Registers as sub-command `"set"` with translation key `"server.commands.npc.debug.set.desc"`.

## Related Types

- NPCDebugCommand -- parent command collection
- NPCDebugCommand.ToggleCommand -- toggles flags instead of replacing
- NPCMultiSelectCommandBase -- base class
