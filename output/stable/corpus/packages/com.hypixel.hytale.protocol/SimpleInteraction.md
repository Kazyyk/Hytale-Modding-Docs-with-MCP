# SimpleInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: Interaction

public class SimpleInteraction extends Interaction

Adds next/failed chain pointers to Interaction base. Most concrete interactions extend this.

## Fields

- int next
- int failed

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 19
- VARIABLE_FIELD_COUNT | 5
- VARIABLE_BLOCK_START | 39
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 19 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static SimpleInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `SimpleInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `SimpleInteraction` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `SimpleInteraction` into the given buffer. Returns bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Interaction

Known subclasses: ApplyEffectInteraction, ApplyForceInteraction, ApplyForceInteraction, BuilderToolInteraction, BuilderToolInteraction, CameraInteraction, CameraInteraction, CancelChainInteraction, ChainFlagInteraction, ChangeStatInteraction, ClearEntityEffectInteraction, ConditionInteraction, ConditionInteraction, CooldownConditionInteraction, EffectConditionInteraction, IncrementCooldownInteraction, ModifyInventoryInteraction, MovementConditionInteraction, MovementConditionInteraction, PlaceBlockInteraction, PlaceBlockInteraction, ProjectileInteraction, RemoveEntityInteraction, RepeatInteraction, RepeatInteraction, ResetCooldownInteraction, RunOnBlockTypesInteraction, RunRootInteraction, SelectInteraction, SelectInteraction, SimpleBlockInteraction, SimpleBlockInteraction, SimpleInstantInteraction, SpawnDeployableFromRaycastInteraction, StatsConditionInteraction, ToggleGliderInteraction, TriggerCooldownInteraction, UseEntityInteraction

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static SimpleInteraction deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public SimpleInteraction clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public int next
public int failed
