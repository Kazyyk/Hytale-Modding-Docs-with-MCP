# InteractionChainData

Type: class | Package: com.hypixel.hytale.protocol

public class InteractionChainData

Contextual data for interaction chain execution including proxy entity, hit location, block position, and hit normal.

## Fields

- int entityId
- UUID proxyId
- Vector3f hitLocation
- String hitDetail
- BlockPosition blockPosition
- int targetSlot
- Vector3f hitNormal

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 61
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 61
- MAX_SIZE | 16,384,066

Binary layout: 1 null-bit byte + 61 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static InteractionChainData deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `InteractionChainData` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `InteractionChainData` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `InteractionChainData` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- BlockPosition
- ForkedChainId

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static InteractionChainData deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public InteractionChainData clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public int entityId
public UUID proxyId
public Vector3f hitLocation
public String hitDetail
public BlockPosition blockPosition
public int targetSlot
public Vector3f hitNormal
