# NPCDebugCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: AbstractCommandCollection

public class NPCDebugCommand extends AbstractCommandCollection

Implements `/npc debug`. A command collection for managing `RoleDebugFlags` on NPC entities. Debug flags control which debug overlays and trace outputs are active for an NPC (state display, sensor traces, pathfinder visualization, collision display, etc.).

When debug flags are modified, the NPC's `Nameplate` component is removed to avoid conflicts with debug display rendering.

## Constructor


public NPCDebugCommand()

Registers as sub-command `"debug"` with translation key `"server.commands.npc.debug.desc"`.

## Sub-commands

- show | ShowCommand | Displays current debug flags on the target NPC
- set | SetCommand | Replaces debug flags with the specified set
- toggle | ToggleCommand | Toggles individual debug flags on/off
- defaults | DefaultsCommand | Applies the "default" preset flags
- clear | ClearCommand | Removes all debug flags
- presets | PresetsCommand | Lists available flag presets

## Related Types

- NPCDebugCommand.ShowCommand
- NPCDebugCommand.SetCommand
- NPCDebugCommand.ToggleCommand
- NPCDebugCommand.DefaultsCommand
- NPCDebugCommand.ClearCommand
- NPCDebugCommand.PresetsCommand
- NPCCommand -- parent command collection
