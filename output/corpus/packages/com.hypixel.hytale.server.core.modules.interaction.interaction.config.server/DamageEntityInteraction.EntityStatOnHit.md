# DamageEntityInteraction.EntityStatOnHit

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server | Implements: com.hypixel.hytale.server.core.io.NetworkSerializable

public static class DamageEntityInteraction.EntityStatOnHit implements NetworkSerializable<com.hypixel.hytale.protocol.EntityStatOnHit>

Configures entity stat adjustments that scale based on the number of entities hit during a damage interaction. A base amount is multiplied by a per-hit multiplier from a configured array; hits beyond the array length use a fallback multiplier.

## Codec Properties

- EntityStatId | String | Yes (inherited) | -- | The ID of the EntityStat that will be affected. Validated against `EntityStatType`.
- Amount | float | No (inherited) | -- | The base amount for a single entity hit.
- MultipliersPerEntitiesHit | float[] | No (inherited) | {1.0, 0.6, 0.4, 0.2, 0.1} | Multipliers corresponding to each successive entity hit.
- MultiplierPerExtraEntityHit | float | No (inherited) | 0.05 | Fallback multiplier for hits beyond the array length.

## Constants

- float[] DEFAULT_MULTIPLIERS_PER_ENTITIES_HIT
- float DEFAULT_MULTIPLIER_PER_EXTRA_ENTITY_HIT

## Methods


public void processEntityStatsOnHit(int hits, @Nonnull EntityStatMap statMap)

Applies the stat change. Selects the multiplier from the array for the given hit count (1-indexed), or the extra multiplier if the count exceeds the array length. Calls `statMap.addStatValue` with the product of multiplier and amount.


@Nonnull
public com.hypixel.hytale.protocol.EntityStatOnHit toPacket()

Converts to protocol form.


@Nonnull
@Override
public String toString()

## See Also

- DamageEntityInteraction -- parent interaction
