# SelectInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.none | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInteraction

public class SelectInteraction extends SimpleInteraction

Area selection interaction that uses a `Selector` to find entities and blocks each tick. Forks into `HitEntity` or `HitBlock` chains per target found. Supports entity match rules, owner ignoring, fail-on conditions, and client-sourced snapshots.
