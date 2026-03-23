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
