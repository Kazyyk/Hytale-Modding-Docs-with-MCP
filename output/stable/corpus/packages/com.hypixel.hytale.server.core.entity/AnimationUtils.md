# AnimationUtils

Type: class | Package: com.hypixel.hytale.server.core.entity

public class AnimationUtils

Utility class for playing animations on entities. Provides static `playAnimation()` methods that look up the entity's `ModelComponent`, resolve animation indices from the model's animation set (optionally via `ItemPlayerAnimations`), and broadcast `PlayAnimation` packets to nearby players.
