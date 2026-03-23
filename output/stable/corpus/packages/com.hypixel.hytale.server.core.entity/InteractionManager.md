# InteractionManager

Type: class | Package: com.hypixel.hytale.server.core.entity | Implements: Component<EntityStore>

public class InteractionManager implements Component<EntityStore>

Per-entity `EntityStore` component that manages all active interaction chains and cooldowns. Maintains a map of active `InteractionChain` instances keyed by chain ID, a `CooldownHandler`, and references to the owning `LivingEntity` and `PlayerRef`. Provides the primary `tick()` method for advancing all chains, methods for starting/cancelling chains, and static utilities for walking interaction trees (`walkInteraction()`). Defines `MAX_REACH_DISTANCE = 8.0` and `DEFAULT_CHARGE_TIMES`.
