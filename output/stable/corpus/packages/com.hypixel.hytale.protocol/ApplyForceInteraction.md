# ApplyForceInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: SimpleInteraction

public class ApplyForceInteraction extends SimpleInteraction

An interaction (type ID 26) that applies directional forces to entities over a duration, optionally waiting for ground contact. Extends SimpleInteraction.

## Fields

- VelocityConfig velocityConfig
- ChangeVelocityType changeVelocityType
- AppliedForce`[] forces
- float duration
- FloatRange verticalClamp
- boolean waitForGround
- boolean waitForCollision
- float groundCheckDelay
- float collisionCheckDelay
- int groundNext
- int collisionNext
- float raycastDistance
- float raycastHeightOffset
- RaycastMode raycastMode

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 80
- VARIABLE_FIELD_COUNT | 6
- VARIABLE_BLOCK_START | 104
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 80 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ApplyForceInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ApplyForceInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ApplyForceInteraction` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ApplyForceInteraction` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AppliedForce
- ApplyForceState
- Interaction
