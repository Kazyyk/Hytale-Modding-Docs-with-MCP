# NPCDebugCommand.ShowCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: NPCMultiSelectCommandBase

public static class NPCDebugCommand.ShowCommand extends NPCMultiSelectCommandBase

Inner class of NPCDebugCommand. Displays the current `RoleDebugFlags` set on the target NPC(s). Shows the role name and a formatted list of active flags, or `<None>` if no flags are set.

## Constructor


public ShowCommand()

Registers as sub-command `"show"` with translation key `"server.commands.npc.debug.show.desc"`.

## Related Types

- NPCDebugCommand -- parent command collection
- NPCMultiSelectCommandBase -- base class for multi-NPC selection
