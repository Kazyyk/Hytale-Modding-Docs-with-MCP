# BodyMotionLand

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement | Extends: BodyMotionFind

public class BodyMotionLand extends BodyMotionFind

Lands a flying NPC on the ground. Extends `BodyMotionFind` with a goal lenience check. When the NPC is within `goalLenience` of the ground and at low altitude, switches the motion controller to walk mode by calling `requestControllerSwitch("Walk")`.
