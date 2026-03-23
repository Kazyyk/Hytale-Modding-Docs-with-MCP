# ChainingInteraction.Data

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Implements: Component<EntityStore>

public static class ChainingInteraction.Data implements Component<EntityStore>

Per-entity `EntityStore` component that tracks chaining state. Maintains an `Object2IntMap<String>` for anonymous chain indices and a separate `namedMap` for named chain IDs (`ChainId`). Tracks the timestamp of the last attack for chaining allowance calculations via `getTimeSinceLastAttackInSeconds()`.
