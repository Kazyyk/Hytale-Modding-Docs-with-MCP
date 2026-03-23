# BodyMotionTimer

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.timer | Extends: MotionTimer<BodyMotion> | Implements: BodyMotion

public class BodyMotionTimer extends MotionTimer<BodyMotion> implements BodyMotion

Concrete body motion timer. Wraps a `BodyMotion` with a random time limit. Delegates `getSteeringMotion()` to the wrapped motion.
