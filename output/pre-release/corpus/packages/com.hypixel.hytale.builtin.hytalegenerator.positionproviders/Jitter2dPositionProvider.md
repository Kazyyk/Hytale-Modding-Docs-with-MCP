# Jitter2dPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class Jitter2dPositionProvider extends PositionProvider

Wraps another position provider, applying random 2D (XZ-plane) jitter to each emitted position using a seeded RNG field. Positions that fall outside the context bounds after jitter are discarded.
