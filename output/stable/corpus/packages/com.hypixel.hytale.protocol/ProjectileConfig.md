# ProjectileConfig

Type: class | Package: com.hypixel.hytale.protocol

public class ProjectileConfig

Protocol data structure in the Projectile/Combat group.

## Fields

- PhysicsConfig physicsConfig
- Model model
- double launchForce
- Vector3f spawnOffset
- Direction rotationOffset
- Map<`InteractionType`, ``Integer``> interactions
- int launchLocalSoundEventIndex
- int projectileSoundEventIndex

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 163
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 171
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 163 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ProjectileConfig deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ProjectileConfig` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ProjectileConfig` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ProjectileConfig` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Direction
- InteractionType
- Model
- PhysicsConfig
- Vector3f
