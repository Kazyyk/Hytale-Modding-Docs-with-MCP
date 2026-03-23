# NPCPathCommand.PolygonPathCommand

Type: class | Package: com.hypixel.hytale.server.npc.commands | Extends: NPCWorldCommandBase

public static class NPCPathCommand.PolygonPathCommand extends NPCWorldCommandBase

Inner class of NPCPathCommand. Creates a regular polygon path for the target NPC. Generates waypoints for each side of the polygon, with equal turn angles (`2*PI / sides`) and uniform side lengths.

## Arguments

- sides | Integer | yes | -- | Number of sides (must be > 0)
- length | Double | no | 5.0 | Length of each side in blocks (must be > 0)

## Constructor


public PolygonPathCommand()

Registers as sub-command `"polygon"` with translation key `"server.commands.npc.path.polygon.desc"`.

## Related Types

- NPCPathCommand -- parent command collection
- NPCPathCommand.SetPathCommand -- freeform path variant
- NPCWorldCommandBase -- base class
