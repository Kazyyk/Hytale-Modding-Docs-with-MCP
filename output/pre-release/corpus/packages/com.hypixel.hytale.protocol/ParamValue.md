# ParamValue

Type: abstract class | Package: com.hypixel.hytale.protocol

public abstract class ParamValue

Base for typed parameter values. Subtypes: StringParamValue(0), BoolParamValue(1), DoubleParamValue(2), IntParamValue(3), LongParamValue(4). Uses VarInt type ID polymorphism.

## Serialization Layout

- MAX_SIZE | 16,384,011

Binary layout: 0 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ParamValue deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ParamValue` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ParamValue` starting at the given offset.


public int computeSize()

Returns the serialized size in bytes.

Known subclasses: BoolParamValue, DoubleParamValue, IntParamValue, LongParamValue, StringParamValue

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static ParamValue deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int getTypeId()
  public abstract int serialize(ByteBuf var1)
  public abstract int computeSize()
  public int serializeWithTypeId(ByteBuf buf)
  public int computeSizeWithTypeId()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)

Fields:
public static final int MAX_SIZE
