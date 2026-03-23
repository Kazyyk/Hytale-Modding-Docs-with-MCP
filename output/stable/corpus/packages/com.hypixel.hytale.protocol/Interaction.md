# Interaction

Type: abstract class | Package: com.hypixel.hytale.protocol

public abstract class Interaction

Abstract polymorphic base class for the interaction/ability system. Uses VarInt type-ID discriminated union with 45 concrete subtypes. Contains common fields for effects, timing, rules, and camera.

## Fields

- WaitForDataFrom waitForDataFrom
- InteractionEffects effects
- float horizontalSpeedMultiplier
- float runTime
- boolean cancelOnItemChange
- Map<`GameMode`, `InteractionSettings`> settings
- InteractionRules rules
- int``[] tags
- InteractionCameraSettings camera

## Serialization Layout

- MAX_SIZE | 1,677,721,605

## Methods

Concrete subtypes are identified by a VarInt type ID prefix during deserialization.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- InteractionEffects
- InteractionRules
- InteractionSettings
- InteractionCameraSettings
- InteractionType
- GameMode

Known subclasses: ChainingInteraction, ChainingInteraction, ChangeActiveSlotInteraction, ChangeActiveSlotInteraction, ChargingInteraction, ChargingInteraction, DamageEntityInteraction, DamageEntityInteraction, FirstClickInteraction, FirstClickInteraction, MemoriesConditionInteraction, MemoriesConditionInteraction, ParallelInteraction, ParallelInteraction, ReplaceInteraction, ReplaceInteraction, SerialInteraction, SerialInteraction, SimpleInteraction, SimpleInteraction

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static Interaction deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int getTypeId()
  public abstract int serialize(ByteBuf var1)
  public abstract int computeSize()
  public int serializeWithTypeId(ByteBuf buf)
  public int computeSizeWithTypeId()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)

Fields:
public static final int MAX_SIZE
public WaitForDataFrom waitForDataFrom
public InteractionEffects effects
public float horizontalSpeedMultiplier
public float runTime
public boolean cancelOnItemChange
public Map<GameMode,InteractionSettings> settings
public InteractionRules rules
public int[] tags
public InteractionCameraSettings camera
