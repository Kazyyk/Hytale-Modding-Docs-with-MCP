# Jitter3dPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class Jitter3dPositionProvider extends PositionProvider

Wraps another position provider, applying random 3D jitter to each emitted position using a seeded RNG field. Uses spherical rotation for uniform 3D distribution. Positions outside bounds after jitter are discarded.
