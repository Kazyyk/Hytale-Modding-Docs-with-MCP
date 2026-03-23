# PositionProbeAir

Type: class | Package: com.hypixel.hytale.server.npc.util | Extends: PositionProbeBase

public class PositionProbeAir extends PositionProbeBase

A position probe for NPCs operating in air. Extends `PositionProbeBase` to additionally detect whether the NPC is airborne and whether it is standing on a solid surface.

## Key Methods

- public boolean probePosition( Ref<EntityStore> ref, Box boundingBox, Vector3d position, CollisionResult collisionResult, ComponentAccessor<EntityStore> componentAccessor )
- public boolean isInAir()
- public boolean isOnSolid()
- public String toString()
