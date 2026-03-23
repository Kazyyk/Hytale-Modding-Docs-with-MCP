# BodyMotionPath

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world | Extends: BodyMotionBase

public class BodyMotionPath extends BodyMotionBase

Path-following body motion with configurable shape (LINE, LOOP, POINTS, CHAIN), direction, node delays, observation sectors, and path-width wandering. Uses `SteeringForcePursue` and `SteeringForceRotate` for movement. Each instance has a corresponding `BuilderBodyMotionPath` class for JSON deserialization.
