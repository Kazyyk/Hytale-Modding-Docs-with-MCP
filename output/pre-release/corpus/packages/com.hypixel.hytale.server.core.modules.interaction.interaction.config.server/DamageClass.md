# DamageClass

Type: enum | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat

public enum DamageClass

Classifies damage types for the combat system. Used by armor to apply class-specific damage modifiers and enhancements.

## Enum Constants

- UNKNOWN | Unclassified damage.
- LIGHT | Light attack damage.
- CHARGED | Charged attack damage.
- SIGNATURE | Signature attack damage.

## Fields

- EnumCodec<DamageClass> CODEC

## See Also

- DamageCalculator -- uses `DamageClass` for armor modifier resolution
- DamageEntityInteraction -- applies damage class during armor calculations
