# NPCDumpCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: NPCWorldCommandBase

public class NPCDumpCommand extends NPCWorldCommandBase

Implements `/npc dump`. Dumps the complete NPC role state to the plugin logger for debugging. Traverses the role's component tree recursively using `IAnnotatedComponent` and `IAnnotatedComponentCollection` interfaces.

Supports two output formats: a plain-text hierarchical dump (default) and a JSON dump (with `--json` flag). The JSON format produces a nested structure with `name`, `index`, `children`, and `parameters` fields.

## Arguments

- --json | flag | no | Output in JSON format instead of plain text

## Constructor


public NPCDumpCommand()

Registers as sub-command `"dump"` with translation key `"server.commands.npc.dump.desc"`.

## Related Types

- NPCWorldCommandBase -- base class providing NPC target resolution
- NPCCommand -- parent command collection
