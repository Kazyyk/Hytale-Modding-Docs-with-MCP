# DebugSupport.PathWaypointVisData

Type: record | Package: com.hypixel.hytale.server.npc.role.support

public record PathWaypointVisData(Vector3d position, boolean isCurrentTarget, boolean isEndNode, boolean isSeekTarget)

Inner record of `DebugSupport`. Stores visualization data for a single waypoint along an NPC's path, including its position and flags indicating whether it is the current navigation target, the end node, or a seek target.

## Components

- Vector3d position
- boolean isCurrentTarget
- boolean isEndNode
- boolean isSeekTarget

Also in this package: CombatSupport, DebugFlagsChangeListener, DebugSupport, EntityList, EntitySupport, EntityVisData, LineOfSightBuffer, LineOfSightEntityBuffer, MarkedEntitySupport, PositionCache, RangeType, RayPredicate, RoleStats, SensorVisData, StateSupport, WorldSupport
