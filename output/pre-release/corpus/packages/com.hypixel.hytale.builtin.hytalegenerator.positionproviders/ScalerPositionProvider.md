# ScalerPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class ScalerPositionProvider extends PositionProvider

Wraps another position provider, scaling its output positions by a 3D scale vector. The child provider operates in inverse-scaled bounds so that emitted positions map back to the original coordinate space after scaling.
