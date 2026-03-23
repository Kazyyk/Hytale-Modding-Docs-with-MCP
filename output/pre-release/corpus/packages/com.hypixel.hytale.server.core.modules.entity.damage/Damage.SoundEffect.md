# Damage.SoundEffect

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage

public static class Damage.SoundEffect

Wraps a sound event index for impact sound effects attached to a Damage event. Used by both `Damage.IMPACT_SOUND_EFFECT` and `Damage.PLAYER_IMPACT_SOUND_EFFECT` meta keys.

## Constructor


public SoundEffect(int soundEventIndex)

Creates a sound effect wrapper with the given sound event asset index.

## Methods


public int getSoundEventIndex()

Returns the sound event asset index.


public void setSoundEventIndex(int soundEventIndex)

Sets the sound event asset index.

## Fields

- soundEventIndex | int | private | Index into the sound event asset map.

## Related Types

- Damage -- the damage event that carries sound effects via meta store
- DamageSystems.ApplySoundEffects -- system that plays these sounds

Also in this package: ApplyDamage, ApplyParticles, ApplySoundEffects, ArmorDamageReduction, ArmorKnockbackReduction, ArmorResistanceModifiers, CameraEffect, CanBreathe, CheckBrokenItemsRespawnSystem, ClearEntityEffects, ClearEntityEffectsRespawnSystem, ClearHealth, ClearInteractions, ClearInteractionsRespawnSystem, ClearRespawnUI, CommandSource, CorpseRemoval, Damage, DamageArmor, DamageAttackerTool (and 52 more)

Complete API:
  public void setSoundEventIndex(int soundEventIndex)
  public int getSoundEventIndex()

Fields:
private int soundEventIndex
