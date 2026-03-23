# SpawnDeployableFromRaycastInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: SimpleInteraction

public class SpawnDeployableFromRaycastInteraction extends SimpleInteraction

An interaction type that extends `SimpleInteraction` with chain pointers. Part of the interaction/ability system (type ID 29).

## Fields

- DeployableConfig deployableConfig
- float maxDistance
- Map<``Integer``, ``Float``> costs

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 23
- VARIABLE_FIELD_COUNT | 7
- VARIABLE_BLOCK_START | 51
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 23 bytes of fixed fields + 7 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static SpawnDeployableFromRaycastInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `SpawnDeployableFromRaycastInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `SpawnDeployableFromRaycastInteraction` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `SpawnDeployableFromRaycastInteraction` into the given buffer. Returns bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- DeployableConfig
- Interaction
- SimpleInteraction
