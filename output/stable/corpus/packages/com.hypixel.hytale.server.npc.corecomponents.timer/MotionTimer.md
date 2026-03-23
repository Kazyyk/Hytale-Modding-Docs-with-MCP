# MotionTimer

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.timer | Extends: MotionBase

public abstract class MotionTimer extends MotionBase

Abstract generic motion wrapper that constrains a child motion to a random time limit. The child motion is activated and deactivated with this wrapper. If the child motion returns `false` from `computeSteering`, the timer also terminates early.

## Fields

- motion | T | The wrapped motion.
- atLeastSeconds | double | Minimum active duration.
- atMostSeconds | double | Maximum active duration.
- activeTime | double | Elapsed active time.
- timeToLive | double | Randomly selected duration for this activation.

## Related Types

- BodyMotionTimer -- concrete body motion timer
- HeadMotionTimer -- concrete head motion timer
- BuilderMotionTimer -- abstract builder base
