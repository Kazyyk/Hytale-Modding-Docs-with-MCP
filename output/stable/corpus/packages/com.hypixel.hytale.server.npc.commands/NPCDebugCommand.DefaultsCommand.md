# NPCDebugCommand.DefaultsCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: NPCMultiSelectCommandBase

public static class NPCDebugCommand.DefaultsCommand extends NPCMultiSelectCommandBase

Inner class of NPCDebugCommand. Applies the `"default"` debug flag preset to the target NPC(s) by calling `RoleDebugFlags.getPreset("default")`.

## Constructor


public DefaultsCommand()

Registers as sub-command `"defaults"` with translation key `"server.commands.npc.debug.defaults.desc"`.

## Related Types

- NPCDebugCommand -- parent command collection
- NPCDebugCommand.PresetsCommand -- lists available presets
- NPCMultiSelectCommandBase -- base class
