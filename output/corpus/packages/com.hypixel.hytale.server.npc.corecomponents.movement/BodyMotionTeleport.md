# BodyMotionTeleport

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement | Extends: BodyMotionBase

public class BodyMotionTeleport extends BodyMotionBase

Teleports the NPC to a sensor-provided position with configurable offset range and cooldown. Attempts up to 10 random offset positions, validating each against ground clearance and position validity.

## Constants

- MAX_TRIES | 10 | Maximum teleport position attempts
- MIN_MOVE_CHANGE | 1 | Minimum distance for teleport to be considered movement
- TELEPORT_COOLDOWN | 0.5 | Cooldown in seconds between teleports
