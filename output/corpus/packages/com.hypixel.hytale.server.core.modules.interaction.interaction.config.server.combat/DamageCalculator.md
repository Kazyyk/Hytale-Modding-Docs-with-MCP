# DamageCalculator

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat

public class DamageCalculator

## Fields

- protected DamageCalculator.Type type
- protected DamageClass damageClass
- protected Object2FloatMap<String> baseDamageRaw
- protected float sequentialModifierStep
- protected float sequentialModifierMinimum
- protected float randomPercentageModifier
- protected transient Int2FloatMap baseDamage

## Methods

- protected DamageCalculator()
- public Object2FloatMap<DamageCause> calculateDamage(double durationSeconds)
- private float scaleDamage(double durationSeconds, float damage)
- public DamageCalculator.Type getType()
- public DamageClass getDamageClass()
- public float getSequentialModifierStep()
- public float getSequentialModifierMinimum()
- public boolean equals(Object o)
- public int hashCode()
- public String toString()
